package com.hef.week09.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * 对快速排序对优化
 * @Date 2021/7/1
 * @Author lifei
 */
public class Quick3Way {

    public static void main(String[] args) {
        Integer[] a = {9,0,1, 5, 3, 2, 0, 6};
        System.out.println(Arrays.toString(a));
        shuffle(a);
        System.out.println(Arrays.toString(a));
        QuickSort.sort(a);
        System.out.println(Arrays.toString(a));
    }


    public static void sort(Comparable[] a) {
        shuffle(a);
        sort(a, 0, a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        int lt = lo, i = lo+1, j = hi;
        Comparable v = a[lo];
        while (i<=j) {
            int compare = a[i].compareTo(v);
            if (compare<0) exch(a, lt++, i++);
            else if (compare>0) exch(a, i, j--);
            else i++;
        }
        sort(a, lo, lt-1);
        sort(a, j+1, hi);

    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void shuffle(Comparable[] a) {
        Random random = new Random(27);
        int N = a.length;
        for (int i=0;i<a.length; i++) {
            int k = i + random.nextInt(N-i);
            Comparable t = a[i];
            a[i] = a[k];
            a[k] = t;
        }
    }
}
