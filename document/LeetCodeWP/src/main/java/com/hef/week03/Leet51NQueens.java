package com.hef.week03;

import java.util.*;
/**
 * @Date 2021/4/13
 * @Author lifei
 */
public class Leet51NQueens {
    private Set<Integer> cols = new HashSet<>();
    private Set<Integer> pies = new HashSet<>();
    private Set<Integer> nas = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        if (n<=0) return new ArrayList<>();
        Integer[] qArray = new Integer[n];
        List<Integer[]> allSolve = new ArrayList<>();
        DFS(n, 0, qArray, allSolve);

        List<List<String>> result = change(allSolve);

        return result;
    }



    private void DFS(int n, int rowNum, Integer[] aArray, List<Integer[]> allSolve) {
        if (rowNum>=n) {
            allSolve.add(aArray.clone());
            return;
        }
        for (int i=0; i<n; i++) {
            if (cols.contains(i) || pies.contains(i+rowNum) || nas.contains(i-rowNum)) {
                continue;
            }
            cols.add(i);
            pies.add(i+rowNum);
            nas.add(i-rowNum);
            aArray[rowNum] = i;
            DFS(n, rowNum+1, aArray, allSolve);

            // clear
            cols.remove(i);
            pies.remove(i+rowNum);
            nas.remove(i-rowNum);
            aArray[rowNum] = null;

        }
    }

    private List<List<String>> change(List<Integer[]> allSolve) {
        List<List<String>> result = new ArrayList<>();
        for (Integer[] oneSolve : allSolve) {
            List<String> oneList = new ArrayList<>();
            for (int i=0; i<oneSolve.length; i++) {
                String oneStr = "";
                for (int j=0; j<oneSolve.length; j++) {
                    System.out.println("j="+j+" , i=" + i);
                    if (j==oneSolve[i]) {
                        oneStr += "Q";
                    }else {
                        oneStr += ".";
                    }
                }
                oneList.add(oneStr);
            }
            result.add(oneList);
        }
        return result;
    }

    public static void main(String[] args) {
        Leet51NQueens nQueens = new Leet51NQueens();
        System.out.println(nQueens.solveNQueens(5));
    }
}
