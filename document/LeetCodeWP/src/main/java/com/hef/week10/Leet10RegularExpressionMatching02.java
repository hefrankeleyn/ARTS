package com.hef.week10;

import java.util.Objects;
import java.util.*;
/**
 * @Date 2021/6/14
 * @Author lifei
 */
public class Leet10RegularExpressionMatching02 {

    public static void main(String[] args) {
        Leet10RegularExpressionMatching02 regularExpressionMatching02 = new Leet10RegularExpressionMatching02();
        String s = "", p = "c*c*";
        boolean res = regularExpressionMatching02.isMatch(s, p);
        System.out.println(res);
    }


    public boolean isMatch(String s, String p) {
        Map<Pair, Boolean> map = new HashMap<>();
        return isMatch(s, p, 0, 0, map);
    }

    private boolean isMatch(String s, String p, int i, int j, Map<Pair, Boolean> map) {
        if (map.containsKey(new Pair(i, j))) return map.get(new Pair(i, j));
        if (i == s.length()) {
//            return i==s.length();
            return j==p.length() || (j+2<=p.length() && p.charAt(j+1)=='*' && isMatch(s, p, i, j+2, map));
        }
        boolean res = false;
        if (j<p.length()) {
            res = s.charAt(i) == p.charAt(j) || p.charAt(j) == '.';
        }
        if (j<=p.length()-2 && p.charAt(j+1)=='*') {
            if (isMatch(s, p, i, j+2, map)) {
                res = true;
            }else {
                res = res && isMatch(s, p, i+1, j, map);
            }
//            res = isMatch(s, p, i, j+2, map) || (res && isMatch(s, p, i+1, j, map));
        }else {
            res = res && isMatch(s, p, i+1, j+1, map);
        }
        map.put(new Pair(i,j), res);
        return map.get(new Pair(i, j));
    }

    private class Pair{
        int i;
        int j;

        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public boolean equals(Object o) {
            Pair other = (Pair)o;
            return this.i==other.i && this.j==other.j;
        }

        public int hashCode() {
            return Objects.hash(i,j);
        }
    }

}
