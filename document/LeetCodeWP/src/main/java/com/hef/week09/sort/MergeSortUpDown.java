package com.hef.week09.sort;

import java.util.Arrays;

/**
 * @Date 2021/7/1
 * @Author lifei
 */
public class MergeSortUpDown {

    public static void main(String[] args) {
        Integer[] a = {9, 1, 4, 2, 8, 1, 3, 0, 2};
        System.out.println(Arrays.toString(a));
        MergeSortUpDown.sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi<=lo) return;
        int mid = (lo+hi)/2;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i=lo, j=mid+1;
        for (int k=lo; k<=hi; k++) {
            aux[k] = a[k];
        }
        for (int k=lo; k<=hi; k++) {
            if (i>mid) a[k] = aux[j++];
            else if (j>hi) a[k] = aux[i++];
            else if (less(aux, i, j)) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i].compareTo(a[j]) < 0;
    }
}
