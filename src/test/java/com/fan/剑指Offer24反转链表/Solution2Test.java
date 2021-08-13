package com.fan.剑指Offer24反转链表;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer24反转链表解法2")
class Solution2Test {

    @Test
    void reverseList() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        Solution2 solution2 = new Solution2();
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, printLinkList(solution2.reverseList(head)));
    }
    private int[] printLinkList(ListNode head) {
        List<Integer> list = new LinkedList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}