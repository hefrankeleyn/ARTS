package com.hef.review.review0101sort;

/**
 * @Date 2021/7/21
 * @Author lifei
 */
public class SelectSort {

    public static void sort(Comparable[] a) {
        for (int i=0; i<a.length-1; i++) {
            int k = i;
            for (int j=i+1; j<a.length; j++) {
                if (less(a[j], a[k])) {
                    k = j;
                }
            }
            exch(a, i, k);
        }
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
