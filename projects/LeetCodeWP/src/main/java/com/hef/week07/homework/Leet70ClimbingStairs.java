package com.hef.week07.homework;

/**
 * @Date 2021/5/22
 * @Author lifei
 */
public class Leet70ClimbingStairs {

    public static void main(String[] args) {
        Leet70ClimbingStairs leet70ClimbingStairs = new Leet70ClimbingStairs();
        int i = leet70ClimbingStairs.climbStairs(70);
        System.out.println(i);
    }

    public int climbStairs(int n) {
        if (n<=2) return n;
        return climbStairs(n, new int[n+1]);
    }

    private int climbStairs(int n, int[] a) {
        if (n<=2) return n;
        if (a[n]!=0) return a[n];
        a[n] = climbStairs(n-1, a) + climbStairs(n-2, a);
        return a[n];
    }
}
