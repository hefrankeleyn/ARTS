package com.hef.review.review03StringAlgorithm;

import java.util.*;

/**
 * @Date 2021/7/14
 * @Author lifei
 */
public class LeetCode49GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs==null || strs.length==0) return new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for (String item: strs) {
            char[] a = item.toCharArray();
            Arrays.sort(a);
            List<String> list = map.getOrDefault(String.valueOf(a), new ArrayList<>());
            list.add(item);
            map.put(String.valueOf(a), list);
        }
        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String,List<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}
