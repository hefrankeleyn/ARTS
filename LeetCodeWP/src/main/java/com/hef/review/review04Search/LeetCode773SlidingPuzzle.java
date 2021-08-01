package com.hef.review.review04Search;

import java.util.*;

/**
 * @Date 2021/8/1
 * @Author lifei
 */
public class LeetCode773SlidingPuzzle {

    public static void main(String[] args) {
        LeetCode773SlidingPuzzle slidingPuzzle = new LeetCode773SlidingPuzzle();
        int[][] board = {{1, 2, 3}, {4, 0, 5}};
        int res = slidingPuzzle.slidingPuzzle(board);
        System.out.println(res);
    }

    public int slidingPuzzle(int[][] board) {

        /*
        0 1 2
        3 4 5
        */
        int[][] dic = {{1, 3}, {0, 2, 4}, {1, 5}, {0, 4}, {3, 1, 5}, {2, 4}};
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                sb.append(board[i][j]);
            }
        }
        Set<String> visited = new HashSet<>();
        String beginWord = sb.toString();
        String endWord = "123450";
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast(beginWord);
        visited.add(beginWord);
        Deque<String> deque02 = new ArrayDeque<>();
        int res = 0;
        while (!deque.isEmpty()) {
            String str = deque.removeLast();
            if (str.equals(endWord)) return res;
            int i = str.indexOf('0');
            char[] a = str.toCharArray();
            for (int k:dic[i]) {
                exch(a, i, k);
                String ts = String.valueOf(a);
                if (!visited.contains(ts)) {
                    if (ts.equals(endWord)) return res+1;
                    visited.add(ts);
                    deque02.addLast(ts);
                }
                exch(a, i, k);
            }

            if (deque.isEmpty()) {
                res += 1;
                deque = deque02;
                deque02 = new ArrayDeque<>();
            }
        }
        return -1;

    }

    private void exch(char[] a, int i, int j) {
        char tc = a[i];
        a[i] = a[j];
        a[j] = tc;
    }
}
