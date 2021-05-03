package com.hef.week05;

/**
 * @Date 2021/5/3
 * @Author lifei
 */
public class Leet64MinimumPathSum {

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        Leet64MinimumPathSum minimumPathSum = new Leet64MinimumPathSum();
        System.out.println(minimumPathSum.minPathSum(grid));

    }

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] dp = new int[n];
        //dp[1] = grid[0][0];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (i==0 && j>0) {
                    dp[j] = grid[i][j] + dp[j-1];
                }else if (j==0 && i>0) {
                    dp[j] = grid[i][j] + dp[j];
                }else if (i==0 && j==0) {
                    dp[j] = grid[i][j];
                }else {
                    dp[j] = Math.min(grid[i][j] + dp[j], grid[i][j] + dp[j-1]);
                }
            }
        }

        return dp[n-1];
    }
}
