package com.hef.week03.homework;


import java.util.*;
/**
 * @author lifei
 * @since 2021/4/18
 */
public class Leet46Permutations {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Leet46Permutations permutations = new Leet46Permutations();
        System.out.println(permutations.permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        if (nums==null || nums.length==0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        searchPermute(result, 0, n, new Integer[n], nums);
        return result;
    }

    private void searchPermute(List<List<Integer>> result, int i, int n, Integer[] a, int[] nums) {
        if (i>=n) {
            result.add(Arrays.asList(a.clone()));
            return;
        }
        for (int j = 0; j<nums.length; j++) {
            a[i] = nums[j];
            int[] nextA = createNextArray(nums, j);
            searchPermute(result, i+1, n, a, nextA);
        }
    }

    private int[] createNextArray(int[] nums, int j) {
        int[] oneA = new int[nums.length-1];
        for (int i=0, x=0; i< nums.length; i++) {
            if (i==j) continue;
            oneA[x++] = nums[i];
        }
        return oneA;
    }


}
