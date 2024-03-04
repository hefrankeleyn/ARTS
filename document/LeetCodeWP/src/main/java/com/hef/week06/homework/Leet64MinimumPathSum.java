package com.hef.week06.homework;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet64MinimumPathSum {

    public static void main(String[] args) {
        Leet64MinimumPathSum leet64MinimumPathSum = new Leet64MinimumPathSum();
        int[][] grid = new int[][]{{1,3,1},{1,5,1},{4,2,1}};

        int res = leet64MinimumPathSum.minPathSum(grid);
        System.out.println(res);
    }

    public int minPathSum(int[][] grid) {
        if (grid==null || grid.length==0) return 0;
        int m = grid.length, n = grid[0].length;
        int[] dp = new int[n];
//        int[] pre = new int[n];
        dp[0] = grid[0][0];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (i==0 && j==0) {
                    dp[j] = grid[i][j];
                }else if (i==0 && j>0) {
                    dp[j] = dp[j-1] + grid[i][j];
                }else if (i>0 && j==0) {
                    dp[j] = dp[j] + grid[i][j];
                }else {
//                    dp[j] = Math.min(Math.min(dp[j-1], pre[j-1]), dp[j]) + grid[i][j];
                    dp[j] = Math.min(dp[j], dp[j-1]) + grid[i][j];
                }
            }
//            pre = dp.clone();
        }
        return dp[n-1];
    }
}
