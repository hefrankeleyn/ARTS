package com.hef.week01;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @Date 2021/4/4
 * @Author lifei
 */
public class Leet09LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        if (heights==null || heights.length==0) {
            return 0;
        }
        int len = heights.length;
        if (len==1) return heights[0];
        int[] newHeights = new int[len + 2];
        for (int i = 0;i<heights.length; i++) {
            newHeights[i+1] = heights[i];
        }
        heights = newHeights;
        len += 2;
        Deque<Integer> deque = new ArrayDeque<>();
        int area = 0;
        for (int i = 0; i<len; i++) {
            while (!deque.isEmpty() && heights[deque.peekLast()] > heights[i]) {
                int height = heights[deque.removeLast()];
                int width = i - deque.peekLast() - 1;
                area = Math.max(area, height * width);
            }
            deque.addLast(i);
        }




        return area;
    }

    /*public int largestRectangleArea(int[] heights) {
        if (heights==null || heights.length==0) {
            return 0;
        }
        int max = 0;
        // 固定高度，求最长底边
        for (int i = 0; i<heights.length; i++) {
            if (heights[i]==0) continue;
            //max = Math.max(max, heights[i]);
            int x = i, y = i;
            while (x>0 && heights[x-1]>=heights[i] && heights[x]>0) x--;
            while (y<heights.length-1 && heights[y+1]>=heights[i] && heights[y]>0) {
                y++;
            }
            max = Math.max(max, heights[i] * (y-x + 1));
        }
        return max;
    }*/

    public static void main(String[] args) {
        int[] heights = {4,2,0,3,2,4,3,4};
        Leet09LargestRectangleInHistogram leet09LargestRectangleInHistogram = new Leet09LargestRectangleInHistogram();
        System.out.println(leet09LargestRectangleInHistogram.largestRectangleArea(heights));
    }
}
