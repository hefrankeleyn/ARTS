package com.hef.week07.homework;

/**
 * @Date 2021/5/25
 * @Author lifei
 */
public class Leet1091ShortestPathInBinaryMatrix {

    public static void main(String[] args) {
        Leet1091ShortestPathInBinaryMatrix shortestPathInBinaryMatrix = new Leet1091ShortestPathInBinaryMatrix();
//        int[][] grid = {
//                {0,1,1,0,0,0},
//                {0,1,0,1,1,0},
//                {0,1,1,0,1,0},
//                {0,0,0,1,1,0},
//                {1,1,1,1,1,0},
//                {1,1,1,1,1,0}};

//        int[][] grid = {{0,0,0},{1,1,0},{1,1,0}};
        int[][] grid = {{0,0,1,0},{1,0,1,0},{1,1,0,1},{0,0,0,0}};

//        int n = grid.length;
//        int[][] dp = new int[n][n];
//        dp[0] = grid[0].clone();
//        dp[0][0] = 100;
//        System.out.println(grid[0][0]);
//        System.out.println(dp[0][0]);
        int n = shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid);
        System.out.println(n);
    }

    private int[] dx = {-1, 0, -1, 1, 0, 1, 1, -1};
    private int[] dy = {0, -1, -1, 0, 1, 1, -1, 1};

    // 方案一：DP
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid==null || grid.length==0) return -1;
        int n = grid.length;
        if (grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        if (n==1) return 1;
        int[][] dp = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j]==1) dp[i][j] = -1;
                else dp[i][j] = Integer.MAX_VALUE;
            }
        }
        dp[0][0] = 1;
        int[][] copyDP = copyDP(dp);

        while (true) {
            if (dp[n-1][n-1]!=Integer.MAX_VALUE) return dp[n-1][n-1];

            for (int i=0; i<dp.length; i++) {
                for (int j=0; j<dp[i].length; j++) {
                    if (i==0 && j==0) continue;
                    else if (dp[i][j]==-1) continue;
//                    dp[i][j] = minVal(i, j, dp) + 1;
                    int v  = minVal(i, j, dp);
                    dp[i][j] = v==Integer.MAX_VALUE?v: v+1;
                }
            }

            if (notExchange(dp, copyDP)) return -1;

            copyDP = copyDP(dp);
        }

//        return dp[n-1][n-1];
    }

    private boolean notExchange(int[][] dp, int[][] copyDP) {
        int n = dp.length;
        for (int i=0; i<n; i++) {
            for (int j=0; j<dp[i].length;j++) {
                if (dp[i][j]!=copyDP[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private int[][] copyDP(int[][] dp) {
        int n = dp.length;
        int[][] copyDP = new int[n][n];
        for (int i=0; i<dp.length; i++) {
            copyDP[i] = dp[i].clone();
        }
        return copyDP;
    }

    /**
     * 获取最小值
     */
    private int minVal(int x, int y, int[][] dp) {
        int n = dp.length;
        int v = Integer.MAX_VALUE;
        for (int i=0; i<8; i++) {
            int x1 = dx[i] + x, y1 = dy[i] + y;
            if (x1>=0 && x1<n && y1>=0 && y1<n && dp[x1][y1]!=-1) {
                v = Math.min(dp[x1][y1], v);
            }
        }
        return v;
    }
}
