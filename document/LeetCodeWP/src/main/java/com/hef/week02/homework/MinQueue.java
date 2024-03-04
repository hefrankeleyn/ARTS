package com.hef.week02.homework;

/**
 * @Date 2021/4/11
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
        return size==0;
    }

    public int size() {
        return size;
    }

    public T delMin() {
        if (isEmpty()) return null;
        T temp = values[1];
        exch(1, size--);
        values[size+1]= null;
        sink(1);
        return temp;
    }

    private void sink(int k) {
        while (2*k<=size) {
            int j = 2*k;
            if (j<size && less(j+1,j)) j+=1;
            if (!less(j, k)) break;
            exch(j, k);
            k = j;
        }
    }

    private void swim(int k) {
        while (k>1 && less(k, k/2)) {
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
        if (n<size) return;
        T[] temp = (T[]) new Comparable[n];
        for (int i=0; i<=size; i++) {
            temp[i] = values[i];
        }
        values = temp;
    }

    public static void main(String[] args) {
        MinQueue<Integer> queue = new MinQueue<>(3);
        queue.add(5);
        queue.add(3);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(1);
        while (!queue.isEmpty()) {
            System.out.println(queue.delMin());
        }
    }
}
