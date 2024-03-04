package com.hef.week02.homework;

import java.util.*;
/**
 *  前K个高频元素的习题
 * @Date 2021/4/10
 * @Author lifei
 */
public class Leet347TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums==null ||nums.length==0 || k==0) return new int[0];
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer temp: nums) {
            map.put(temp, map.getOrDefault(temp, 0) +1);
        }
        PriorityQueue<Item> queue = new PriorityQueue<>((o1,o2)->{return o2.countNum.compareTo(o1.countNum);});
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            queue.offer(new Item(entry.getValue(), entry.getKey()));
        }
        int[] result = new int[k];
        for (int i=0;i<k;i++) {
            result[i] = queue.remove().itemValue;
        }

        return result;
    }

    class Item implements Comparable<Item>{
        Integer countNum;
        Integer itemValue;

        public Item(Integer countNum, Integer itemValue) {
            this.countNum = countNum;
            this.itemValue = itemValue;
        }

        public boolean equals(Object o) {
            Item other = (Item) o;
            return countNum.compareTo(other.countNum)==0;
        }

        public int compareTo(Item o) {
            return countNum.compareTo(o.countNum);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int k = 2;
        Leet347TopKFrequentElements topKFrequentElements = new Leet347TopKFrequentElements();
        System.out.println(Arrays.toString(topKFrequentElements.topKFrequent(arr, k)));
    }

}
