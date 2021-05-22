package com.hef.week07.homework;

import java.util.Arrays;

/**
 * @Date 2021/5/22
 * @Author lifei
 */
public class Leet37SudokuSolver {

    public static void main(String[] args) {
        Leet37SudokuSolver sudokuSolver = new Leet37SudokuSolver();
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
        sudokuSolver.solve(board);
        for (char[] a : board) {
            System.out.println(Arrays.toString(a));
        }
//        System.out.println(Arrays.toString(board));
    }

    public void solveSudoku(char[][] board) {
        if (board==null || board.length<9) return;
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int i=0; i<board.length; i++) {
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

    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i=0; i<9; i++) {
            if (board[i][col]!='.' && board[i][col]==c) return false;
            if (board[row][i]!='.' && board[row][i]==c) return false;
            if (board[row / 3 * 3 + i/3][col/3*3+i%3]!='.' && board[row / 3 * 3 + i/3][col/3*3+i%3]==c) return false;
        }
        return true;
    }
}
