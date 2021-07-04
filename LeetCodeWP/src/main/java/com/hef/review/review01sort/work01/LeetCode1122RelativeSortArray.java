package com.hef.review.review01sort.work01;

import java.util.Arrays;

/**
 * @Date 2021/7/4
 * @Author lifei
 */
public class LeetCode1122RelativeSortArray {

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19}, arr2 = {2,1,4,3,9,6};
        LeetCode1122RelativeSortArray relativeSortArray = new LeetCode1122RelativeSortArray();
        int[] res = relativeSortArray.relativeSortArray(arr1, arr2);
        System.out.println(Arrays.toString(res));

    }

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int lt = 0;
        for (int v :arr2) {
            for (int i=lt; i<arr1.length; i++) {
                if (arr1[i]==v) {
                    exch(arr1, i, lt++);
                    continue;
                }
            }
        }
        sort(arr1, lt, arr1.length-1);
        return arr1;
    }

    private void sort(int[] a, int lo, int hi) {
        if (hi<=lo) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }

    private int partition(int[] a, int lo, int hi) {
        int i=lo, j=hi+1;
        int v = a[i];
        while (j>=i) {
            while (less(a[++i], v)) if (i==hi) break;
            while (less(v, a[--j])) if (j==lo) break;
            if (i>=j) break;
            exch(a, i, j);
        }
        exch(a, j, lo);
        return j;
    }

    private boolean less(int o1, int o2) {
        return o1<o2;
    }

    private void exch(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
