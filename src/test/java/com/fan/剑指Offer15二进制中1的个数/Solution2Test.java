package com.fan.剑指Offer15二进制中1的个数;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer15二进制中1的个数解法2")
class Solution2Test {

    @Test
    void hammingWeight() {
        Solution2 solution2 = new Solution2();
        assertEquals(3, solution2.hammingWeight(11));
        assertEquals(1, solution2.hammingWeight(128));
        assertEquals(31, solution2.hammingWeight(2147483647));
    }
}