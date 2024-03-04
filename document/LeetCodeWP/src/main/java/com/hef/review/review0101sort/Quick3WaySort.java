package com.hef.review.review0101sort;

import java.util.*;

/**
 * @Date 2021/7/21
 * @Author lifei
 */
public class Quick3WaySort {

    public static void main(String[] args) {
        Integer[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1,9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        if (a==null || a.length==0) return;
        shuffle(a);
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo>=hi) return;
        int i=lo+1, j=hi, lt = lo;
        Comparable v  = a[lo];
        while (i<=j) {
            int com = v.compareTo(a[i]);
            if (com==0) i++;
            else if (com>0) exch(a, i++, lt++);
            else exch(a, i, j--);
        }
        sort(a, lo, lt-1);
        sort(a, i, hi);
//        sort(a, j+1, hi);
    }

    private static void shuffle(Comparable[] a) {
        Random random = new Random(37);
        int n = a.length;
        for (int i=0; i<n; i++) {
            int k = i + random.nextInt(n-i);
            exch(a, i, k);
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


}
