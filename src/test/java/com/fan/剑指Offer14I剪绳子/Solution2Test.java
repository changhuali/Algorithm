package com.fan.剑指Offer14I剪绳子;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer14I剪绳子解法2")
class Solution2Test {

    @Test
    void cuttingRope() {
        Solution2 solution2 = new Solution2();
        assertEquals(1, solution2.cuttingRope(2));
        assertEquals(2, solution2.cuttingRope(3));
        assertEquals(4, solution2.cuttingRope(4));
        assertEquals(36, solution2.cuttingRope(10));
        assertEquals(1549681956, solution2.cuttingRope(58));
    }
}