package com.hef.week01;

import java.util.Arrays;

/**
 * @Date 2021/4/4
 * @Author lifei
 */
public class Leet09LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
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
    }

    public static void main(String[] args) {
        int[] heights = {4,2,0,3,2,4,3,4};
        Leet09LargestRectangleInHistogram leet09LargestRectangleInHistogram = new Leet09LargestRectangleInHistogram();
        System.out.println(leet09LargestRectangleInHistogram.largestRectangleArea(heights));
    }
}
