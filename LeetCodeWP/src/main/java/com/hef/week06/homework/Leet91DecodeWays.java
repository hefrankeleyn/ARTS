package com.hef.week06.homework;

/**
 * @Date 2021/5/16
 * @Author lifei
 */
public class Leet91DecodeWays {

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str.substring(1, 3));

        Leet91DecodeWays leet91DecodeWays = new Leet91DecodeWays();
        int res = leet91DecodeWays.numDecodings("12");
        System.out.println(res);
    }

    public int numDecodings(String s) {
        if (s==null || s.equals("")) return 0;
        char[] a = s.toCharArray();
        int n = a.length;
        if (a[0]=='0') return 0;
        if (n==1) return 1;
        int x = 1;
        int y = 1;
        int res = y;
        for (int i=1; i<a.length; i++) {
            if ((a[i]=='0' && Integer.parseInt(s.substring(i-1, i+1))>26) || (a[i]=='0' && a[i-1]=='0')) {
                return 0;
            }
            if (a[i]=='0') {
                y = 0;
            }
            if (a[i-1]=='0' || Integer.parseInt(s.substring(i-1, i+1))>26) {
                x = 0;
            }
            // 是否能-1
            res = x + y;
            x = y;
            y = res;

        }
        return res;
    }
}
