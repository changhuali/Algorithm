package com.fan.剑指Offer.剑指Offer30包含min函数的栈;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer30包含min函数的栈解法1")
class Solution1Test {

    @Test
    void test() {
        Solution1 solution1 = new Solution1();
        solution1.push(9);
        solution1.push(5);
        solution1.push(4);
        solution1.push(8);

        assertEquals(8, solution1.top());
        assertEquals(4, solution1.min());
    }
}