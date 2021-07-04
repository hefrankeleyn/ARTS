package com.hef.review.review01sort.work01;

import java.io.*;
import java.net.URL;
import java.util.Arrays;

/**
 * @Date 2021/7/3
 * @Author lifei
 */
public class LeetCode493ReversePairs {

    public static void main(String[] args) {
        int[] a = {1,3,2,3,1};
        LeetCode493ReversePairs reversePairs = new LeetCode493ReversePairs();
        int res = reversePairs.reversePairs(a);
        System.out.println(res);
        System.out.println((Integer.MAX_VALUE+1)/2>23);
        /*int a = -264, b=-132;
        System.out.println((a+1)/2);  // -131
        System.out.println((a+1)/2>b); // true
        System.out.println(a/2.0);   // -132.0
        System.out.println(a/2.0>b);  // false*/

    }


    private int[] aux;
    public int reversePairs(int[] nums) {
        aux = new int[nums.length];
        int res = 0;
        for (int i=1; i<nums.length; i+=i) {
            for (int j=0; j<nums.length; j+=i+i) {
                res += merge(nums, j, j+i-1, Math.min(j+i+i-1, nums.length-1));
            }
        }
        return res;
    }


    private int merge(int[] a, int lo, int mid, int hi) {
        int i=lo, j = mid+1;
        for (int k=lo; k<=hi; k++) {
            aux[k] = a[k];
        }

        int res = 0;

        for (int x=lo, y=mid+1; x<=mid; x++) {
            // 当 x 和 y 为负数当时候，就不成立了
            //while (y<=hi && (a[x]+1)/2>a[y]) y++;
            while (y<=hi && a[x]/2.0>a[y]) y++;
            res += y-mid-1;
        }

        for (int k=lo; k<=hi; k++) {
            if (i>mid) a[k] = aux[j++];
            else if (j>hi) a[k] = aux[i++];
            else if (aux[i]<aux[j]) a[k] = aux[i++];
            else a[k] = aux[j++];
        }

        return res;
    }

    private static void testValue() {
        URL resource = LeetCode493ReversePairs.class.getClassLoader().getResource("oneV.txt");
        String path = resource.getPath();
        File file=new File(path);
        int maxLen = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String oneLine;
            while ((oneLine=bufferedReader.readLine())!=null){
                String[] values = oneLine.split(",");
                for (String v : values) {
                    int onev = Integer.parseInt(v.trim());
                    try (BufferedReader bufferedReader02 = new BufferedReader(new FileReader(path))) {
                        String oneLine02;
                        while ((oneLine02=bufferedReader02.readLine())!=null){
                            String[] values02 = oneLine.split(",");
                            for (String v02 : values02) {
                                int onev02 = Integer.parseInt(v02.trim());
                                if ((onev+1)/2>onev02 && !(onev/2.0>onev02)) {
                                    System.out.println(onev+","+onev02);
                                }
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(maxLen);
    }


}
