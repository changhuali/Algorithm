package com.fan.剑指Offer15二进制中1的个数;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer15二进制中1的个数解法1")
class Solution1Test {

    @Test
    void hammingWeight() {
        Solution1 solution1 = new Solution1();
        assertEquals(3, solution1.hammingWeight(11));
        assertEquals(1, solution1.hammingWeight(128));
        assertEquals(31, solution1.hammingWeight(2147483647));
    }
}