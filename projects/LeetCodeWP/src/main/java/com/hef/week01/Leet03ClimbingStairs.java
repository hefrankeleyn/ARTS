package com.hef.week01;

/**
 * @Date 2021/4/3
 * @Author lifei
 */
public class Leet03ClimbingStairs {

    public int climbingStairs(int n) {
        if (n<=2) return n;
        int i = 1, j = 2, res = 3;
        for (int x = 3; x <= n; x++){
            res = i + j;
            i = j;
            j = res;
        }
        return res;
    }

    public static void main(String[] args) {
        Leet03ClimbingStairs climbingStairs = new Leet03ClimbingStairs();
        System.out.println(climbingStairs.climbingStairs(5));
    }
}
