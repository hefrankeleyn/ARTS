package com.hef.review.review04Search;

/**
 * @Date 2021/8/1
 * @Author lifei
 */
public class LeetCode37SudokuSolver02 {

    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i=0;i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if (board[i][j]!='.') continue;
                for (char c='1'; c<='9'; c++) {
                    if (isValid(board, i, j, c)) {
                        board[i][j] = c;
                        if (solve(board)) {
                            return true;
                        }else {
                            board[i][j]='.';
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean isValid(char[][] board, int i, int j, char c) {
        for (int x=0; x<board.length; x++) {
            if (board[x][j]==c) return false;
        }
        for (int y=0; y<board[0].length; y++) {
            if (board[i][y]==c) return false;
        }
        int x1=i/3*3, x2=(i/3+1)*3;
        int y1=j/3*3, y2=(j/3+1)*3;
        for (int x=x1; x<x2; x++) {
            for (int y=y1; y<y2; y++) {
                if (board[x][y]==c) return false;
            }
        }
        return true;
    }
}
