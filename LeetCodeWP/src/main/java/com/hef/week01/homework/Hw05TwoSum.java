package com.hef.week01.homework;

/**
 * description:
 *   方案一： 暴力求解；
 *   由于要返回数组下标： 好像就不能使用双指针的方案
 * author: lifei
 * date: 2021-04-05
 */
public class Hw05TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i<nums.length-1; i++) {
            for (int j = i+1; j<nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
