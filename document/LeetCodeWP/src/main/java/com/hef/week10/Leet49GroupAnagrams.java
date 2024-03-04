package com.hef.week10;

import java.util.*;

/**
 * @Date 2021/6/13
 * @Author lifei
 */
public class Leet49GroupAnagrams {

    public static void main(String[] args) {
        Leet49GroupAnagrams groupAnagrams = new Leet49GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> res = groupAnagrams.groupAnagrams(strs);
        System.out.println(res);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs==null || strs.length==0) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str: strs){
            char[] a = str.toCharArray();
            Arrays.sort(a);
            List<String> list = map.getOrDefault(String.valueOf(a), new ArrayList<>());
            list.add(str);
            map.put(String.valueOf(a), list);
        }
        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}
