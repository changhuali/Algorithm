package com.fan.剑指Offer22链表中倒数第k个节点;

public class Solution2 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode result = head;
        int n = 0;
        while (head != null) {
            n++;
            // n - (k - 1) > 1
            if (n > k) {
                result = result.next;
            }
            head = head.next;
        }
        return result;
    }
}
