package com.hef.week01.homework;

import java.util.Arrays;

/**
 * 合并两个有序数据： 假定nums1 的容量 能够装下两个数组的内容
 * 思路：
 *    1. 现将第一个数组整体向后移动n个位置；
 *    2. 使用归并排序解决这个问额；
 * @Date 2021/4/5
 * @Author lifei
 */
public class Hw04MergeSortedArray {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n==0) {
            return;
        }else if (m==0) {
            for (int i = 0; i<n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        // 将nums1 整体向后移动 n 位
        for (int i = m-1; i>=0; i--) {
            nums1[i+n] = nums1[i];
        }
        // 使用归并排序解决
        for (int i = 0, x = n, y = 0; i<n+m; ) {
            if (x>=n+m) {
                nums1[i++] = nums2[y++];
                continue;
            }else if (y>=m) {
                nums1[i++] = nums1[x++];
                continue;
            }
            if (nums1[x]>nums2[y]) {
                nums1[i++] = nums2[y++];
            }else if (nums1[x]<nums2[y]) {
                nums1[i++] = nums1[x++];
            }else {
                nums1[i++] = nums1[x++];
                nums1[i++] = nums2[y++];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 =  {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        Hw04MergeSortedArray mergeSortedArray = new Hw04MergeSortedArray();
        System.out.println(Arrays.toString(nums1));
        mergeSortedArray.merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
