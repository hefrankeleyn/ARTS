package com.hef.week10;

/**
 * @Date 2021/6/13
 * @Author lifei
 */
public class Leet541ReverseStringII {

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 3;
        Leet541ReverseStringII reverseStringII = new Leet541ReverseStringII();
        String res = reverseStringII.reverseStr(s, k);
        System.out.println(res);
    }

    public String reverseStr(String s, int k) {
        if (s==null || s.length()==0) return s;
        char[] a = s.toCharArray();
        for (int i=0; i<a.length; i+=(2*k)) {
            int begin = i;
            int end  = (i + k - 1)>(a.length-1)?(a.length-1):(i+k-1);
            reverse(a, begin, end);
        }
        return String.valueOf(a);
    }

    private void reverse(char[] a, int begin, int end) {
        for (int i=begin, j=end; i<j; i++, j--) {
            char c = a[i];
            a[i] = a[j];
            a[j] = c;
        }
    }
}
