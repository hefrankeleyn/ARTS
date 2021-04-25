package com.hef.week04.homework;

/**
 * 二分查找
 * @Date 2021/4/26
 * @Author lifei
 */
public class Leet33SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        Leet33SearchInRotatedSortedArray searchInRotatedSortedArray = new Leet33SearchInRotatedSortedArray();
        System.out.println(searchInRotatedSortedArray.search(nums, target));
    }

    public int search(int[] nums, int target) {
        if (nums==null || nums.length==0) return -1;
        int n=nums.length-1, left = 0, right = n;
        while (left<=right) {
            int mid = (left+right)/2;
            if (nums[mid] == target) return mid;
            if (nums[0]<=nums[mid]) {
                if (nums[mid]>target && nums[0]<=target) {
                    right = mid-1;
                }else {
                    left = mid+1;
                }
            }else {
                if (nums[mid]<target && nums[n]>=target) {
                    left = mid +1;
                }else {
                    right = mid -1;
                }
            }
        }
        return -1;
    }
}
