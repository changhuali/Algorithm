package com.fan.剑指Offer.剑指Offer21调整数组顺序使奇数位于偶数前面;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer21调整数组顺序使奇数位于偶数前面解法1")
class Solution1Test {

    @Test
    void exchange() {
        Solution1 solution1 = new Solution1();
        int[] input1 = { 1, 2, 3, 4 };
        int[] result1 = { 1, 3, 2, 4 };
        assertArrayEquals(result1, solution1.exchange(input1));
        int[] input2 = { 1, 2, 1, 3, 1 };
        int[] result2 = { 1, 1, 1, 3, 2 };
        assertArrayEquals(result1, solution1.exchange(input1));
    }
}