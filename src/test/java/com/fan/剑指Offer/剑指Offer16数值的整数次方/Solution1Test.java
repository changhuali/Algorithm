package com.fan.剑指Offer.剑指Offer16数值的整数次方;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer16数值的整数次方解法1")
class Solution1Test {

    @Test
    void myPow() {
        Solution1 solution1 = new Solution1();
        assertEquals(1024.0, solution1.myPow(2.0, 10));
        assertEquals(9.261, solution1.myPow(2.1, 3), 0.0001);
        assertEquals(0.0, solution1.myPow(2.0, -2147483648));
    }
}