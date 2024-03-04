package com.hef.review.review0101sort;

/**
 * @Date 2021/7/21
 * @Author lifei
 */
public class BottomToUpMerge {

    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        if (a==null || a.length==0) return;;
        aux = new Comparable[a.length];
        for (int k=1; k<a.length; k+=k) {
            for (int j=0; j<a.length; j+=k+k) {
                merge(a, j, j+k-1, Math.min(j+k+k-1, a.length-1));
            }
        }
    }

    private static void merge(Comparable[] a, int lo, int mid, int hi) {
        for (int k=lo; k<=hi; k++) {
            aux[k] = a[k];
        }
        int i=lo, j = mid+1;
        for (int k=lo; k<=hi; k++) {
            if (i>mid) aux[k] = a[j++];
            else if (j>hi) aux[k] = a[i++];
            else if (less(a[i], a[j])) aux[k] = a[i++];
            else aux[k]  = a[j++];
        }
        for (int k=lo; k<=hi; k++) {
            a[k] = aux[k];
        }
    }

    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }


}
