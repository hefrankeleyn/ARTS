package com.hef.review.review0101sort;

/**
 * @Date 2021/7/21
 * @Author lifei
 */
public class MaoPaoSort {

    public static void sort(Comparable[] a) {
        for (int i=0; i<a.length-1; i++) {
            for (int j=0; j<a.length-1-i; j++) {
                if (less(a[j+1], a[j])) {
                    exch(a, j+1, j);
                }
            }
        }
    }

    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
