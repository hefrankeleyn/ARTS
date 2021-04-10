package com.hef.week02;

import java.util.Arrays;

/**
 * @Date 2021/4/10
 * @Author lifei
 */
public class MinQueue<T extends Comparable<T>> {

    private T[] values;
    private int size;

    public MinQueue(int capacity) {
        values = (T[]) new Comparable[capacity+1];
        size = 0;
    }

    public void add(T t) {
        if (size+1>=values.length) {
            resize(size*2);
        }
        values[++size] = t;
        swim(size);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T deleteMin() {
        if (isEmpty()) return null;
        T temp = values[1];
        exch(1, size--);
        values[size+1] = null;
        sink(1);
        return temp;
    }

    /**
     * 左节点不一定比右节点大，所有 不能在while中写上 大小判断
     * @param k
     */
    private void sink(int k) {
        while (k*2<=size) {
            int j = k * 2;
            if (j < size && less(j+1, j)) j++;
            if (!less(j, k)) break;
            exch(k, j);
            k = j;
        }
    }

    private void swim(int k) {
        while(k>1 && less(k, k/2)) {
            exch(k, k/2);
            k = k/2;
        }
    }

    private void exch(int i, int j) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
    }

    private boolean less(int i, int j) {
        return values[i].compareTo(values[j]) < 0;
    }

    private void resize(int n) {
        if (n<=size) return;
        T[] temp = (T[]) new Comparable[n];
        for (int i = 0; i<=size;i++) {
            temp[i] = values[i];
        }
        values = temp;
    }

    public static void main(String[] args) {
//        int[] arr = {0,1,2,3,4,0,3,3,8,1,4,6,2,8,8,15,10,0,9,9,1,2,17,8,17,25,18,18,16,13,18,29,2,3,32,2,26,23,18,8,34,8,11,36,36,39,46,30,21,25,21,14,41,10,31,55,45,16,33,47,4,52,59,60,1,43,42,10,12,56,12,27,22,52,38,12,41,42,71,5,42,76,8,3,31,65,11,29,28,68,33,50,73,87,22,68,31,1,38,89};
        int[] arr = {3,2,1};
        int k = 2;
//        int k =60;
        MinQueue<Integer> queue = new MinQueue<>(arr.length);
        for (Integer temp: arr) {
            queue.add(temp);
        }
        int[] result = new int[k];
        for (int i=0; i<k; i++) {
            int v = queue.deleteMin();
            result[i] = v;
        }
        System.out.println(Arrays.toString(result));
    }
}
