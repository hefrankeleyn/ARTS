package com.hef.review.review01sort.work01;


import java.util.*;
/**
 * 异位词：
 * https://leetcode-cn.com/problems/valid-anagram/
 * @Date 2021/7/3
 * @Author lifei
 */
public class LeetCode242ValidAnagram {

    public static void main(String[] args) {
        LeetCode242ValidAnagram validAnagram = new LeetCode242ValidAnagram();
        String s = "anagram", t = "nagaram";
        boolean res = validAnagram.isAnagram(s, t);
        System.out.println(res);
        System.out.println('z'-'a');
    }


    public boolean isAnagram(String s, String t) {
//        boolean res = solve01(s, t);
        boolean res = solve02(s, t);
        return res;
    }


    /**
     * 异位词的第一种解法
     * @param s
     * @param t
     * @return
     */
    private boolean solve01(String s, String t) {
        if (s==null || t==null || s.length()!=t.length()) return false;
        char[] a1 = s.toCharArray();
        char[] a2 = t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return String.valueOf(a1).equals(String.valueOf(a2));
    }

    /**
     * 解法二
     * @param s
     * @param t
     * @return
     */
    private boolean solve02(String s, String t) {
        if (s==null || t==null || s.length()!=t.length()) return false;
        int N = 'z'-'a' + 1;
        int[] a = new int[N];
        for (int i=0; i<s.length(); i++) {
            char k = s.charAt(i);
            char c = t.charAt(i);
            a[k-'a'] = a[k-'a']+1;
            a[c-'a'] = a[c-'a']-1;
        }
        for (int i=0; i<a.length; i++) {
            if (a[i]!=0) return false;
        }
        return true;
    }



}
