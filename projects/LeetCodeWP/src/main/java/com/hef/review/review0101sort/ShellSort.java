package com.hef.review.review0101sort;

/**
 * @Date 2021/7/21
 * @Author lifei
 */
public class ShellSort {

    public static void sort(Comparable[] a) {
        if (a==null || a.length==0) return;
        int k = 1;
        while (k<a.length/3) k = k * 3 + 1;
        while (k>=1) {
            for (int i=k; i<a.length; i++) {
                Comparable v = a[i];
                int j = i-k;
                while (j>=0 && less(v, a[j])) {
                    a[j+k] = a[j];
                    j-=k;
                }
                a[j+k] = v;
            }
            k /= 3;
        }
    }

    private static boolean less(Comparable o1, Comparable o2) {
        return o1.compareTo(o2)<0;
    }
}
