package com.hef.week02;

import java.util.*;

/**
 * @Date 2021/4/6
 * @Author lifei
 */
public class Leet242ValidAnagram {

    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else {
                map.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i<t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) -1);
            }else {
                return false;
            }
        }
        for (Map.Entry<Character, Integer> entry: map.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        Leet242ValidAnagram validAnagram = new Leet242ValidAnagram();
        System.out.println(validAnagram.isAnagram(s, t));
    }
}
