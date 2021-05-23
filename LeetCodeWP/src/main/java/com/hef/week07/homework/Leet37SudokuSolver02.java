package com.hef.week07.homework;

import java.util.*;

/**
 * @Date 2021/5/23
 * @Author lifei
 */
public class Leet37SudokuSolver02 {

    public static void main(String[] args) {
        Leet37SudokuSolver02 sudokuSolver02 = new Leet37SudokuSolver02();
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        sudokuSolver02.solveSudoku(board);
        for (char[] a : board) {
            System.out.println(Arrays.toString(a));
        }
    }

    public void solveSudoku(char[][] board) {
        if (board==null || board.length<9) return;
        solve(board, 0);
    }

    private boolean solve(char[][] board, int level) {
        if (level>=81) return true;
        int i = level/9, j = level % 9;
        if (board[i][j]!='.') return solve(board, level+1);

        // 判断哪些值已经存在
        boolean[] flag = new boolean[10];
        isValid(flag, board, i, j);
        for (int k=1; k<=9; k++) {
            if (flag[k]) {
                board[i][j] = (char)(k+'0');
                if (solve(board, level+1)){
                    return true;
                }else {
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }

    private void isValid(boolean[] flag, char[][] board, int i, int j) {
        Arrays.fill(flag, true);
        for (int x=0; x<9; x++) {
            if (board[i][x]!='.') flag[board[i][x]-'0'] = false;
            if (board[x][j]!='.') flag[board[x][j]-'0'] = false;
            int q = i/3 * 3 + x / 3;
            int p = j/3 * 3 + x % 3;
            if (board[q][p]!='.') flag[board[q][p]-'0'] = false;
        }
    }
}
