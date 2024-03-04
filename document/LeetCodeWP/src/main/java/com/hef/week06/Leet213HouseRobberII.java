package com.hef.week06;

import java.util.*;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet213HouseRobberII {

    public static void main(String[] args) {
        Leet213HouseRobberII leet213HouseRobberII = new Leet213HouseRobberII();
        int[] nums = new int[]{2,3,2};
        int res = leet213HouseRobberII.rob(nums);
        System.out.println(res);
    }

    public int rob(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        int[] a01 = Arrays.copyOfRange(nums, 1, nums.length);
        int[] a02 = Arrays.copyOfRange(nums, 0, nums.length-1);
        return Math.max(robSolve(a01), robSolve(a02));
    }

    private int robSolve(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        else if (nums.length==1) return nums[0];
        int x = nums[0], y = Math.max(nums[0], nums[1]), res = y;
        for (int i=2; i<nums.length; i++) {
            res = Math.max(x+nums[i], y);
            x = y;
            y = res;
        }
        return res;
    }
}
