package com.hef.week09.sort;

import java.util.Arrays;

/**
 * @Date 2021/7/1
 * @Author lifei
 */
public class ShellSort {

    public static void main(String[] args) {
        Integer[] a = {9, 1, 4, 2, 8, 1, 3, 0, 2};
        System.out.println(Arrays.toString(a));
        ShellSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        int k = 1, N = a.length;
        while (k<N/3) k = k*3 +1;
        while (k>=1) {
            for (int i=k; i<N; i++) {
                for (int j=i; j>=k && less(a, j, j-k); j-=k) {
                    exch(a, j, j-k);
                }
            }
            k = k/3;
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i].compareTo(a[j])<0;
    }
}
