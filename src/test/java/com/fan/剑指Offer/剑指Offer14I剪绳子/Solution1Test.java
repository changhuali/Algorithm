package com.fan.剑指Offer.剑指Offer14I剪绳子;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer14I剪绳子解法1")
class Solution1Test {

    @Test
    void cuttingRope() {

        Solution1 solution1 = new Solution1();
        assertEquals(1, solution1.cuttingRope(2));
        assertEquals(2, solution1.cuttingRope(3));
        assertEquals(4, solution1.cuttingRope(4));
        assertEquals(36, solution1.cuttingRope(10));
        assertEquals(1549681956, solution1.cuttingRope(58));
    }
}