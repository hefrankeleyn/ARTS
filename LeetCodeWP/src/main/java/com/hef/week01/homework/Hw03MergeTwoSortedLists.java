package com.hef.week01.homework;

/**
 * 合并两个有序链表
 *    借助归并排序的思路
 * @Date 2021/4/5
 * @Author lifei
 */
public class Hw03MergeTwoSortedLists {

    static class ListNode{
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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null) return l2;
        else if (l2 == null) return l1;
        ListNode result = new ListNode(0);
        ListNode start01 = result;
        for (ListNode current01 = l1,current02 = l2;current01!=null && current02!=null;) {
            if (current01.val == current02.val) {
                start01.next = current01;
                start01  = start01.next;
                current01 = current01.next;
                start01.next = current02;
                current02 = current02.next;
                start01 = start01.next;
            }else if (current01.val < current02.val) {
                start01.next = current01;
                start01  = start01.next;
                current01 = current01.next;
            }else {
                start01.next = current02;
                current02 = current02.next;
                start01 = start01.next;
            }
            if (current01==null) {
                start01.next = current02;
            }else if (current02==null) {
                start01.next = current01;
            }

        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode listNode01 = new ListNode(1);
        ListNode listNode02 = new ListNode(2);
        Hw03MergeTwoSortedLists mergeTwoSortedLists = new Hw03MergeTwoSortedLists();
        mergeTwoSortedLists.mergeTwoLists(listNode01, listNode02);

    }
}
