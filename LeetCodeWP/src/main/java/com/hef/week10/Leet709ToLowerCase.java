package com.hef.week10;

/**
 * @Date 2021/6/8
 * @Author lifei
 */
public class Leet709ToLowerCase {

    public static void main(String[] args) {
        String str = "heLLo";
        Leet709ToLowerCase toLowerCase = new Leet709ToLowerCase();
        System.out.println(toLowerCase.toLowerCase(str));
    }

    public String toLowerCase(String s) {
        if (s==null) return s;
        int num = 'a' - 'A';
        char[] a = s.toCharArray();
        for (int i=0; i<a.length; i++) {
            if (a[i]>='A' && a[i]<='Z') {
                a[i] = (char)(a[i] + num);
            }
        }
        return String.valueOf(a);
    }
}
