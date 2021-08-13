package com.fan.剑指Offer.剑指Offer10斐波那契数列;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer10斐波那契数列解法2")
class Solution2Test {

    @Test
    void fib() {
        Solution2 solution2 = new Solution2();
        assertEquals(1, solution2.fib(1));
        assertEquals(687995182, solution2.fib(100));
    }
}