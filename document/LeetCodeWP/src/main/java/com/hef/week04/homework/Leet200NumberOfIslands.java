package com.hef.week04.homework;

/**
 * 岛屿数量： 上下左右
 * @Date 2021/4/25
 * @Author lifei
 */
public class Leet200NumberOfIslands {

    public static void main(String[] args) {
        Leet200NumberOfIslands numberOfIslands = new Leet200NumberOfIslands();
        char[][] grid = {{'1', '1','1'},
                         {'0', '1','0'},
                         {'1', '1','1'}};
        int result = numberOfIslands.numIslands(grid);
        System.out.println(result);

    }

    public int numIslands(char[][] grid) {
        if (grid==null || grid.length==0) return 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j]=='1') {
                    changeZero(i-1, j, grid, i, j);
                    changeZero(i+1, j, grid, i, j);
                    changeZero(i, j+1, grid, i, j);
                    changeZero(i, j-1, grid, i, j);
                }
            }
        }
        int result = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j]=='1') {
                    result += 1;
                }
            }
        }

        return result;
    }

    private void changeZero(int i, int j, char[][] grid, int x, int y) {
        if (i<0 || j<0 || i>=grid.length || j>=grid[i].length || grid[i][j]=='0' || (i==x && j==y)) {
            return;
        }
        grid[i][j] = '0';
        changeZero(i-1, j, grid, x, y);
        changeZero(i+1, j, grid, x, y);
        changeZero(i, j+1, grid, x, y);
        changeZero(i, j-1, grid, x, y);
    }
}
