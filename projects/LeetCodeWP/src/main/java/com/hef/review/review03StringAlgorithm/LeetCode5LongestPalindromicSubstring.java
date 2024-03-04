package com.hef.review.review03StringAlgorithm;

/**
 * @Date 2021/7/18
 * @Author lifei
 */
public class LeetCode5LongestPalindromicSubstring {

    private int subLen;
    private int subBeginIndex;
    public String longestPalindrome(String s) {
        if (s==null || s.length()==0) return "";
        subLen=0;
        subBeginIndex=0;
        for (int i=0; i<s.length(); i++) {
            searchPalindrome(i, s);
            searchPalindrome(i, i+1, s);
        }
        return s.substring(subBeginIndex, subBeginIndex+subLen);
    }

    private void searchPalindrome(int i, int j, String s) {
        int x=i, y=j, l=0;
        while(x>=0 && y<s.length()) {
            if (s.charAt(x)==s.charAt(y)) {
                l = y - x + 1;
            }else {
                break;
            }
            if (l>subLen) {
                subLen = l;
                subBeginIndex = x;
            }
            x--;
            y++;
        }
    }

    private void searchPalindrome(int i, String s) {
        int x=i, y=i, l=0;
        while (x>=0 && y<s.length()) {
            if (s.charAt(x)==s.charAt(y)) {
                l = y - x + 1;
            }else {
                break;
            }
            if (l>subLen) {
                subLen = l;
                subBeginIndex=x;
            }
            x--;
            y++;
        }
    }
}
