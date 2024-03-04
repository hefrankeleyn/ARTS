package com.hef.week07.homework;

import java.util.*;

/**
 * @Date 2021/5/22
 * @Author lifei
 */
public class Leet22GenerateParentheses {

    public static void main(String[] args) {
        Leet22GenerateParentheses leet22GenerateParentheses = new Leet22GenerateParentheses();
        List<String> result = leet22GenerateParentheses.generateParenthesis(3);
        System.out.println(result);
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n<=0) return result;
        dfs(0, 0, 0, n, "", result);
        return result;
    }

    private void dfs(int left, int right, int i, int n, String oneS, List<String> result) {
        if (right>=n) {
            result.add(oneS);
        }

        if (left < n) {
            dfs(left+1, right, i+1, n, oneS+"(", result);
        }

        if (left > right) {
            dfs(left, right+1, i+1, n, oneS+")", result);
        }
    }
}
