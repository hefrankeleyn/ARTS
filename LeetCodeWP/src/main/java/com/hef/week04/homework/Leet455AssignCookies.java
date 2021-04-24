package com.hef.week04.homework;

import java.util.*;
/**
 * 发饼干
 * @Date 2021/4/24
 * @Author lifei
 */
public class Leet455AssignCookies {

    public static void main(String[] args) {
        int[] g = {1,2,3}, s = {1,1};
        Deque<Integer> deque = new ArrayDeque<>();
        Leet455AssignCookies assignCookies = new Leet455AssignCookies();
        System.out.println(assignCookies.findContentChildren(g, s));
    }

    public int findContentChildren(int[] g, int[] s) {
        if (g==null || s==null) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int r = 0;
        for (int i=g.length-1, j=s.length-1; i>=0 && j>=0;) {
            if (s[j]>=g[i]) {
                r++;
                i--;
                j--;
            }else {
                i--;
            }
        }
        return r;
    }
}
