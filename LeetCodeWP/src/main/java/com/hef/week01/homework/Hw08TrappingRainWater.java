package com.hef.week01.homework;

import java.util.*;
/**
 * 借助单调栈解决
 * @Date 2021/4/5
 * @Author lifei
 */
public class Hw08TrappingRainWater {

    public int trap(int[] height) {
        int container = 0;

        if (height==null || height.length<3) {
            return container;
        }
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i<height.length; i++) {
            while (!deque.isEmpty() && height[deque.peekLast()]<height[i]) {
                int top  = deque.removeLast();
                if (deque.isEmpty()) {
                    break;
                }
                int left = deque.peekLast();
                int width = i - left - 1;
                int h = Math.min(height[i], height[left]) - height[top];

                container += width * h;
            }
            deque.addLast(i);
        }

        return container;
    }

    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};

        Hw08TrappingRainWater trappingRainWater = new Hw08TrappingRainWater();
        System.out.println(trappingRainWater.trap(height));
    }
}
