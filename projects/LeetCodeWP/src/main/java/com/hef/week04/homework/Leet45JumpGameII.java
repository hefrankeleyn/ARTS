package com.hef.week04.homework;

import java.util.*;
/**
 * @Date 2021/4/28
 * @Author lifei
 */
public class Leet45JumpGameII {

    public static void main(String[] args) {
        Leet45JumpGameII jumpGameII = new Leet45JumpGameII();
        int[] nums = {2,3,1,1,4};
        System.out.println(jumpGameII.jump(nums));
    }

    public int jump(int[] nums) {
        if (nums==null || nums.length==0) return -1;
        Set<Integer> visited = new HashSet<>();
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(0);
        int level = 0;
        boolean flag = false;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i=0; i<size; i++) {
                int v = deque.poll();
                for (int j=1; j<=nums[v] && v+j<nums.length; j++) {
                    int next = v+j;
                    if (!visited.contains(next)) {
                        deque.offer(next);
                        visited.add(next);
                    }
                }
                if (v==nums.length-1) {
                    flag = true;
                }
            }
            if (flag) {
                break;
            }
            level++;
        }
        return level;
    }
}
