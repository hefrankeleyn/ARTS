package com.hef.review.review02BitAlgorithm;

/**
 *
 * @Date 2021/7/12
 * @Author lifei
 */
public class LeetCode190ReverseBits {

    public static void main(String[] args) {
        LeetCode190ReverseBits reverseBits = new LeetCode190ReverseBits();
        int res = reverseBits.reverseBits(3);
        System.out.println(res);
    }



    public int reverseBits(int n) {
        int res = 0;
        for (int i=0; i<32; i++) {
            res = (res<<1) + (n&1);
            n>>=1;
        }
        return res;
    }
}
