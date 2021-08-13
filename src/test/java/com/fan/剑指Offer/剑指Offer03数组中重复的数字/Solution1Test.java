package com.fan.剑指Offer.剑指Offer03数组中重复的数字;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("剑指Offer03数组中重复的数字解法1")
class Solution1Test {

    @Test
    void findRepeatNumber() {
        Solution1 solution1 = new Solution1();
        int[] numbers1 = {2, 3, 1, 0, 2, 5, 3};
        assertTrue(solution1.findRepeatNumber(numbers1) == 2);
    }
}