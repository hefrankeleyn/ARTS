package com.hef.week07.homework;

import java.util.*;

/**
 * @Date 2021/5/22
 * @Author lifei
 */
public class Leet51NQueens {

    public static void main(String[] args) {
        Leet51NQueens nQueens = new Leet51NQueens();
        List<List<String>> result = nQueens.solveNQueens(4);
        System.out.println(result);
    }

    // y
    private Set<Integer> cols = new HashSet<>();

    // pie = x + y
    private Set<Integer> pies = new HashSet<>();

    // na = x - y
    private Set<Integer> nas = new HashSet<>();

    public List<List<String>> solveNQueens(int n) {
        if (n<=0) return new ArrayList<>();
        List<Integer[]> result = new ArrayList<>();
        solveNQueens(0, n, new Integer[n], result);
        return changeResult(result);
    }

    private List<List<String>> changeResult(List<Integer[]> la) {
        List<List<String>> result = new ArrayList<>();
        for (Integer[] a: la) {
            List<String> l = new ArrayList<>();
            for (int i=0; i<a.length; i++) {
                char[] ca = new char[a.length];
                Arrays.fill(ca, '.');
                ca[a[i]] = 'Q';
                l.add(new String(ca));
            }
            result.add(l);
        }
        return result;
    }

    private void solveNQueens(int row, int n, Integer[] a, List<Integer[]> result) {
        if (row>=n) {
            result.add(a.clone());
            return;
        }
        for (int col=0; col<n; col++) {
            if (cols.contains(col) || pies.contains(row+col) || nas.contains(row-col)) {
                continue;
            }
            a[row] = col;
            cols.add(col);
            pies.add(row+col);
            nas.add(row-col);
            solveNQueens(row+1, n, a, result);

            cols.remove(col);
            pies.remove(row+col);
            nas.remove(row-col);
        }
    }


}
