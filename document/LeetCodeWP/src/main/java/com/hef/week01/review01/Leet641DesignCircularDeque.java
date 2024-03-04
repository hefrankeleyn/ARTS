package com.hef.week01.review01;

/**
 * @Date 2021/4/6
 * @Author lifei
 */
public class Leet641DesignCircularDeque {

    private Node head;
    private Node tail;
    private int container;
    private int size;

    private class Node{
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public Leet641DesignCircularDeque(int k) {
        this.container = k;
        this.size = 0;
    }

    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if (size >= container ) return false;
        if (head==null) {
            head = new Node(value, null);
            tail = head;
            head.next = tail;
            tail.next = head;
        }else {
            head = new Node(value, head);
            tail.next = head;
        }

        ++size;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if (size >= container) return false;
        if (tail==null) {
            head = new Node(value, null);
            head.next = head;
            tail = head;
        }else {
            tail.next = new Node(value, head);
            tail = tail.next;
        }
        ++size;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if (isEmpty()) return false;
        if (size==1) {
            tail  = null;
            head = null;
        }else {
            tail.next = head.next;
            head = tail.next;
        }
        --size;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if (isEmpty()) return false;
        if (size == 1) {
            tail = null;
            head = null;
        }else {
            Node current = head;
            while (current.next != tail) {
                current = current.next;
            }
            current.next  = tail.next;
            tail = current;
        }
        --size;
        return true;
    }

    /** Get the front item from the deque. */
    public int getFront() {
        if (isEmpty()) return -1;
        return head.val;
    }

    /** Get the last item from the deque. */
    public int getRear() {
        if (isEmpty()) return -1;
        return tail.val;
    }

    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == container;
    }
}
