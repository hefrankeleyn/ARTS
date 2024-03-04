package com.hef.week02;

import java.util.*;

/**
 * @Date 2021/4/6
 * @Author lifei
 */
public class Leet1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<nums.length; i++) {
            int matchValue = target - nums[i];
            if (map.containsKey(matchValue)) {
                return new int[]{map.get(matchValue), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("none result");
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        Leet1TwoSum twoSum = new Leet1TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(nums, target)));
    }
}
