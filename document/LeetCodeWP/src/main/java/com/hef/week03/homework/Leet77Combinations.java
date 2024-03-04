package com.hef.week03.homework;

import java.util.*;
/**
 * @Date 2021/4/18
 * @Author lifei
 */
public class Leet77Combinations {

    public static void main(String[] args) {
        int n = 4, k = 2;
        Leet77Combinations combinations = new Leet77Combinations();
        System.out.println(combinations.combine(4, 2));
    }

    public List<List<Integer>> combine(int n, int k) {
        if (n<=0 || k<=0 || k>n) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        searchCombine(result, 0, k, new Integer[k], 1, n-k+1);
        return result;
    }

    private void searchCombine(List<List<Integer>> result, int level, int k, Integer[] a, int begin, int end) {
        if (level>=k) {
            result.add(Arrays.asList(a.clone()));
            return;
        }
        for (int i=begin; i<=end; i++) {
            a[level] = i;
            searchCombine(result, level+1, k, a, i+1, end+1);
        }

    }
}
