package com.hef.review.review06UF;

/**
 * DFS
 * @Date 2021/8/15
 * @Author lifei
 */
public class LeetCode200NumberOFIslands {

    public int numIslands(char[][] grid) {
        int res = 0;
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j]=='1') {
                    res ++;
                    dfs(grid, i, j, dx, dy);
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int i, int j, int[] dx, int[] dy) {
        if (grid[i][j]!='1') return;
        grid[i][j] = '0';
        for (int k=0; k<dx.length; k++) {
            int x = i + dx[k], y = j + dy[k];
            if (x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]!='1') {
                continue;
            }
            dfs(grid, x, y, dx, dy);

        }
    }
}
