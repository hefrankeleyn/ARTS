package com.hef.review.review01sort;

import java.util.Arrays;

/**
 * 堆排序
 * @Date 2021/7/2
 * @Author lifei
 */
public class HeapSort {

    public static void main(String[] args) {
        Integer[] a = {9, 8, 5, 4, 3, 2, 0, 1, 0, 8, 5, 2};
        System.out.println(Arrays.toString(a));
        HeapSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i=N/2; i>=1; --i) {
            sink(a, i, N);
        }

        while (N>=1) {
            exch(a, 1, N--);
            sink(a, 1, N);
        }
    }

    private static void sink(Comparable[] a, int k, int N) {
        while (2*k<=N) {
            int j = 2*k;
            if (j+1<=N && less(a, j, j+1)) j++;
            if (less(a, j, k)) break;
            exch(a, k, j);
            k = j;
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
