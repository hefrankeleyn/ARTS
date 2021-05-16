package com.hef.week06;

/**
 * 
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet62UniquePaths {

    public static void main(String[] args) {
        Leet62UniquePaths leet62UniquePaths = new Leet62UniquePaths();
        int res = leet62UniquePaths.uniquePaths(3, 2);
        System.out.println(res);
    }


    public int uniquePaths(int m, int n) {
        if (m<=0 || n<=0) return 0;
        int[][] dp = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                if (i==0 || j==0) dp[i][j] = 1;
                else {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }

}
