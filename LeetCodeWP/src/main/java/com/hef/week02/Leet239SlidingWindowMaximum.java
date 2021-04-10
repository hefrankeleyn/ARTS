package com.hef.week02;

import java.util.*;

public class Leet239SlidingWindowMaximum{

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums==null || nums.length==0 || k==0) return null;
        int[] result = new int[nums.length-k + 1];
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->{return o2.compareTo(o1);});
        for (int i = 0; i<nums.length; i++) {
            int start = i - k;
            if (start>=0) {
                queue.remove(nums[start]);
            }
            queue.offer(nums[i]);

            if (i-k+1>=0) {
                result[i-k+1] = queue.peek();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.getOrDefault(0, 0);

        int[] nums = {1,3,-1,-3,5,3,6,7}; int k = 3;
        Leet239SlidingWindowMaximum slidingWindowMaximum = new Leet239SlidingWindowMaximum();
        System.out.println(Arrays.toString(slidingWindowMaximum.maxSlidingWindow(nums, k)));

    }
}
