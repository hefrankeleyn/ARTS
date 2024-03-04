package com.hef.week01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date 2021/4/3
 * @Author lifei
 */
public class Leet04ThreeSum {

    public List<List<Integer>> threeSum02(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums==null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int k=0; k<nums.length-2; k++) {
            if (nums[k] > 0) return result;
            if (k>0 && nums[k] == nums[k-1]) continue;
            int i = k + 1, j = nums.length-1;
            while (i<j) {
                while (nums[i] + nums[j] > -nums[k] && j>k) {
                    --j;
                }
                while (nums[i] + nums[j] < -nums[k] && i<j) {
                    ++i;
                }
                if (i<j && nums[i] + nums[j] == -nums[k]) {
                    Integer[] tempA = {nums[k], nums[i], nums[j]};
                    result.add(Arrays.asList(tempA));
                    while (++i<j && nums[i] == nums[i-1]);
                    while (--j>k && nums[j] == nums[j+1]);
                }
            }
        }

        return result;
    }

    public List<List<Integer>> threeSum(int[] sums){
        List<List<Integer>> result = new ArrayList<>();
        if (sums==null || sums.length<3) {
            return result;
        }
        Arrays.sort(sums);
        for (int k = 0; k<sums.length-2;){
            int i = k+1, j = sums.length -1;
            while (i<j){
                while (i<j && sums[i] + sums[j] < -sums[k]) {
                    ++i;
                }
                while (j>k && sums[i] + sums[j] > -sums[k]) {
                    --j;
                }
                if (i<j && sums[i] + sums[j] == -sums[k]) {
                    Integer[] tempA = {sums[k], sums[i], sums[j]};
                    result.add(Arrays.asList(tempA));
                    while (++i<j && sums[i] == sums[i-1]);
                    while (--j > k && sums[j] == sums[j+1]);
                }
            }
            while (++k <sums.length && sums[k] == sums[k-1]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] sums = {-1,0,1,2,-1,-4};
        Leet04ThreeSum threeSum = new Leet04ThreeSum();
        System.out.println(Arrays.toString(sums));
        List<List<Integer>> result = threeSum.threeSum(sums);

        System.out.println(result);
        System.out.println(threeSum.threeSum02(sums));
    }
}
