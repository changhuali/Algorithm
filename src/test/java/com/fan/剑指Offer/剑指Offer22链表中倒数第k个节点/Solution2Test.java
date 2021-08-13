package com.fan.剑指Offer.剑指Offer22链表中倒数第k个节点;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer22链表中倒数第k个节点解法2")
class Solution2Test {

    @Test
    void getKthFromEnd() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode((3));
        head.next.next.next = new ListNode(4);

        Solution2 solution2 = new Solution2();
        assertEquals(1, solution2.getKthFromEnd(head, 4).val);
    }
}