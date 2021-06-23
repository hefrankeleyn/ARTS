package com.hef.week09;

import java.util.*;

/**
 * @Date 2021/6/23
 * @Author lifei
 */
public class LRUCache {

    private class DLinkedNode {
        int key;
        int value;
        DLinkedNode next, prev;
        public DLinkedNode(){}
        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, DLinkedNode> map = new HashMap<>();
    private int size;
    private int capacity;
    private DLinkedNode head, tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        //创建虚拟的头和尾
        this.head = new DLinkedNode();
        this.tail = new DLinkedNode();
        this.head.next = tail;
        this.tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = map.get(key);
        if (node==null) {
            return -1;
        }else {
            moveToHead(node);
            return node.value;
        }
    }

    public void put(int key, int value) {
        DLinkedNode node = map.get(key);
        if (node==null) {
            node = new DLinkedNode(key, value);
            map.put(key, node);
            addHead(node);
            size++;
            if (size>capacity) {
                DLinkedNode tailNode = removeTail();
                map.remove(tailNode.key);
                size--;
            }
        }else {
            node.value = value;
            moveToHead(node);
        }
    }

    private DLinkedNode removeTail() {
        DLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }

    private void removeNode(DLinkedNode node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    /**
     * 将结点移动到头部
     * @param node
     */
    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addHead(node);
    }
}
