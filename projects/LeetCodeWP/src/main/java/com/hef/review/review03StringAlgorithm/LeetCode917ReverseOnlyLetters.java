package com.hef.review.review03StringAlgorithm;

/**
 * @Date 2021/7/14
 * @Author lifei
 */
public class LeetCode917ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {
        if (s==null || s.length()==0) return s;
        char[] a = s.toCharArray();
        int i=0, j=a.length-1;
        while (i<j) {
            while (i<j && !((a[i]>='a' && a[i]<='z')||(a[i]>='A' && a[i]<='Z'))) i++;
            while (i<j && !((a[j]>='a' && a[j]<='z')||(a[j]>='A' && a[j]<='Z'))) j--;
            if (i<j) {
                exch(a, i++, j--);
            }
        }
        return String.valueOf(a);
    }

    private void exch(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
