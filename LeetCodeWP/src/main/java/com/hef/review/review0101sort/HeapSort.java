package com.hef.review.review0101sort;

/**
 * @Date 2021/7/21
 * @Author lifei
 */
public class HeapSort {

    public static void sort(Comparable[] a) {
        if (a==null || a.length==0) return;
        int n = a.length;
        for (int i=n/2; i>=1; i--) {
            sink(a, i, n);
        }
        while (n>=1) {
            exch(a, 1, n--);
            sink(a, 1, n);
        }
    }

    private static void sink(Comparable[] a, int k, int n) {
        while (2*k<=n) {
            int j = 2*k;
            if (j+1<=n && less(a, j, j+1)) j++;
            if (!less(a, k, j)) break;
            exch(a, k, j);
            k = j;
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i-1];
        a[i-1] = a[j-1];
        a[j-1] = t;
    }

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i-1].compareTo(a[j-1])<0;
    }
}
