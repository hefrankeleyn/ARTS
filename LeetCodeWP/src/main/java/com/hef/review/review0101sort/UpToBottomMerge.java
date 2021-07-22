package com.hef.review.review0101sort;

/**
 * @Date 2021/7/21
 * @Author lifei
 */
public class UpToBottomMerge {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        if (a==null || a.length==0) return;
        aux = new Comparable[a.length];
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (lo>=hi) {
            return;
        }
        int mid = (lo+hi)>>1;
        sort(a, lo, mid);
        sort(a, mid+1, hi);
        merge(a, lo, mid, hi);
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        for (int k=lo; k<=hi; k++) {
            aux[k] = a[k];
        }
        int i=lo, j=mid+1;
        for (int k=lo; k<=hi; k++) {
            if (i>mid) a[k] = aux[j++];
            else if (j>hi) a[k] = aux[i++];
            else if (less(aux[i], aux[j])) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }

    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }
}
