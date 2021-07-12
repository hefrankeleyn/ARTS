package com.hef.review.review02BitAlgorithm;

/**
 * 有且仅有一个二进制位是1
 * @Date 2021/7/12
 * @Author lifei
 */
public class LeetCode231PowerOFTwo {

    public static void main(String[] args) {
        int n = 24;
        String res = Integer.toBinaryString(n);
        System.out.println(res);
    }

    public boolean isPowerOfTwo(int n) {
        return n>0 && (n & (n-1)) == 0;
    }


}
