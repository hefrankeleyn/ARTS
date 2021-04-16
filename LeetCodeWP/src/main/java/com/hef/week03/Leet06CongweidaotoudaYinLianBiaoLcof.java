package com.hef.week03;

import java.util.Arrays;

/**
 * @Date 2021/4/16
 * @Author lifei
 */
public class Leet06CongweidaotoudaYinLianBiaoLcof {

      private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
      }

    public static void main(String[] args) {
        ListNode head  = new ListNode(0);
        ListNode current = head;
        for (int i=1; i<20; i++) {
            current.next = new ListNode(i);
            current = current.next;
        }

        Leet06CongweidaotoudaYinLianBiaoLcof cong = new Leet06CongweidaotoudaYinLianBiaoLcof();
        int[] result = cong.reversePrint(head);
        System.out.println(Arrays.toString(result));
    }

    public int[] reversePrint(ListNode head) {
        if (head==null) return new int[0];
        int[] tempA = new int[10];
        int i = tempA.length;

        for (ListNode current = head; current!=null; current = current.next) {
            if (i-1<0) {
                int[] ta  = resizeDouble(tempA, i);
                i = ta.length - (tempA.length-i);
                tempA = ta;
            }
            tempA[--i] = current.val;
        }
        int[] result = new int[tempA.length-i];
        for (int t=i,j=0;t<tempA.length;t++) {
            result[j++] = tempA[t];
        }
        return result;
    }

    private int[] resizeDouble(int[] a, int beginIndex) {
        int n = a.length*2;
        int[] oneA = new int[n];
        int t = n-1;
        for (int j=a.length-1;j>=beginIndex;j--) {
            oneA[t--] = a[j];
        }

        return oneA;
    }
}
