package com.fan.剑指Offer.剑指Offer24反转链表;

import com.fan.helpers.ListNode;

public class Solution2 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
