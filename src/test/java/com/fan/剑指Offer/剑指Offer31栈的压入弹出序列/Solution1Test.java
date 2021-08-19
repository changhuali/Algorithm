package com.fan.剑指Offer.剑指Offer31栈的压入弹出序列;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer31栈的压入弹出序列解法1")
class Solution1Test {

    @Test
    void validateStackSequences() {
        Solution1 solution1 = new Solution1();
        int[] pushed1 = new int[]{1, 2, 3, 4, 5};
        int[] popped1 = new int[]{5, 4, 3, 2, 1};
        int[] popped2 = new int[]{5, 4, 3, 1, 2};
        assertTrue(solution1.validateStackSequences(pushed1, popped1));
        assertFalse(solution1.validateStackSequences(pushed1, popped2));
    }
}