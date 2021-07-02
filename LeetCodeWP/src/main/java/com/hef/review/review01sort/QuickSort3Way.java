package com.hef.review.review01sort;

import java.util.*;

/**
 * @Date 2021/7/2
 * @Author lifei
 */
public class QuickSort3Way {

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
        int lt = lo, i = lo+1, j = hi;
        Comparable v = a[lo];
        while (i<=j) {
            int compare = a[i].compareTo(v);
            if (compare<0) exch(a, i++, lt++);
            else if (compare>0) exch(a, i, j--);
            else i++;
        }
        sort(a, lo, lt-1);
        sort(a, j+1, hi);
    }


    private static void shuffle(Comparable[] a) {
        Random random = new Random(23);
        int N = a.length;
        for (int i=0; i<N; i++) {
            int k = i + random.nextInt(N-i);
            exch(a, k, i);
        }
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
