package com.hef.review.review02BitAlgorithm;

import java.util.*;

/**
 * @Date 2021/7/13
 * @Author lifei
 */
public class LeetCode51NQueens {

    private Set<Integer> rows = new HashSet<>();
    private Set<Integer> pies = new HashSet<>();
    private Set<Integer> nas = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        List<Integer[]> res = new ArrayList<>(n);
        searchNQueens(res, 0, n, new Integer[n]);
        return changeRes(res);
    }

    private List<List<String>> changeRes(List<Integer[]> res) {
        List<List<String>> resList = new ArrayList<>(res.size());
        for (Integer[] a: res) {
            List<String> item = new ArrayList<>(a.length);
            for (int i=0; i<a.length; i++) {
                char[] c = new char[a.length];
                Arrays.fill(c, '.');
                c[a[i]] = 'Q';
                item.add(String.valueOf(c));
            }
            resList.add(item);
        }
        return resList;
    }

    private void searchNQueens(List<Integer[]> res, int col, int n, Integer[] a) {
        if (col>=n) {
            res.add(a.clone());
            return;
        }
        for (int row=0; row<n; row++) {
            if (rows.contains(row) || pies.contains(row+col) || nas.contains(row-col)) {
                continue;
            }
            rows.add(row);
            pies.add(row+col);
            nas.add(row-col);
            a[col] = row;
            searchNQueens(res, col+1, n, a);
            rows.remove(row);
            pies.remove(row+col);
            nas.remove(row-col);
        }
    }
}
