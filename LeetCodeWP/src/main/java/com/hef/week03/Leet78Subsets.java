package com.hef.week03;


import java.util.*;
/**
 * @Date 2021/4/18
 * @Author lifei
 */
public class Leet78Subsets {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Leet78Subsets subsets = new Leet78Subsets();
        List<List<Integer>> subsets1 = subsets.subsets(nums);
        System.out.println(subsets1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        if (nums==null || nums.length==0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int num=0; num<=nums.length; num++) {
            List<List<Integer>> oneRes = searchNumRes(nums, num);
            result.addAll(oneRes);
        }
        return result;
    }

    private List<List<Integer>> searchNumRes(int[] nums, int num) {
        List<List<Integer>> oneRes = new ArrayList<>();
        searchOneNumRes(nums, oneRes, new Integer[num], 0, 0, nums.length-num);
        return oneRes;
    }

    private void searchOneNumRes(int[] nums, List<List<Integer>> oneRes, Integer[] a, int i, int begin, int end) {
        if (i==a.length || a.length==0) {
            oneRes.add(Arrays.asList(a.clone()));
            return;
        }
        for (int j=begin;j<=end; j++) {
            a[i] = nums[j];
            searchOneNumRes(nums, oneRes, a, i+1, j+1, end+1);
        }

    }
}
