package com.hef.week10;

import java.util.*;
/**
 * @Date 2021/6/13
 * @Author lifei
 */
public class Leet438FindAllAnagramsInAString {

    public static void main(String[] args) {
        Leet438FindAllAnagramsInAString findAllAnagramsInAString = new Leet438FindAllAnagramsInAString();
        String s= "cbaebabacd", t = "abc";
        List<Integer> res = findAllAnagramsInAString.findAnagrams(s, t);
        System.out.println(res);
    }

    public List<Integer> findAnagrams(String s, String p) {
        if (s==null || p==null || s.length()<p.length()) return new ArrayList<>();
        int k = p.length();
        char[] a = p.toCharArray();
        Arrays.sort(a);
        String comStr = String.valueOf(a);
        List<Integer> res = new ArrayList<>();
        for (int i=0; i<=s.length()-k; i++) {
            char[] ta = s.substring(i, i+k).toCharArray();
            Arrays.sort(ta);
            if (comStr.equals(String.valueOf(ta))) {
                res.add(i);
            }
        }
        return res;
    }
}
