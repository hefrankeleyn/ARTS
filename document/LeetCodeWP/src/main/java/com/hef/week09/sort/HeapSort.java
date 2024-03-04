package com.hef.week09.sort;

import java.util.Arrays;

/**
 * @Date 2021/7/1
 * @Author lifei
 */
public class HeapSort {

    public static void main(String[] args) {
        Integer[] a = {9, 8, 7, 5, 3, 1, 2, 0, 1, 0, 0, 9, 9, 1, 2, 2, 1};
        System.out.println(Arrays.toString(a));
        HeapSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i=N/2; i>=1; i--) {
            sink(a, i, N);
        }
        while (N>=1) {
            exch(a, 1, N--);
            sink(a, 1, N);
        }
    }

    private static void sink(Comparable[] a, int lo, int hi) {
        while (lo*2<=hi) {
            int k = lo * 2;
            if (k+1<=hi && less(a, k , k+1)) k++;
            if (less(a, k, lo)) break;
            exch(a, lo, k);
            lo = k;
        }
    }

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i-1].compareTo(a[j-1])<0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i-1];
        a[i-1] = a[j-1];
        a[j-1] = t;
    }
}
