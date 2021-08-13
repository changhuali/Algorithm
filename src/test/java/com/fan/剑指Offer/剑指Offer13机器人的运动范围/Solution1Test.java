package com.fan.剑指Offer.剑指Offer13机器人的运动范围;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer13机器人的运动范围解法1")
class Solution1Test {

    @Test
    void movingCount() {
        Solution1 solution1 = new Solution1();
        assertEquals(3, solution1.movingCount(2, 3, 1));
        assertEquals(1, solution1.movingCount(3, 1, 0));
        assertEquals(2631, solution1.movingCount(100, 30, 20));
    }
}