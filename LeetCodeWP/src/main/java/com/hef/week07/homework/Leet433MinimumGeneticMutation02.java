package com.hef.week07.homework;

import java.util.*;

/**
 * 双向BFS
 * @Date 2021/5/23
 * @Author lifei
 */
public class Leet433MinimumGeneticMutation02 {

    public int minMutation(String start, String end, String[] bank) {
        if (start==null || end==null || bank==null || bank.length==0) return -1;
        Set<String> keySet = new HashSet<>(Arrays.asList(bank));
        keySet.remove(start);
        if (!keySet.contains(end)) return -1;
        Set<String> beginSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();
        beginSet.add(start);
        endSet.add(end);
        Set<String> visited = new HashSet<>();
        visited.add(start);
        int level = 0;
        char[] ca = {'A', 'C', 'G', 'T'};
        while (!beginSet.isEmpty() && !endSet.isEmpty()) {
            if (beginSet.size()>endSet.size()) {
                Set<String> set = new HashSet<>(beginSet);
                beginSet = endSet;
                endSet = set;
            }
            Set<String> tempSet = new HashSet<>();
            for (String str: beginSet) {
                char[] a = str.toCharArray();
                for (int i=0; i<a.length; i++) {
                    for (char c: ca) {
                        char oc = a[i];
                        a[i] = c;
                        String target = String.valueOf(a);
                        if (endSet.contains(target)) return level+1;
                        if (keySet.contains(target) && !visited.contains(target)) {
                            visited.add(target);
                            tempSet.add(target);
                        }
                        a[i] = oc;
                    }
                }
            }
            level++;
            beginSet=tempSet;
        }
        return -1;
    }

}
