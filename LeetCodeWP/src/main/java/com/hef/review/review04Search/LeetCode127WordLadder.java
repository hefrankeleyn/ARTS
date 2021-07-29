package com.hef.review.review04Search;

import java.util.*;

/**
 * @Date 2021/7/29
 * @Author lifei
 */
public class LeetCode127WordLadder {

    public static void main(String[] args) {
        LeetCode127WordLadder wordLadder = new LeetCode127WordLadder();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));
        int res = wordLadder.ladderLength(beginWord, endWord, wordList);
        System.out.println(res);
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        wordSet.remove(beginWord);
        Set<String> visited = new HashSet<>();
        Deque<String> deque = new ArrayDeque<>();
        deque.addLast(beginWord);
        Deque<String> deque02 = new ArrayDeque<>();
        int res = 0;
        while(!deque.isEmpty()) {
            String str = deque.removeLast();
            if (str.equals(endWord)) return res+1;
            char[] a = str.toCharArray();
            for (int i=0; i<a.length; i++) {
                char old = a[i];
                for (char c='a'; c<='z'; c++) {
                    a[i] = c;
                    String ts = String.valueOf(a);
                    if (!visited.contains(ts) && wordSet.contains(ts)) {
                        visited.add(ts);
                        deque02.addLast(ts);
                    }
                }
                a[i] = old;
            }
            if (deque.isEmpty()) {
                res += 1;
                deque = deque02;
                deque02 = new ArrayDeque<>();
            }
        }
        return 0;
    }

}
