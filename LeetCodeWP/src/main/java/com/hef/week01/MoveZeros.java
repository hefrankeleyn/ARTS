package com.hef.week01;

import java.util.Arrays;

/**
 * @Date 2021/4/1
 * @Author lifei
 */
public class MoveZeros {

    public void solution(int[] a){
        if (a==null || a.length ==0) {
            return;
        }

        int i  = 0;
        while (i<a.length && a[i]!=0) {
            i++;
        }
        for (int j = i+1; j<a.length;j++){
            while (j<a.length && a[j]==0){
                j++;
            }
            if (i<j){
                exch(a, i, j);
                ++i;
            }
        }
    }

    private void exch(int[] a, int i, int j){
        int t  = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    public static void main(String[] args){
        int[] a = {3, 0, 5, 1, 0, 3 , 2};
        MoveZeros moveZeros = new MoveZeros();
        System.out.println(Arrays.toString(a));
        moveZeros.solution(a);
        System.out.println(Arrays.toString(a));
    }
}
