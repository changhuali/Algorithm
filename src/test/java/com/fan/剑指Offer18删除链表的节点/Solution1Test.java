package com.fan.剑指Offer18删除链表的节点;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer18删除链表的节点解法1")
class Solution1Test {

    @Test
    void deleteNode() {
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(1);
        head1.next.next.next = new ListNode(9);
        int[] result1 = {4, 5, 9};

        ListNode head2 = new ListNode(4);
        head2.next = new ListNode(5);
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(9);
        int[] result2 = {5, 1, 9};

        Solution1 solution1 = new Solution1();
        assertArrayEquals(result1, printListNode(solution1.deleteNode(head1, 1)));
        assertArrayEquals(result2, printListNode(solution1.deleteNode(head2, 4)));
    }

    private int[] printListNode(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}