package com.hef.week07.homework;

import java.util.*;

/**
 * @Date 2021/5/22
 * @Author lifei
 */
public class Leet22GenerateParenthesesDP {

    public static void main(String[] args) {
        Leet22GenerateParenthesesDP leet22GenerateParenthesesDP = new Leet22GenerateParenthesesDP();
        List<String> result = leet22GenerateParenthesesDP.generateParenthesis(3);
        System.out.println(result);
    }

    public List<String> generateParenthesis(int n) {
        List<List<String>> result = new ArrayList<>(n+1);
        result.add(Arrays.asList(""));
        result.add(Arrays.asList("()"));
        for (int i=2; i<=n; i++) {
            List<String> oneL = new ArrayList<>();
            for (int j=0; j<i; j++) {
                List<String> p = result.get(j);
                List<String> q = result.get(i-1-j);
                for (String ps : p) {
                    for (String qs: q) {
                        String oneS = "(" + ps + ")" + qs;
                        oneL.add(oneS);
                    }
                }
            }
            result.add(oneL);
        }
        return result.get(n);
    }
}
