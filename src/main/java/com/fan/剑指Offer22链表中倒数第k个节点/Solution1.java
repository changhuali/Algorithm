package com.fan.剑指Offer22链表中倒数第k个节点;

public class Solution1 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null) return null;
        ListNode currNode = head.next;
        int n = 1;
        while (currNode != null) {
            currNode = currNode.next;
            n++;
        }
        while (n - k > 0) {
            head = head.next;
            k++;
        }
        return head;
    }
}
