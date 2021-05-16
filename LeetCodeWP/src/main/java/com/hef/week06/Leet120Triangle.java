package com.hef.week06;

import java.util.*;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet120Triangle {

    public static void main(String[] args) {
        Leet120Triangle leet120Triangle = new Leet120Triangle();
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3,4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        int res = leet120Triangle.minimumTotal(triangle);
        System.out.println(res);
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle==null || triangle.size()==0) return 0;
        if (triangle.size()==1) return triangle.get(0).get(0);
        int m = triangle.size();
        Integer[] dp = triangle.get(m-1).toArray(new Integer[0]);
        for (int i=m-2; i>=0; i--) {
            List<Integer> oneList = triangle.get(i);
            for (int j=0; j<oneList.size(); j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + oneList.get(j);
            }
        }
        return dp[0];
    }
}
