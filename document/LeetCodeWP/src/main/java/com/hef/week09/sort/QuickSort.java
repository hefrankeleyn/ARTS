package com.hef.week09.sort;

import java.util.*;

/**
 * @Date 2021/7/1
 * @Author lifei
 */
public class QuickSort {

    public static void main(String[] args) {
        Integer[] a = {9, 1, 4, 2, 8, 1, 3, 0, 2};
        System.out.println(Arrays.toString(a));
        QuickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    /**
     * 重新对数组元素进行排序
     * @param a
     */
    private static void shuffle(Comparable[] a) {
        int N = a.length;
        Comparable[] aux = new Comparable[N];
        Random random = new Random(21);
        for (int i=0; i<a.length; i++) {
            int k = i+random.nextInt(N-i);
            Comparable t = a[k];
            a[k] = a[i];
            a[i] = t;
        }
    }



    public static void sort(Comparable[] a) {
        shuffle(a);
        System.out.println(Arrays.toString(a));
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi<=lo) return;
        int k = partition(a, lo, hi);
        sort(a, lo, k-1);
        sort(a, k+1, hi);
    }

    public static int partition(Comparable[] a, int lo, int hi) {
        int i=lo, j=hi+1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) if (i==hi) break;
            while (less(v, a[--j])) if (j==lo) break;
            if (j<=i) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }
}
