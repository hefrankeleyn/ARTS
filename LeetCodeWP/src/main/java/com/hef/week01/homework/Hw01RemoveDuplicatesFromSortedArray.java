package com.hef.week01.homework;

import java.util.Arrays;

/**
 * 在原地去除 有序数组中重复都元素
 * @Date 2021/4/5
 * @Author lifei
 */
public class Hw01RemoveDuplicatesFromSortedArray {

    /**
     * 思路： 和之前 将0 移动到最后都题目类似
     *     1. 将所有重复元素的只变成 和 nums[0] 值一样；
     *     2. 从角标 1 开始， 将所有 与 nums[0] 相同的数值移动到末尾；
     *     3. 统计有效长度并返回
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums==null || nums.length==0) return 0;
        // 1. 将重复元素的值设置为 nums[0]
        for (int i = 0, j= i+1; j<nums.length;) {
            while (j<nums.length && nums[j] == nums[i]) {
                nums[j++] = nums[0];
            }
            i = j;
            j += 1;
        }
        // 2. 从 角标 1 开始，将所有与 nums[0] 相同的值移动到最后
        int x = 1;
        // 从 角标 1 开始找到 第一个值为 nums[0] 的角标
        while (x < nums.length && nums[x] != nums[0]) {
            ++x;
        }
        for (int y=x+1;y<nums.length; y++) {
            // 从 x+1 开始找到一个 值不为 nums[0] 的角标
            while (y<nums.length && nums[y] == nums[0]) {
                y++;
            }
            if (x<y && y<nums.length) {
                exch(nums, x, y);
                x++;
            }
        }
        // 计算出长度，返回
        int len = 1;
        for (int i = 1; i<nums.length; i++) {
            if (nums[i] != nums[0]) {
                ++len;
            }
        }
        return len;
    }

    private void exch(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }


    public static void main(String[] args) {
        int[] a = {1,1,1};
        Hw01RemoveDuplicatesFromSortedArray duplicatesFromSortedArray = new Hw01RemoveDuplicatesFromSortedArray();
        System.out.println(Arrays.toString(a));
        int len = duplicatesFromSortedArray.removeDuplicates(a);
        System.out.println("len: " + len);
        printSub(a, len);

    }

    private static void printSub(int[] a, int len) {
        System.out.print("[");
        for (int i=0; i<len;i++) {
            System.out.print(a[i]);
            if (i<len-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
