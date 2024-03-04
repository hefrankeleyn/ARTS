package com.hef.week01;

import java.util.List;

/**
 * @Date 2021/4/4
 * @Author lifei
 */
public class Leet07ReverseNodesInkGroup {

    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseNodesInkGroup(ListNode head, int k) {
        if (head==null || k==1) {
            return head;
        }
        int n = 0;
        for (ListNode current = head; current!=null; ++n, current = current.next);

        ListNode temp = new ListNode(-1);
        temp.next = head;
        for (ListNode pre = temp, tail = head;n>k; n-=k) {
            for (int i = 0; i<k; i++) {
                ListNode next = tail.next.next;
                tail.next.next = pre.next;
                pre.next = tail.next;
                tail.next = next;
            }
            pre = tail;
            tail = tail.next;
        }
        return temp.next;
    }
}
