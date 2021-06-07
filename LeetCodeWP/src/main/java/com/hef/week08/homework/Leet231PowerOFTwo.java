package com.hef.week08.homework;

/**
 * @Date 2021/6/1
 * @Author lifei
 */
public class Leet231PowerOFTwo {

    public static void main(String[] args) {
        Leet231PowerOFTwo powerOFTwo = new Leet231PowerOFTwo();
        boolean res = powerOFTwo.isPowerOfTwo((int) Math.pow(2, 23));
        System.out.println(res);
    }

    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1)) == 0;
    }
}
