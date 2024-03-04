package com.hef.review.review02BitAlgorithm;

/**
 * 打掉最低位的 1
 * @Date 2021/7/12
 * @Author lifei
 */
public class LeetCode191NumberOF1Bits {

    public static void main(String[] args) {
        LeetCode191NumberOF1Bits leetCode191NumberOF1Bits = new LeetCode191NumberOF1Bits();
        int res = leetCode191NumberOF1Bits.hammingWeight(35);
        System.out.println(res);
        System.out.println(2 & (-2));
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(-2));
    }

    public int hammingWeight(int n) {
        int res = 0;
        while (n!=0) {
            n = n & (n-1);
            res++;
        }
        return res;
    }

    public int hammingWeight02(int n) {
        int k = 1;
        int res = 0;
        for (int i=0; i<32; i++) {
            if ((k & n)!=0) {
                res++;
            }
            k <<=1;
        }
        return res;
    }
}
