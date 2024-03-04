package com.hef.review.review01sort;

import java.util.Arrays;

/**
 * 选择排序
 * @Date 2021/7/2
 * @Author lifei
 */
public class SelectSort {

    public static void main(String[] args) {
        Integer[] a = {9, 8, 5, 4, 3, 2, 0, 1, 0, 8, 5, 2};
        System.out.println(Arrays.toString(a));
        SelectSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        for (int i=0; i<a.length-1; i++) {
            int t = i;
            for (int j=i+1; j<a.length; j++) {
                if (less(a, j, t)) {
                    t = j;
                }
            }
            exch(a, t, i);
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
