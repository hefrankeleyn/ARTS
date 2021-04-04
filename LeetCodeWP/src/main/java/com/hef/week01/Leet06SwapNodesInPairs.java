package com.hef.week01;

import java.util.List;

/**
 * @Date 2021/4/4
 * @Author lifei
 */
public class Leet06SwapNodesInPairs {

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

    public ListNode solution(ListNode head) {
        if (head==null || head.next ==null) {
            return head;
        }
        ListNode result = null;
        ListNode chile = null;
        ListNode tempNext = null;
        int i = 0;
        for (ListNode current = head; current!=null ; current = current.next) {
            i++;
            if (i%2==0) {
                tempNext = new ListNode(current.val, tempNext);
                if (chile!=null) {
                    chile.next.next = tempNext;
                }
                chile = tempNext;
            }else {
                tempNext = new ListNode(current.val);
            }
            if (current.next==null && i%2!=0) {
                chile.next.next = tempNext;
            }
            if (i%2==0 && result==null) {
                result = chile;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
