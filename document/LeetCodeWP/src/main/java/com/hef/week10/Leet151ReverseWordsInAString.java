package com.hef.week10;

/**
 * @Date 2021/6/13
 * @Author lifei
 */
public class Leet151ReverseWordsInAString {

    public static void main(String[] args) {
        Leet151ReverseWordsInAString reverseWordsInAString = new Leet151ReverseWordsInAString();
        String s = "the sky is blue";
        String res = reverseWordsInAString.reverseWords(s);
        System.out.println(res);
    }

    public String reverseWords(String s) {
        if (s==null || s.length()==0) return s;
        String reS = reverseStr(s, 0, s.length()-1);
        StringBuilder sb = new StringBuilder();
        int i=0, j=0, n = reS.length();
        do {
            while (i<n && reS.charAt(i)==' ') i++;
            j = i;
            while (j<n && reS.charAt(j)!=' ') j++;
            sb.append(reverseStr(reS, i, j-1)+" ");
            i = j;
        }while(i<n);
        return sb.toString().trim();


    }

    private String reverseStr(String s, int begin, int end) {
        if (s==null || s.length()==0 || end>=s.length()) return "";
        char[] a = s.substring(begin, end+1).toCharArray();
        for (int i=0, j=a.length-1; i<j; i++, j--) {
            char c = a[i];
            a[i] = a[j];
            a[j] = c;
        }
        return String.valueOf(a);
    }
}
