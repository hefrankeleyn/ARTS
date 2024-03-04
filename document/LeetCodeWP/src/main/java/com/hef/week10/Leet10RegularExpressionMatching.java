package com.hef.week10;

/**
 * @Date 2021/6/14
 * @Author lifei
 */
public class Leet10RegularExpressionMatching {

    public static void main(String[] args) {
        Leet10RegularExpressionMatching regularExpressionMatching = new Leet10RegularExpressionMatching();
        String word1 = "aa", word2 = "a*";
        boolean res = regularExpressionMatching.match01(word1, word2);
        boolean res2 = regularExpressionMatching.match02(word1, word2);
        boolean res3 = regularExpressionMatching.isMatch(word1, word2);
        System.out.println(res);
        System.out.println(res2);
        System.out.println(res3);
    }

    //  完全匹配
    private boolean match01(String word1, String word2) {
        if (word1.length()==0) return word2.length()==0;
        boolean res = false;
        if (word2.length()>0) {
            res = word1.charAt(0) == word2.charAt(0);
        }
        return res && match01(word1.substring(1), word2.substring(1));
    }

    // 匹配点
    private boolean match02(String word1, String word2) {
        if (word1.length()==0) return word2.length()==0;
        boolean res = false;
        if (word2.length()>0) {
            res = word1.charAt(0)==word2.charAt(0) || word2.charAt(0)=='.';
        }
        return res && match02(word1.substring(1), word2.substring(1));
    }

    public boolean isMatch(String s, String p) {
        if (s.length()==0) {
            return p.length()==0 || (p.length()>1 && p.charAt(1)=='*' && isMatch(s, p.substring(2)));
        }
        boolean res = false;
        if (p.length()>0) {
            res = s.charAt(0)==p.charAt(0) || p.charAt(0)=='.';
        }
        if (p.length()>1 && p.charAt(1)=='*') {
            System.out.println(">>>s: "+s + ", p:" + p);
            return isMatch(s, p.substring(2)) || (res && isMatch(s.substring(1), p));
        }else {
            System.out.println("s: "+s + ", p:" + p);
            return res && isMatch(s.substring(1), p.substring(1));
        }

    }
}
