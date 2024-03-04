package com.hef.week03.homework;

import java.util.*;
/**
 * @author lifei
 * @since 2021/4/18
 */
public class Leet47PermutationsII {

    public static void main(String[] args) {
        Leet47PermutationsII permutationsII = new Leet47PermutationsII();
        int[] nums = {1,1,2};
        System.out.println(permutationsII.permuteUnique(nums));
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums==null || nums.length==0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        int n= nums.length;
        searchPermuteUnique(result, 0, n, new Integer[n], nums);
        return result;
    }

    private void searchPermuteUnique(List<List<Integer>> result, int i, int n, Integer[] a, int[] nums) {
        if (i>=n) {
            result.add(Arrays.asList(a.clone()));
            return;
        }
        for (int j=0; j<nums.length;) {
            a[i] = nums[j];
            int[] nextA = createNextA(nums, j);
            searchPermuteUnique(result, i+1, n, a, nextA);
            j+=1;
            while (j<nums.length && nums[j]==nums[j-1]) {
                j++;
            }
        }
    }

    private int[] createNextA(int[] nums, int j) {
        int[] oneA = new int[nums.length-1];
        for (int i =0, x=0; i<nums.length; i++) {
            if (i==j) continue;
            oneA[x++] = nums[i];
        }
        return oneA;
    }
}
