package com.fan.剑指Offer13机器人的运动范围;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer13机器人的运动范围解法2")
class Solution2Test {

    @Test
    void movingCount() {
        Solution2 solution2 = new Solution2();
        assertEquals(3, solution2.movingCount(2, 3, 1));
        assertEquals(1, solution2.movingCount(3, 1, 0));
        assertEquals(2631, solution2.movingCount(100, 30, 20));
    }
}