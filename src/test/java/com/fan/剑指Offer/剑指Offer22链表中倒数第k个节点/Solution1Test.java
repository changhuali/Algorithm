package com.fan.剑指Offer.剑指Offer22链表中倒数第k个节点;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer22链表中倒数第k个节点解法1")
class Solution1Test {

    @Test
    void getKthFromEnd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode((3));
        head.next.next.next = new ListNode(4);

        Solution1 solution1 = new Solution1();
        assertEquals(1, solution1.getKthFromEnd(head, 4).val);
    }
}