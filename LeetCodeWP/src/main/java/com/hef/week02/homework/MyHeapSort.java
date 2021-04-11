package com.hef.week02.homework;

import java.util.Arrays;

/**
 * 堆排序：升序和降序
 * @Date 2021/4/11
 * @Author lifei
 */
public class MyHeapSort {

    /**
     * 从大到小排序
     * @param a
     */
    public void sortDesc(Comparable[] a){
        if (a==null || a.length==0) return;
        int n = a.length;
        // 创建出小根队
        for (int i = n/2; i>=1; --i) {
            sinkMin(a, i, n);
        }
        // 每次将最小元素移动到最后
        while (n>1) {
            exch(a, 1, n--);
            sinkMin(a, 1, n);
        }
    }

    private void sinkMin(Comparable[] a, int k, int end) {
        while (2*k<=end) {
            int j = 2*k;
            if (j<end && less(a, j+1, j)) j++;
            if (less(a, k, j)) break;
            exch(a, k, j);
            k = j;
        }
    }

    /**
     * 从小到大排序
     * @param a
     */
    public void sortAsc(Comparable[] a) {
        if (a==null || a.length==0) return;
        int n = a.length;
        // 创建出大根堆
        for (int i=n/2; i>=1; --i) {
            sink(a, i, n);
        }
        // 每一次将最大值移动到最后
        while (n>1) {
            exch(a, 1, n--);
            sink(a, 1, n);
        }
    }


    private void sink(Comparable[] a, int k, int end) {
        while (2*k<=end) {
            int j = 2*k;
            if (j<end && less(a, j,j+1)) j++;
            if (less(a, j, k)) break;
            exch(a, k, j);
            k = j;
        }
    }


    private boolean less(Comparable[] a, int i, int j) {
        return a[i-1].compareTo(a[j-1]) < 0;
    }

    private void exch(Comparable[] a, int i, int j) {
        Comparable temp = a[i-1];
        a[i-1] = a[j-1];
        a[j-1] = temp;
    }

    public static void main(String[] args) {
        Integer[] a = {3, 5, 4, 1, 6,11,0,5,8,1,2,6,3};
        MyHeapSort heapSort = new MyHeapSort();
        System.out.println("源数组： "+Arrays.toString(a));
        heapSort.sortAsc(a);
        System.out.println("升序排序："+Arrays.toString(a));
        heapSort.sortDesc(a);
        System.out.println("降序排序："+Arrays.toString(a));
    }



}
