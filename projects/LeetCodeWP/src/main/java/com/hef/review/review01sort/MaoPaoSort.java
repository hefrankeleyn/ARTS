package com.hef.review.review01sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * @Date 2021/7/2
 * @Author lifei
 */
public class MaoPaoSort {

    public static void main(String[] args) {
        Integer[] a = {9, 8, 5, 4, 3, 2, 0, 1, 0, 8, 5, 2};
        System.out.println(Arrays.toString(a));
        MaoPaoSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(Comparable[] a) {
        for (int i=0; i<a.length-1; i++) {
            for (int j=0; j<a.length-i-1; j++) {
                if (less(a, j+1, j)) {
                    exch(a, j+1, j);
                }
            }
        }
    }

    private static boolean less(Comparable[] a, int i, int j) {
        return a[i].compareTo(a[j]) <0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
