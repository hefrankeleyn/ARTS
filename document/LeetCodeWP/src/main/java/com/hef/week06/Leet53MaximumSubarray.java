package com.hef.week06;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet53MaximumSubarray {

    public static void main(String[] args) {
        Leet53MaximumSubarray maximumSubarray = new Leet53MaximumSubarray();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int res = maximumSubarray.maxSubArray(nums);
        System.out.println(res);
    }

    public int maxSubArray(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        int[] dp = nums.clone();
        int max = dp[0];
        for (int i=1; i<dp.length; i++) {
            dp[i] = Math.max(dp[i-1], 0) + dp[i];
            max = Math.max(dp[i], max);
        }
        return max;
    }
}
