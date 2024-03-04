package com.hef.week05;

/**
 * @Date 2021/5/3
 * @Author lifei
 */
public class Leet63UniquePathsII {

    public static void main(String[] args) {
        Leet63UniquePathsII uniquePathsII = new Leet63UniquePathsII();
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsII.uniquePathsWithObstacles01(obstacleGrid));
        System.out.println(uniquePathsII.uniquePathsWithObstacles02(obstacleGrid));
        System.out.println(uniquePathsII.uniquePathsWithObstacles03(obstacleGrid));
        System.out.println(uniquePathsII.uniquePathsWithObstacles04(obstacleGrid));
    }

    public int uniquePathsWithObstacles04(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i=0; i<m; i++) {
            for (int j=1; j<=n; j++) {
                if (obstacleGrid[i][j-1] == 1) {
                    dp[j] = 0;
                }else {
                    dp[j] += dp[j-1];
                }
            }
        }

        return dp[n];
    }

    public int uniquePathsWithObstacles03(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                }else if (j-1>=0) {
                    dp[j] += dp[j-1];
                }
            }
        }

        return dp[n-1];
    }

    public int uniquePathsWithObstacles02(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[j] = 0;
                }else if (j==0 || obstacleGrid[i][j-1]==1) {
                    dp[j] = dp[j];
                }else {
                    dp[j] += dp[j-1];
                }
            }
        }

        return dp[n-1];
    }

    public int uniquePathsWithObstacles01(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[] dp = new int[n];
        dp[0] = 1;
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (obstacleGrid[i][j]==1) {
                    dp[j] = 0;
                }else if (j-1>=0 && obstacleGrid[i][j-1]==0) {
                    dp[j] += dp[j-1];
                }
            }
        }

        return dp[n-1];
    }
}
