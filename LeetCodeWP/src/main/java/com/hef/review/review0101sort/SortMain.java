package com.hef.review.review0101sort;

import java.util.Arrays;

/**
 * @Date 2021/7/21
 * @Author lifei
 */
public class SortMain {

    public static void main(String[] args) {
        Integer[] a = {9, 0, 1, 2, 5, 2, 3, 1, 0, 3, 9, 0, 1, 2, 5, 2, 3, 1, 0, 3};
        System.out.println(Arrays.toString(a));
        // 插入排序
//        InsertSort.sort(a);
        // 希尔排序
//        ShellSort.sort(a);
        MaoPaoSort.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
