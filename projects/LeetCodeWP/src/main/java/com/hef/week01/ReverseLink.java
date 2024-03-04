package com.hef.week01;

/**
 * @Date 2021/4/5
 * @Author lifei
 */
public class ReverseLink {

    private Node head;

    class Node {
        int val;
        Node next;
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public Node reverseNode(Node head) {
        Node prev = null;
        Node current = head;
        while (current!=null) {
            // 备份当前节点后面的链
            Node next = current.next;
            // 将当前节点与后面的链断开
            current.next = prev;
            // 新链: 1、 2-1、 3-2-1、
            prev = current;
            // 将当前节点指向未反转的链
            current = next;
        }
        return prev;
    }
}
