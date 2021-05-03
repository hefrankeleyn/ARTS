package com.hef.week05.review;

/**
 * @Date 2021/5/3
 * @Author lifei
 */
public class LeetCode70ClimbingStairs {

    public static void main(String[] args) {
        int n = 6;
        LeetCode70ClimbingStairs climbingStairs = new LeetCode70ClimbingStairs();
        System.out.println(climbingStairs.solve01(n));
        System.out.println(climbingStairs.solve02(n));
        System.out.println(climbingStairs.solve03(n));
    }

    public int solve03(int n) {
        int[] a = new int[n+1];
        a[1] = 1;
        a[2] = 2;
        return reversionSolve03(n, a);
    }

    private int reversionSolve03(int n, int[] a) {
        if (a[n]!=0) {
            return a[n];
        }

        a[n] = reversionSolve03(n-1, a) + reversionSolve03(n-2, a);
        return a[n];
    }

    public int solve02(int n) {
        if (n<=2) {
            return n;
        }
        int x = 1, y= 2, res = 0;
        for (int i=3; i<=n; i++) {
            res = x + y;
            x = y;
            y = res;
        }
        return res;
    }

    public int solve01(int n) {
        return n<=2? n : solve01(n-1)+solve01(n-2);
    }
}
