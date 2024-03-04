package com.hef.week06;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet70ClimbingStairs {

    public static void main(String[] args) {
        Leet70ClimbingStairs climbingStairs = new Leet70ClimbingStairs();
        int res = climbingStairs.climbStairs(3);
        System.out.println(res);
    }

    public int climbStairs(int n) {
        if (n<=2) return n;
        int[] dp = new int[n+1];
        return recursionSolve(n, dp);
    }

    private int recursionSolve(int n, int[] dp) {
        if (n<=2) {
            return n;
        }
        if (dp[n]!=0) {
            return dp[n];
        }
        dp[n] = recursionSolve(n-1, dp) + recursionSolve(n-2, dp);
        return dp[n];
    }


}
