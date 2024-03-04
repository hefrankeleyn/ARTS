package org.hef.algorithm.m202403.d04;

/**
 * [LCR 170. 交易逆序对的总数](https://leetcode.cn/problems/shu-zu-zhong-de-ni-xu-dui-lcof/)
 * @Date 2024/3/4
 * @Author lifei
 */
public class Solution01 {

    public int reversePairs(int[] record) {
        if (record==null || record.length==0) {
            return 0;
        }
        int[] temp = new int[record.length];
        int res = mergeSort(record, temp, 0, record.length-1);
        return res;
    }

    private int mergeSort(int[] record, int[] temp, int left, int right) {
        int res = 0;
        if (left>=right) {
            return res;
        }
        int mid = (left + right)/2;
        res += mergeSort(record, temp, left, mid);
        res += mergeSort(record, temp, mid+1, right);
        res += merge(record, temp, left, mid, right);
        return res;
    }

    private int merge(int[] record, int[] temp, int left, int mid, int right) {
        for (int k=left; k<= right; k++) {
            temp[k] = record[k];
        }
        int res = 0;
        int i=left, j = mid+1;
        for (int k=left; k<=right; k++) {
            if (i>mid) {
                record[k] = temp[j++];
            } else if (j>right) {
                record[k] = temp[i++];
            } else if (temp[i] <= temp[j]) {
                record[k] = temp[i++];
            } else {
                record[k] = temp[j++];
                res += mid - i + 1;
            }
        }
        return res;
    }
}
