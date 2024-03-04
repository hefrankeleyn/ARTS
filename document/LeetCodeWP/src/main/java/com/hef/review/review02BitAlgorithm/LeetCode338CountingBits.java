package com.hef.review.review02BitAlgorithm;

import java.util.Arrays;

/**
 * @Date 2021/7/12
 * @Author lifei
 */
public class LeetCode338CountingBits {

    public static void main(String[] args) {
        LeetCode338CountingBits code338CountingBits = new LeetCode338CountingBits();
        int[] res = code338CountingBits.countBits(23);
        System.out.println(Arrays.toString(res));
        int[] res2 = code338CountingBits.countBits02(23);
        System.out.println(Arrays.toString(res2));

    }

    public int[] countBits02(int n) {
        int[] res = new int[n+1];
        int hi = 0;
        for (int k=1; k<=n; k++) {
            if ((k&(k-1))==0) {
                hi = k;
            }
            res[k] = res[k-hi] + 1;
        }
        return res;
    }

    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int k=0; k<=n; k++) {
            res[k] = searchOneNum(k);
        }
        return res;
    }

    private int searchOneNum(int n) {
        int res = 0;
        while(n!=0) {
            n = n & (n-1);
            res++;
        }
        return res;
    }
}
