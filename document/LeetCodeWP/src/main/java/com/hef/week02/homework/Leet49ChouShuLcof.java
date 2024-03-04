package com.hef.week02.homework;


import java.util.*;
/**
 * @Date 2021/4/11
 * @Author lifei
 */
public class Leet49ChouShuLcof {

    public int nthUglyNumber(int n) {
        Long result = 1l;
        if (n==1) return result.intValue();

        int[] base = {2, 3, 5};
        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> queue = new PriorityQueue<>();
        queue.offer(1L);
        set.add(1L);
        for (int i=0; i<n; i++) {
            result = queue.poll();
            for (Integer temp: base) {
                Long tempV = result * temp;
                if (set.add(tempV)) {
                    queue.add(tempV);
                }
            }
        }
        return result.intValue();
    }

    public static void main(String[] args) {
        int n = 10;
        Leet49ChouShuLcof chouShuLcof = new Leet49ChouShuLcof();
        System.out.println(chouShuLcof.nthUglyNumber(n));
    }
}
