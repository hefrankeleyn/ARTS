package com.hef.week06;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet1143LongestCommonubSequence {

    public static void main(String[] args) {
        Leet1143LongestCommonubSequence leet1143LongestCommonubSequence = new Leet1143LongestCommonubSequence();
        int res = leet1143LongestCommonubSequence.longestCommonSubsequence("abcde", "ace");
        System.out.println(res);
    }

    /**
     * 1. 最优子结构；
     * 2。 定义状态并存储状态；
     * 3。 DP方程；
     * @param text1
     * @param text2
     * @return
     */
    public int longestCommonSubsequence(String text1, String text2) {
        if (isEmpty(text1) || isEmpty(text2)) return 0;
        char[] a01 = text1.toCharArray();
        char[] a02 = text2.toCharArray();
        int m = a01.length, n = a02.length;
        int[][] dp = new int[m+1][n+1];
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                if (a02[j-1] == a01[i-1]) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[m][n];
    }

    public boolean isEmpty(String s) {
        if (s==null || s.equals("")) {
            return true;
        }else {
            return false;
        }
    }
}
