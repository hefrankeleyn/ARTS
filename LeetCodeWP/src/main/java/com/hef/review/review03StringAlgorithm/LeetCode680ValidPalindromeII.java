package com.hef.review.review03StringAlgorithm;

/**
 * @Date 2021/7/14
 * @Author lifei
 */
public class LeetCode680ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int i=0, j=s.length()-1;
        while(i<=j) {
            if (s.charAt(i)!=s.charAt(j)) {
                return valid(s.substring(i, j)) || valid(s.substring(i+1, j+1));
            }
            i++;
            j--;
        }
        return true;
    }

    private boolean valid(String s) {
        if (s==null || s.length()==0) return true;
        int i=0, j=s.length()-1;
        while(i<=j) {
            if (s.charAt(i)!=s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
