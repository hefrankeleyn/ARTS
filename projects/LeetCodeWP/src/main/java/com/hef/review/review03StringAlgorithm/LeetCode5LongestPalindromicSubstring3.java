package com.hef.review.review03StringAlgorithm;

/**
 * @Date 2021/7/18
 * @Author lifei
 */
public class LeetCode5LongestPalindromicSubstring3 {

    public String longestPalindrome(String s) {
        if (s==null || s.length()==0) return "";
        int subLen = 0;
        int subBI = 0;
        int len = s.length();
        boolean[][] dp = new boolean[len][len];
        for (int i=len-1;i>=0; i--) {
            for (int j=i; j<len;j++) {
                dp[i][j] = s.charAt(i)==s.charAt(j) && (j-i<2 || dp[i+1][j-1]);
                if (dp[i][j] && j-i+1>subLen) {
                    subLen = j-i+1;
                    subBI = i;
                }
            }
        }
        return s.substring(subBI, subBI+subLen);
    }
    
}
