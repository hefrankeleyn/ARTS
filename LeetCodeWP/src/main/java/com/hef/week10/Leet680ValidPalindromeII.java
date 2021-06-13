package com.hef.week10;

/**
 * @Date 2021/6/13
 * @Author lifei
 */
public class Leet680ValidPalindromeII {

    public static void main(String[] args) {
        String str = "aaa";
        Leet680ValidPalindromeII leet680ValidPalindromeII = new Leet680ValidPalindromeII();
        boolean res = leet680ValidPalindromeII.validPalindrome(str);
        System.out.println(res);
    }

    public boolean validPalindrome(String s) {
        if (s==null || s.length()==0) return false;
        int i=0, j = s.length() -1;
        do {
            if (s.charAt(i)==s.charAt(j)) {
                i++;
                j--;
            }else {
                return validPalindrome(s, i+1, j) || validPalindrome(s, i, j-1);
            }
        }while(i<j);
        return true;
    }

    private boolean validPalindrome(String s, int low, int hight) {
        do {
            if (s.charAt(low)==s.charAt(hight)) {
                low++;
                hight--;
            }else {
                return false;
            }
        }while(low<hight);
        return true;
    }
}
