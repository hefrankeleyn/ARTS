package com.hef.week04.homework;

import java.util.Arrays;

/**
 * @Date 2021/4/28
 * @Author lifei
 */
public class Leet529Minesweeper {

    public static void main(String[] args) {
        Leet529Minesweeper minesweeper = new Leet529Minesweeper();
        char[][] board = {{'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}};

        int[] click = {3, 0};
        char[][] result = minesweeper.updateBoard(board, click);
        System.out.println(Arrays.toString(result));
    }

    private final int[] xdir = {0, 1, 0, -1, 1, -1, -1, 1};
    private final int[] ydir = {1, 0, -1, 0, 1, -1, 1, -1};
    public char[][] updateBoard(char[][] board, int[] click) {
        int x=click[0], y=click[1];
        if (board[x][y]=='M') {
            board[x][y] = 'X';
        }else {
            dfs(board, x, y);
        }
        return board;
    }

    private void dfs(char[][] board, int x, int y) {
        // 查询周围地雷的个数
        int count = 0;
        for (int i=0; i<8; i++) {
            int tx = x + xdir[i];
            int ty = y + ydir[i];
            if (tx<0 || tx>=board.length || ty<0 || ty>=board[tx].length) {
                continue;
            }
            if (board[tx][ty]=='M') {
                count += 1;
            }
        }
        if (count>0) {
            board[x][y] = (char)(count + '0');
        }else {
            board[x][y] = 'B';
            for (int i=0; i<8; i++) {
                int tx = x + xdir[i];
                int ty = y + ydir[i];
                if (tx<0 || tx>=board.length || ty<0 || ty>=board[tx].length || board[tx][ty]!='E') {
                    continue;
                }
                dfs(board, tx, ty);
            }
        }
    }
}
