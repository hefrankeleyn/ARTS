package com.hef.week06;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet63UniquePathsII {

    public static void main(String[] args) {
        Leet63UniquePathsII leet63UniquePathsII = new Leet63UniquePathsII();
        int[][] obstacleGrid = new int[][] {{0,0,0},{0,1,0},{0,0,0}};
        int res = leet63UniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(res);
    }

    /**
     * 1. 最优子结构；
     * 2. 定义并存储状态；
     * 3. DP方程；
     * @param obstacleGrid
     * @return
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid==null || obstacleGrid.length==0) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (obstacleGrid[i][j]==1) dp[j] = 0;
                else if (j>0 && obstacleGrid[i][j-1]==0){
                    dp[j] = dp[j] + dp[j-1];
                }
            }
        }
        return dp[n-1];

    }
}
