package com.hef.week10;

/**
 * @Date 2021/6/13
 * @Author lifei
 */
public class Leet242ValidAnagram {

    public static void main(String[] args) {
        Leet242ValidAnagram validAnagram = new Leet242ValidAnagram();
        String s = "anagram" , t ="nagaram";
        boolean res = validAnagram.isAnagram(s, t);
        System.out.println(res);
    }

    public boolean isAnagram(String s, String t) {
        if (s==null || t==null || s.length()!=t.length()) return false;
        int[] a = new int[26];
        for (int i=0; i<s.length(); i++) {
            int index = s.charAt(i)-'a';
            a[index] = a[index] + 1;
        }
        for (int i=0; i<t.length(); i++) {
            int index = t.charAt(i)-'a';
            a[index] = a[index] -1;
            if (a[index]<0) {
                return false;
            }
        }
        return true;
    }
}
