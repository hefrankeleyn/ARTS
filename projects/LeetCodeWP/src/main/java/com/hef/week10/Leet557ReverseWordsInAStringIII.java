package com.hef.week10;

/**
 * @Date 2021/6/13
 * @Author lifei
 */
public class Leet557ReverseWordsInAStringIII {

    public static void main(String[] args) {
        Leet557ReverseWordsInAStringIII reverseWordsInAStringIII = new Leet557ReverseWordsInAStringIII();
        String s = "hello world ";
        String res = reverseWordsInAStringIII.reverseWords(s);
        System.out.println(res);
    }

    public String reverseWords(String s) {
        if (s==null || s.length()==0) return s;
        char[] a = s.toCharArray();
        int i=0, n = a.length;
        do{
            while (i<n && a[i]==' ') i++;
            int j = i;
            while (j<n && a[j]!=' ') j++;
            reverse(a, i, j-1);
            i = j;
        }while (i<n);
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
