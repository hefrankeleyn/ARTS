package com.hef.review.review03StringAlgorithm;

/**
 * @Date 2021/7/18
 * @Author lifei
 */
public class LeetCode5LongestPalindromicSubstring2 {

    public String longestPalindrome(String s) {
        if (s==null || s.length()==0) return "";
        int start=0, end = 0;
        for (int i=0; i<s.length(); i++) {
            int len1=searchPalindrome(i, i, s);
            int len2=searchPalindrome(i, i+1, s);
            int l = Math.max(len1, len2);
            if (l > end-start+1) {
                start = i - (l-1)/2;
                end = i + l/2;
            }
        }
        return s.substring(start, end+1);
    }

    private int searchPalindrome(int x, int y, String s) {
        while(x>=0 && y<s.length() && s.charAt(x)==s.charAt(y)) {
            x--;
            y++;
        }
        return y-x-1;
    }
}
