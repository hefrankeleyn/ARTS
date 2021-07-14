package com.hef.review.review03StringAlgorithm;

import java.util.*;

/**
 * @Date 2021/7/14
 * @Author lifei
 */
public class LeetCode438FindAllAnagramsInAString {

    public List<Integer> findAnagrams(String s, String p) {
        if (s==null || p==null || s.length()<p.length()) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        int k = p.length();
        char[] pa = p.toCharArray();
        Arrays.sort(pa);
        String ps = String.valueOf(pa);
        for (int i=0; i<=s.length()-k; i++) {
            String subS = s.substring(i, i+k);
            char[] suba = subS.toCharArray();
            Arrays.sort(suba);
            if (ps.equals(String.valueOf(suba))) {
                result.add(i);
            }
        }
        return result;
    }
}
