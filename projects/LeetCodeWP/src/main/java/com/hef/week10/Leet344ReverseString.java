package com.hef.week10;

import java.util.Arrays;

/**
 * @Date 2021/6/13
 * @Author lifei
 */
public class Leet344ReverseString {

    public static void main(String[] args) {
        char[] s = "hello world".toCharArray();
        Leet344ReverseString reverseString = new Leet344ReverseString();
        System.out.println(Arrays.toString(s));
        reverseString.reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public void reverseString(char[] s) {
        if (s==null || s.length==0) return;
        for (int i=0, j=s.length-1; i<j ; i++, j--) {
            char c = s[i];
            s[i] = s[j];
            s[j] = c;
        }
    }
}
