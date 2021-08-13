package com.fan.剑指Offer.剑指Offer24反转链表;

import com.fan.helpers.ListNode;

public class Solution1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
