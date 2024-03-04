package com.hef.week07.homework;

import java.util.*;

/**
 * @Date 2021/5/23
 * @Author lifei
 */
public class Leet127WordLadder {

    public static void main(String[] args) {
        Leet127WordLadder leet127WordLadder = new Leet127WordLadder();

        String s = "hit";
        String t = "cog";
        List<String> list = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log"));
        int n = leet127WordLadder.ladderLength(s, t, list);
        System.out.println(n);


    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList==null || wordList.size()==0) return 0;
        Set<String> wordSet = new HashSet<>(wordList);
        wordSet.remove(beginWord);
        Set<String> beginSet = new HashSet<>();
        Set<String> visited = new HashSet<>();
        beginSet.add(beginWord);
        visited.add(beginWord);
        int level = 1;
        while(!beginSet.isEmpty()) {
            Set<String> oneD = new HashSet<>();
            for (String str: beginSet) {
                char[] a = str.toCharArray();
                for (int i=0; i<a.length; i++) {
                    for (char c='a'; c<='z'; c++) {
                        char oldc = a[i];
                        a[i] = c;
                        String target = String.valueOf(a);
                        if (wordSet.contains(target) && target.equals(endWord)) {
                            return level+1;
                        }
                        if (wordSet.contains(target) && !visited.contains(target)) {
                            visited.add(target);
                            oneD.add(target);
                        }
                        a[i] = oldc;
                    }
                }
            }
            level ++;
            beginSet = oneD;
        }
        return 0;
    }
}
