package com.hef.week01.homework;

/**
 *  使用三次翻转解决
 * @Date 2021/4/5
 * @Author lifei
 */
public class Hw02RotateArray {

    public void rotate(int[] nums, int k) {
        if (nums==null || nums.length<=1 || k % nums.length == 0) return;
        int n = k % nums.length;
        // 第一次翻转
        reverse(nums, 0, nums.length-1);
        // 第二次翻转
        reverse(nums, 0, n-1);
        // 第三次翻转
        reverse(nums, n, nums.length -1);

    }

    private void reverse(int[] nums, int beginIndex, int endIndex) {
        while (beginIndex<endIndex) {
            exch(nums, beginIndex++, endIndex--);
        }
    }

    private void exch(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53};
        int k = 82;
        Hw02RotateArray rotateArray = new Hw02RotateArray();
        rotateArray.rotate(nums, k);
        System.out.println(nums);
    }
}
