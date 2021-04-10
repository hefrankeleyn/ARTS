package com.hef.week01.review01;

import java.util.Arrays;

/**
 * @Date 2021/4/6
 * @Author lifei
 */
public class Leet26RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        // 将所有重复项置换成第一个元素的值
        for (int i = 0, j = i+1; j<nums.length;) {
            while (j<nums.length && nums[i] == nums[j]) {
                nums[j++] = nums[0];
            }
            i = j;
            j+=1;
        }

        // 从 角标 1开始，将值为nums[0] 进行置换
        int i = 1;
        // 找到值为 nums[0] 的角标
        while (i<nums.length && nums[i] != nums[0]) {
            i++;
        }
        for (int j= i+1; j<nums.length; j++) {
            while (j<nums.length && nums[j] == nums[0]) {
                j++;
            }
            if (i<j && j<nums.length) {
                exch(nums, i++, j);
            }
        }

        return i;
    }

    private void exch(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        Character i = ' ';
        int[] nums = {1};
        System.out.println(Arrays.toString(nums));
        Leet26RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new Leet26RemoveDuplicatesFromSortedArray();
        int n = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        printArray(nums, n);


    }

    private static void printArray(int[] nums, int k) {
        System.out.print("[");
        for (int i = 0; i<k; i++) {
            System.out.print(nums[i]);
            if (i!=k-1) {
                System.out.print(", ");
            }else {
                System.out.println("]");
            }
        }
    }
}
