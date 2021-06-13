package com.hef.week10;

/**
 * @Date 2021/6/13
 * @Author lifei
 */
public class Leet125ValidPalindrome {
    public static void main(String[] args) {
        Leet125ValidPalindrome validPalindrome = new Leet125ValidPalindrome();
//        String s = "A man, a plan, a canal: Panama";
        String s = "0P";
        boolean res = validPalindrome.isPalindrome(s);
        System.out.println(res);
    }

    public boolean isPalindrome(String s) {
        if (s==null || s.length()==0) return true;
        int i=0, j=s.length() - 1, n = s.length();
        do {
            while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))) {
                i++;
            }
            while(j>i && !((s.charAt(j)>='a' && s.charAt(j)<='z') || (s.charAt(j)>='A' && s.charAt(j)<='Z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))) {
                j--;
            }
            String s1 = String.valueOf(s.charAt(i)).toLowerCase();
            String s2 = String.valueOf(s.charAt(j)).toLowerCase();
            if (!s1.equals(s2)) {
                return false;
            }
            i++;
            j--;
        }while(i<j);
        return true;
    }
}
