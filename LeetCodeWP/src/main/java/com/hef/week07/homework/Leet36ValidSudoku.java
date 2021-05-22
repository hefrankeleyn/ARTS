package com.hef.week07.homework;

/**
 * @Date 2021/5/22
 * @Author lifei
 */
public class Leet36ValidSudoku {

    public static void main(String[] args) {
        Leet36ValidSudoku validSudoku = new Leet36ValidSudoku();
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
        boolean result = validSudoku.isValidSudoku(board);
        System.out.println(result);
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if (board[i][j]=='.') continue;
                if (!isValidInRow(i, j, board)) return false;
                if (!isValidInCol(i, j, board)) return false;
                if (!isValidInCell(i, j, board)) return false;
            }
        }
        return true;
    }

    private boolean isValidInCell(int i, int j, char[][] borad) {
        int x1 = i / 3 * 3, x2 = (i / 3 + 1) *3;
        int y1 = j / 3 * 3, y2 = (j / 3 + 1) *3;
        for (int x=x1; x<x2; x++) {
            for (int y=y1; y<y2; y++) {
                if (x==i && y==j) continue;
                if (borad[x][y] == borad[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidInCol(int i, int j, char[][] borad) {
        for (int x=0; x<borad.length; x++) {
            if (x==i) continue;
            if (borad[x][j] == borad[i][j]) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidInRow(int i, int j, char[][] borad) {
        char[] row = borad[i];
        for (int x=0; x<row.length; x++) {
            if (x==j) continue;
            if (row[x]==borad[i][j]) {
                return false;
            }
        }
        return true;
    }
}
