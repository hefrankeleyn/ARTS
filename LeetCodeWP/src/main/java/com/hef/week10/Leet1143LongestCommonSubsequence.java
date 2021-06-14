package com.hef.week10;

/**
 * @Date 2021/6/14
 * @Author lifei
 */
public class Leet1143LongestCommonSubsequence {

    public static void main(String[] args) {
        Leet1143LongestCommonSubsequence leet1143LongestCommonSubsequence = new Leet1143LongestCommonSubsequence();
        String word1 = "abcde", word2 = "ace";
        int res = leet1143LongestCommonSubsequence.longestCommonSubsequence(word1, word2);
        System.out.println(res);
    }

    public int longestCommonSubsequence(String text1, String text2) {
        if (text1==null || text2==null || text1.length()==0 || text2.length()==0) return 0;
        int n1 = text1.length(), n2 = text2.length();
        int[][] dp = new int[n1+1][n2+1];
        for (int i=1; i<dp.length; i++) {
            for (int j=1; j<dp[i].length; j++) {
                if (text1.charAt(i-1)==text2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }
}
