package com.hef.week08.homework;

/**
 * @Date 2021/6/1
 * @Author lifei
 */
public class LeetNumberOF1Bits {

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Math.pow(-2, 31));
        LeetNumberOF1Bits numberOF1Bits = new LeetNumberOF1Bits();
        System.out.println(numberOF1Bits.hammingWeight(00000000000000000000000000001011));
        System.out.println(numberOF1Bits.hammingWeight(-2147483648));
    }


    public int hammingWeight(int n) {
        int count = 0;
        while (n!=0) {
            n = n & (n-1);
            count ++;
        }
        return count;
    }
}
