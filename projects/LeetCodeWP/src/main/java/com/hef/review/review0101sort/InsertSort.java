package com.hef.review.review0101sort;

/**
 * @Date 2021/7/21
 * @Author lifei
 */
public class InsertSort {

    public static void sort(Comparable[] a) {
        if (a==null || a.length==0) return;
        for (int i=1; i<a.length; i++) {
            Comparable v = a[i];
            int j = i-1;
            while (j>=0 && less(v, a[j])) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = v;
        }
    }

    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }
}
