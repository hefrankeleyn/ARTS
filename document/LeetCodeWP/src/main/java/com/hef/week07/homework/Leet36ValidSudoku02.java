package com.hef.week07.homework;

import java.util.*;

/**
 * @Date 2021/5/22
 * @Author lifei
 */
public class Leet36ValidSudoku02 {

    public static void main(String[] args) {
        Leet36ValidSudoku02 validSudoku02 = new Leet36ValidSudoku02();
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
        boolean result = validSudoku02.isValidSudoku(board);
        System.out.println(result);
    }



    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Integer>[] rowMap = new HashMap[9];
        Map<Integer, Integer>[] colMap = new HashMap[9];
        Map<Integer, Integer>[] indexMap = new HashMap[9];
        for (int i=0; i<9; i++) {
            rowMap[i] = new HashMap<>();
            colMap[i] = new HashMap<>();
            indexMap[i] = new HashMap<>();
        }

        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                if (board[i][j]=='.') continue;
                int k = board[i][j];
                int index = i / 3 * 3 + j / 3;
                rowMap[i].put(k, rowMap[i].getOrDefault(k, 0) + 1);
                colMap[j].put(k, colMap[j].getOrDefault(k, 0) + 1);
                indexMap[index].put(k, indexMap[index].getOrDefault(k, 0) + 1);
                if (rowMap[i].get(k)>1 || colMap[j].get(k)>1 || indexMap[index].get(k)>1) {
                    return false;
                }
            }
        }
        return true;
    }
}
