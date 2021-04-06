package com.hef.week01.review01;

import java.util.Arrays;

/**
 * @Date 2021/4/6
 * @Author lifei
 */
public class Leet189RotateArray {

    public void rotate(int[] nums, int k) {
        if (nums==null || nums.length==1 || k%nums.length == 0) return;
        int n = k%nums.length;
        // 第一次旋转
        reverseArray(nums, 0, nums.length-1);
        // 第二次旋转
        reverseArray(nums, 0, n-1);
        // 第三次旋转
        reverseArray(nums, n, nums.length-1);
    }

    private void reverseArray(int[] nums, int beginIndex, int endIndex) {
        while (beginIndex<endIndex) {
            exch(nums, beginIndex++, endIndex--);
        }
    }

    private void exch(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 13;
        Leet189RotateArray rotateArray = new Leet189RotateArray();
        System.out.println(Arrays.toString(nums));
        rotateArray.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }
}
