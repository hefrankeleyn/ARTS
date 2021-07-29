package com.hef.review.review04Search;

import java.util.*;

/**
 * @Date 2021/7/29
 * @Author lifei
 */
public class LeetCode1091ShortestPathInBinaryMatrix {

    public static void main(String[] args) {
        LeetCode1091ShortestPathInBinaryMatrix shortestPathInBinaryMatrix = new LeetCode1091ShortestPathInBinaryMatrix();
        int[][] grid = {
                {0, 1},
                {1, 0}
        };
        int res = shortestPathInBinaryMatrix.shortestPathBinaryMatrix(grid);
        System.out.println(res);
    }

    private int[] dx = {0, 0, 1, -1, 1, 1, -1, -1};
    private int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0]==1 || grid[n-1][n-1]==1) return -1;
        if (n<=2) return n;
        int[][] dp = new int[n][n];
        dp[0][0] = 1;
        dp[n-1][n-1] = -1;
        Deque<int[]> deque = new ArrayDeque<int[]>();
        deque.addLast(new int[]{0, 0});
        bfs(grid, dp, deque, n);
        return dp[n-1][n-1];

    }

    private void bfs(int[][] grid, int[][] dp, Deque<int[]> deque, int n) {
        while (!deque.isEmpty()) {
            int[] a = deque.removeLast();
            int x = a[0], y = a[1];
            for (int i=0; i<dx.length; i++) {
                int x1 = x+dx[i], y1 = y+dy[i];
                if (x1<0 || x1>=n || y1<0 || y1>=n || dp[x1][y1]>0) {
                    continue;
                }
                if (grid[x1][y1]==1) {
                    dp[x1][y1] = -1;
                }else {
                    dp[x1][y1] = dp[x][y] + 1;
                    deque.addFirst(new int[]{x1, y1});
                }
            }
        }
    }
}
