package com.hef.week01.homework;

import java.util.Arrays;

/**
 * 暴力求解
 * @Date 2021/4/5
 * @Author lifei
 */
public class Hw06PlusOne {

    public int[] plusOne(int[] digits) {
        if (checkoutAllNine(digits)) {
            int[] result = new int[digits.length+1];
            result[0] = 1;
            return result;
        }
        int addOne = 1;
        for (int i=digits.length-1; i>=0; i++) {
            if (addOne==0) return digits;
            if (digits[i] + addOne > 9) {
                digits[i] = digits[i] + addOne - 10;
            }else {
                digits[i] = digits[i] + addOne;
                addOne = 0;
            }
        }

        return digits;
    }

    private boolean checkoutAllNine(int[] digits) {
        for (int i = 0; i<digits.length; i++) {
            if (digits[i] < 9) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,3};

        Hw06PlusOne plusOne = new Hw06PlusOne();
        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(plusOne.plusOne(digits)));
    }
}
