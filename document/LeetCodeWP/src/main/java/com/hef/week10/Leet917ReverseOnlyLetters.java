package com.hef.week10;

/**
 * @Date 2021/6/13
 * @Author lifei
 */
public class Leet917ReverseOnlyLetters {

    public static void main(String[] args) {
        Leet917ReverseOnlyLetters reverseOnlyLetters = new Leet917ReverseOnlyLetters();
        String s = "z<*zj";
        String res = reverseOnlyLetters.reverseOnlyLetters(s);
        System.out.println(res);
    }

    public String reverseOnlyLetters(String s) {
        if (s==null || s.length()==0) return s;
        char[] a = s.toCharArray();
        int i=0, j=a.length -1, n = a.length;
        do {
            while (i<j && !((a[i]>='a' && a[i]<='z') || (a[i]>='A' && a[i]<='Z'))) i++;
            while (j>i && !((a[j]>='a' && a[j]<='z') || (a[j]>='A' && a[j]<='Z'))) j--;
            if (i<j) {
                exch(a, i, j);
            }
            i++;
            j--;
        }while (i<j);
        return String.valueOf(a);
    }

    private void exch(char[] a, int i, int j) {
        char c = a[i];
        a[i] = a[j];
        a[j] = c;
    }
}
