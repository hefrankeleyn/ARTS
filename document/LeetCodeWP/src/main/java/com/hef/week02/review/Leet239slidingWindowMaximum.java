package com.hef.week02.review;

import java.util.*;
/**
 * @Date 2021/4/10
 * @Author lifei
 */
public class Leet239slidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums==null || nums.length==0 || k==0) return new int[0];
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i=0; i<nums.length; i++) {
            // 向队列中添加元素，使其从大到排列
            while (!queue.isEmpty() && nums[queue.peekLast()] <= nums[i]) {
                queue.removeLast();
            }
            queue.addLast(i);
            // 删除不在滑动窗口内大元素
            if (nums[queue.peekFirst()]<=i-k) {
                queue.removeFirst();
            }
            // 判断是否形成窗口
            if (i+1>=k) {
                result[i-k+1] = nums[queue.peekFirst()];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7}; int k = 3;
        Leet239slidingWindowMaximum slidingWindowMaximum = new Leet239slidingWindowMaximum();
        System.out.println(Arrays.toString(slidingWindowMaximum.maxSlidingWindow(nums, k)));
    }
}
