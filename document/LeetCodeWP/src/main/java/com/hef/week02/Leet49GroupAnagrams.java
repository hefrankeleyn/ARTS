package com.hef.week02;

import java.util.*;

/**
 * @Date 2021/4/6
 * @Author lifei
 */
public class Leet49GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String temp : strs) {
            char[] tempA = temp.toCharArray();
            Arrays.sort(tempA);
            String ts = new String(tempA);
            if (map.containsKey(ts)) {
                map.get(ts).add(temp);
            }else {
                List<String> oneList = new ArrayList<>();
                oneList.add(temp);
                map.put(ts, oneList);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry: map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        Leet49GroupAnagrams groupAnagrams = new Leet49GroupAnagrams();
        System.out.println(groupAnagrams.groupAnagrams(strs));
    }
}
