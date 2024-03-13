package org.hef.algorithm.m202403.d06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Date 2024/3/6
 * @Author lifei
 */
public class Solution01 {

    private int[] temp;
    private int[] indexes;
    private int[] tempIndexes;
    private Integer[] res;
    public List<Integer> countSmaller(int[] nums) {
        if (nums==null || nums.length==0) {
            return new ArrayList<>();
        }
        this.temp = new int[nums.length];
        this.indexes = new int[nums.length];
        this.tempIndexes = new int[nums.length];
        this.res = new Integer[nums.length];
        Arrays.fill(res, 0);
        for (int i=0; i<nums.length; i++) {
            indexes[i] = i;
        }
        mergeSort(nums, 0, nums.length-1);
        return Arrays.asList(res);
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left>=right) {
            return;
        }
        int mid = (left + right)/2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {
        for (int k=left; k<=right; k++) {
            temp[k] = nums[k];
            tempIndexes[k] = indexes[k];
        }
        int i=left, j = mid +1;
        for (int k=left; k<=right; k++) {
            if (i>mid) {
                nums[k] = temp[j];
                indexes[k] = tempIndexes[j];
                j++;
            } else if (j>right) {
                nums[k] = temp[i];
                indexes[k] = tempIndexes[i];
                res[tempIndexes[i]] += (j - mid -1);
                i++;
            } else if (temp[i]<=temp[j]) {
                nums[k] = temp[i];
                indexes[k] = tempIndexes[i];
                res[tempIndexes[i]] += (j - mid -1);
                i++;
            } else {
                nums[k] = temp[j];
                indexes[k] = tempIndexes[j];
                j++;
            }
        }
    }
}
