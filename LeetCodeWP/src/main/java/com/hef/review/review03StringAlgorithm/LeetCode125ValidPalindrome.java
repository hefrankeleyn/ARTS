package com.hef.review.review03StringAlgorithm;

/**
 * @Date 2021/7/14
 * @Author lifei
 */
public class LeetCode125ValidPalindrome {

    public boolean isPalindrome(String s) {
        if (s==null || s.length()==0) return true;
        int i = 0, j = s.length()-1;
        String ls = s.toLowerCase();
        while (i<=j) {
            while(i<=j && !((ls.charAt(i)>='a' && ls.charAt(i)<='z')||(ls.charAt(i)>='0' && ls.charAt(i)<='9'))) i++;
            while(i<=j && !((ls.charAt(j)>='a' && ls.charAt(j)<='z')||(ls.charAt(j)>='0' && ls.charAt(j)<='9'))) j--;
            if (i<=j && ls.charAt(i)!=ls.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

}
