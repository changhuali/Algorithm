package com.fan.剑指Offer10斐波那契数列;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer10斐波那契数列解法1")
class Solution1Test {

    @Test
    void fib() {
        Solution1 solution1 = new Solution1();
        assertEquals(1, solution1.fib(1));
        assertEquals(687995182, solution1.fib(100));
    }
}