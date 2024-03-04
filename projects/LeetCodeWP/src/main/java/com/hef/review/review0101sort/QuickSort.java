package com.hef.review.review0101sort;

import java.util.*;

/**
 * @Date 2021/7/21
 * @Author lifei
 */
public class QuickSort {

    public static void main(String[] args) {
        Integer[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        if (a==null || a.length==0) return;
        // 将 a 打乱
        shuffle(a);
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi<=lo) {
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi+1;
        while (true) {
            while (less(a[++i], a[lo])) if (i==hi) break;
            while (less(a[lo], a[--j])) if (j==lo) break;
            if (i>=j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }

    public static void shuffle(Comparable[] a) {
        Random random = new Random(37);
        int n  = a.length;
        /*for (int i=n-1; i>=0; i--) {
            exch(a, i, random.nextInt(i+1));
        }*/

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
