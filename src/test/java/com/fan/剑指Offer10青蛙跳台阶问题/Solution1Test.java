package com.fan.剑指Offer10青蛙跳台阶问题;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer10青蛙跳台阶问题解法1")
class Solution1Test {

    @Test
    void numWays() {
        Solution1 solution1 = new Solution1();
        assertEquals(1, solution1.numWays(0));
        assertEquals(1, solution1.numWays(1));
        assertEquals(2, solution1.numWays(2));
        assertEquals(782204094, solution1.numWays(100));
    }
}