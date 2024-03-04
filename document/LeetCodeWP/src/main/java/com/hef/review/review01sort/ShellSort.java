package com.hef.review.review01sort;

import java.util.Arrays;

/**
 * 希尔排序
 * @Date 2021/7/2
 * @Author lifei
 */
public class ShellSort {

    public static void main(String[] args) {
        Integer[] a = {9, 8, 5, 4, 3, 2, 0, 1, 0, 8, 5, 2};
        System.out.println(Arrays.toString(a));
        ShellSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        int k = 1, N = a.length;
        while (k<N/3) k = k * 3 + 1;
        while (k>=1) {
            for (int i=k; i<N; i++) {
                Comparable v = a[i];
                int j = i-k;
                while (j>=0 && less(v, a[j])) {
                    a[j+k] = a[j];
                    j -= k;
                }
                a[j+k] = v;
            }
            k = k/3;
        }
    }

    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }
}
