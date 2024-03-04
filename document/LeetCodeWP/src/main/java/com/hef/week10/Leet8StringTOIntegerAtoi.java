package com.hef.week10;

/**
 * @Date 2021/6/12
 * @Author lifei
 */
public class Leet8StringTOIntegerAtoi {

    public static void main(String[] args) {
        Leet8StringTOIntegerAtoi stringTOIntegerAtoi = new Leet8StringTOIntegerAtoi();
        int res = stringTOIntegerAtoi.myAtoi("42");
        System.out.println(res);
    }

    public int myAtoi(String s) {
        if (s==null || s.length()==0) return 0;
        int i=0, res = 0, sign = 1;
        // 获取第一个符号
        int n = s.length();
        while (i<n && s.charAt(i)==' ') {
            i++;
        }
        if (i>=n) return 0;
        // 判断正负号
        if (s.charAt(i)=='-' || s.charAt(i)=='+') {
            sign = s.charAt(i)=='-'?-1:1;
            i++;
        }
        if (i>=n || s.charAt(i)<'0' || s.charAt(i)>'9') return 0;

        // 开始获取值
        for (; i<n && s.charAt(i)>='0' && s.charAt(i)<='9'; i++) {
            int v = s.charAt(i) - '0';
            if (Integer.MAX_VALUE/10<res || (Integer.MAX_VALUE/10==res && Integer.MAX_VALUE%10<v)) {
                return sign==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            res = res * 10 + v;
        }
        return res * sign;
    }
}
