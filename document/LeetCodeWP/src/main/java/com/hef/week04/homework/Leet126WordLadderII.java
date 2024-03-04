package com.hef.week04.homework;

import java.util.*;
/**
 * @Date 2021/4/27
 * @Author lifei
 */
public class Leet126WordLadderII {

    public static void main(String[] args) {
        Leet126WordLadderII wordLadderII = new Leet126WordLadderII();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot","dot","dog","lot","log","cog");
        List<List<String>> result = wordLadderII.findLadders(beginWord, endWord, wordList);
        System.out.println(result);
    }

    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        List<List<String>> result = new ArrayList<>();
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord)) {
            return result;
        }
        dict.remove(beginWord);

        Map<String, Integer> steps = new HashMap<>();
        Map<String, List<String>> froms = new HashMap<>();
        Deque<String> visited = new ArrayDeque<>();
        visited.add(beginWord);
        int step = 1;
        boolean flag = false;
        while (!visited.isEmpty()) {
            int size = visited.size();
            for (int x=0; x<size; x++) {
                String currentStr = visited.poll();
                char[] ca = currentStr.toCharArray();
                for (int i = 0; i < ca.length; i++) {
                    char origin = ca[i];
                    for (char c = 'a'; c <= 'z'; c++) {
                        ca[i] = c;
                        String nextStr = String.valueOf(ca);
                        if (steps.containsKey(nextStr) && step == steps.get(nextStr)) {
                            froms.get(nextStr).add(currentStr);
                        }
                        if (!dict.contains(nextStr)) {
                            continue;
                        }
                        dict.remove(nextStr);
                        visited.offer(nextStr);

                        froms.putIfAbsent(nextStr, new ArrayList<>());
                        froms.get(nextStr).add(currentStr);
                        steps.put(nextStr, step);
                        if (nextStr.equals(endWord)) {
                            flag = true;
                        }
                    }
                    ca[i] = origin;
                }
            }
            step ++;
            if (flag) {
                break;
            }
        }


        if (flag) {
            Deque<String> oneV = new ArrayDeque<>();
            oneV.addFirst(endWord);
            dfs(result, oneV, froms, beginWord, endWord);
        }

        return result;
    }

    private void dfs(List<List<String>> result, Deque<String> oneV, Map<String, List<String>> froms, String beginWord, String endWord) {
        if (endWord.equals(beginWord)) {
            result.add(new ArrayList<>(oneV));
            return;
        }
        for (String next : froms.get(endWord)) {
            oneV.addFirst(next);
            dfs(result, oneV, froms, beginWord, next);
            oneV.removeFirst();
        }
    }
}
