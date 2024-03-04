package com.hef.week06;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet152MaximumProductSubarray {

    public static void main(String[] args) {
        Leet152MaximumProductSubarray maximumProductSubarray = new Leet152MaximumProductSubarray();
//        int[] nums = new int[]{2,3,-2,4};
        int[] nums = new int[]{-3,-1,-1};
        int res = maximumProductSubarray.maxProduct(nums);
        System.out.println(res);
    }

    public int maxProduct(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        int n = nums.length;
        int[] dp1 = nums.clone();
        int[] dp2 = nums.clone();
        int max = dp1[0];
        for (int i=1; i<n; i++) {
            int m1 = Math.max(Math.max(dp1[i-1] * dp1[i], dp2[i-1] * dp1[i]), dp1[i]);
            int m2 = Math.min(Math.min(dp1[i-1] * dp1[i], dp2[i-1] * dp2[i]), dp2[i]);
            max = Math.max(Math.max(m1, m2), max);
            dp1[i] = m1;
            dp2[i] = m2;
        }
        return max;
    }
}
