package com.hef.week07.homework;

import java.util.*;

/**
 * @Date 2021/5/23
 * @Author lifei
 */
public class Leet127WordLadder02 {

    public static void main(String[] args) {
        Leet127WordLadder02 wordLadder02 =  new Leet127WordLadder02();
        String s = "hot", t = "dog";
//        List<String> list = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log"));
//        List<String> list = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
        List<String> list = new ArrayList<>(Arrays.asList("hot","dog"));
        int n = wordLadder02.ladderLength(s, t, list);
        System.out.println(n);
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (wordList==null || wordList.size()==0) return 0;
        Set<String> keys = new HashSet<>(wordList);
        if (!keys.contains(endWord)) return 0;
//        keys.remove(beginWord);
        Set<String> visited = new HashSet<>();
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        beginSet.add(beginWord);
        endSet.add(endWord);
        visited.add(beginWord);
        int level = 1;
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            if (beginSet.size()>endSet.size()) {
                Set<String> set = beginSet;
                beginSet = endSet;
                endSet = set;
            }
            Set<String> tmp = new HashSet<>();
            for (String str: beginSet) {
                char[] ca = str.toCharArray();
                for (int i=0; i<ca.length; i++) {
                    for (char c='a'; c<='z'; c++) {
                        char oldC = ca[i];
                        ca[i] = c;
                        String target = String.valueOf(ca);
                        if (endSet.contains(target)) {
                            return level+1;
                        }
                        if (keys.contains(target) && !visited.contains(target)) {
                            visited.add(target);
                            tmp.add(target);
                        }
                        ca[i] = oldC;
                    }
                }
            }
            level++;
            beginSet =  tmp;
        }

        return 0;
    }
}
