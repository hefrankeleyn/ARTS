package com.hef.review.review01sort;

import java.util.*;

/**
 * @Date 2021/7/2
 * @Author lifei
 */
public class QuickSort {

    public static void main(String[] args) {
        Integer[] a = {9, 8, 5, 4, 3, 2, 0, 1, 0, 8, 5, 2};
        System.out.println(Arrays.toString(a));
        QuickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        shuffle(a);
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if(hi<=lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi){
        int i=lo, j = hi+1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) if (i==hi) break;
            while (less(v, a[--j])) if (j==lo) break;
            if (j<=i) break;
            exch(a, i, j);
        }
        exch(a, j, lo);
        return j;
    }

    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }

    private static void shuffle(Comparable[] a) {
        Random random = new Random(23);
        int N = a.length;
        for (int i=0; i<N; i++) {
            int k = i + random.nextInt(N-i);
            exch(a, i, k);
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
