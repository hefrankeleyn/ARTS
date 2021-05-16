package com.hef.week06;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet198HouseRobber {

    public static void main(String[] args) {
        Leet198HouseRobber leet198HouseRobber = new Leet198HouseRobber();
        int[] nums = new int[]{2,1,1,2};
        int res = leet198HouseRobber.rob(nums);
        System.out.println(res);
    }

    public int rob(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        if (nums.length==1) return nums[0];
        int x = nums[0], y = Math.max(nums[0], nums[1]), res = y;
        for (int i=2;i<nums.length; i++) {
            res = Math.max(x+nums[i], y);
            x = y;
            y = res;
        }
        return res;
    }
}
