package com.hef.review.review01sort;

import java.util.Arrays;

/**
 * @Date 2021/7/2
 * @Author lifei
 */
public class MergeSortDownToUp {

    public static void main(String[] args) {
        Integer[] a = {9, 8, 5, 4, 3, 2, 0, 1, 0, 8, 5, 2};
        System.out.println(Arrays.toString(a));
        MergeSortDownToUp.sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        for (int i=1; i<a.length; i+=i) {
            for (int j=0; j<a.length-i; j+=i+i) {
                merge(a, j, j+i-1, Math.min(j+i+i-1, a.length-1));
            }
        }
    }


    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i=lo, j = mid+1;
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
        return a[i].compareTo(a[j])<0;
    }
}
