package com.hef.week10;

/**
 * @Date 2021/6/12
 * @Author lifei
 */
public class Leet14LongestCommonPrefix {

    public static void main(String[] args) {
        Leet14LongestCommonPrefix leet14LongestCommonPrefix = new Leet14LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        String res = leet14LongestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(res);
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length==0) return "";
        int res = 0;
        String first = strs[0];
        if (first==null || first.length()==0) return "";
        resFlag:
        for (int i=0; i<first.length(); i++) {
            char c = first.charAt(i);
            for (int j=1; j<strs.length; j++) {
                if (strs[j]==null || strs[j].length()<=i ||strs[j].charAt(i)!=c) break resFlag;
            }
            res++;
        }
        return first.substring(0, res);
    }
}
