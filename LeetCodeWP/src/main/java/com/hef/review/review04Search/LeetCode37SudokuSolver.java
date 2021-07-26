package com.hef.review.review04Search;

import java.util.Arrays;

/**
 * @Date 2021/7/26
 * @Author lifei
 */
public class LeetCode37SudokuSolver {

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        printA(board);
        LeetCode37SudokuSolver sudokuSolver = new LeetCode37SudokuSolver();
        sudokuSolver.solveSudoku(board);
        System.out.println("*****************");
        printA(board);

    }

    private static void printA(char[][] a) {
        for (char[] aa : a) {
            System.out.println(Arrays.toString(aa));
        }
    }

    public void solveSudoku(char[][] board) {
        backTrace(board);
    }

    private boolean backTrace(char[][] board) {
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if (board[i][j]!='.') continue;
                for (char k='1'; k<='9'; k++) {
                    if (isValid(board, i, j, k)) {
                        board[i][j] = k;
                        if (backTrace(board)) {
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

    private boolean isValid(char[][] board, int i, int j, int k) {
        for (int x=0; x<board.length; x++) {
            if (board[x][j]==k) return false;
        }

        for (int y=0; y<board[0].length; y++) {
            if (board[i][y]==k) return false;
        }

        int x1 = i/3*3, x2 = (i/3+1)*3;
        int y1 = j/3*3, y2 = (j/3+1)*3;
        for (int x=x1; x<x2; x++) {
            for (int y=y1; y<y2; y++) {
                if (board[x][y]==k) return false;
            }
        }
        return true;
    }
}
