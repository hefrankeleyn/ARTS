package com.hef.review.review01sort;

import java.util.Arrays;

/**
 * @Date 2021/7/2
 * @Author lifei
 */
public class InsertSort {

    public static void main(String[] args) {
        Integer[] a = {9, 8, 5, 4, 3, 2, 0, 1, 0, 8, 5, 2};
        System.out.println(Arrays.toString(a));
        InsertSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        for (int i=1;i<a.length; i++) {
            Comparable v = a[i];
            int j=i-1;
            while (j>=0 && less(v, a[j])){
                a[j+1]=a[j];
                j--;
            }
            a[j+1] = v;
        }
    }

    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }
}
