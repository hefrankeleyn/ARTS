package com.hef.week04.homework;

/**
 * 查找翻转数组的最小值： 二分查找
 * @Date 2021/4/26
 * @Author lifei
 */
public class Leet153FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        Leet153FindMinimumInRotatedSortedArray findMinimumInRotatedSortedArray = new Leet153FindMinimumInRotatedSortedArray();
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMinimumInRotatedSortedArray.findMin(nums));
    }

    public int findMin(int[] nums) {
        if (nums==null || nums.length==0) return -1;

        int left = 0, right = nums.length-1;
        int r = Integer.MAX_VALUE;
        while (left<=right) {
            int mid = (left + right)/2;
            r = Math.min(r, nums[mid]);
            if (nums[mid]>=nums[0]) {
                if (nums[0]>nums[nums.length-1]) {
                    left = mid +1;
                }else {
                    return nums[0];
                }
            }else {
                right = mid -1;
            }
        }
        return r;
    }
}
