package com.hef.week07.homework;

import java.util.*;

/**
 * @Date 2021/5/23
 * @Author lifei
 */
public class Leet37SudoKuSolver03 {

    public static void main(String[] args) {
        Leet37SudoKuSolver03 sudokuSolver03 = new Leet37SudoKuSolver03();
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        sudokuSolver03.solveSudoku(board);
        for (char[] a : board) {
            System.out.println(Arrays.toString(a));
        }
    }

    private HashSet<Integer>[] rows = new HashSet[9];
    private HashSet<Integer>[] cols = new HashSet[9];
    private HashSet<Integer>[] children = new HashSet[9];
    //  预处理：得到要填充数值的坐标，去除不能使用的值
    private List<Integer[]> emptyList = new ArrayList<>();
    private List<Integer>[] enableValues = new ArrayList[9];


    public void solveSudoku(char[][] board) {
        if (board == null || board.length < 9) return;

        for (int i = 0; i < 9; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int k = 1; k <= 9; k++) {
                set.add(k);
            }
            rows[i] = set;
            cols[i] = set;
            children[i] = set;
        }

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == '.') {
                    emptyList.add(new Integer[]{x, y});
                } else {
                    rows[x].remove(board[x][y]);
                    cols[y].remove(board[x][y]);
                    children[x / 3 * 3 + y / 3].remove(board[x][y]);
                }
            }
        }
        solve(board, 0);
    }

    private boolean solve(char[][] board, int i) {
        if (i == emptyList.size()) return true;
        Integer[] index = emptyList.get(i);
        int x = index[0], y = index[1];
        HashSet<Integer> oneRowValues = (HashSet<Integer>) rows[x].clone();
        Set<Integer> oneColValues = cols[y];
        Set<Integer> oneChildValues = children[x / 3 * 3 + y / 3];
        for (Integer k : oneRowValues) {
            if (oneColValues.contains(k) && oneChildValues.contains(k)) {
                board[x][y] = (char) (k + '0');
                rows[x].remove(k);
                oneColValues.remove(k);
                oneChildValues.remove(k);
                if (solve(board, i+1)) {
                    return true;
                } else {
                    board[x][y] = '.';
                    rows[x].add(k);
                    oneColValues.add(k);
                    oneChildValues.add(k);
                }
            }
        }

        return false;
    }
}
