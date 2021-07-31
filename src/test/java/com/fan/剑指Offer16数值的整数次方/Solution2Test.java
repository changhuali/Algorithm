package com.fan.剑指Offer16数值的整数次方;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer16数值的整数次方解法2")
class Solution2Test {

    @Test
    void myPow() {
        Solution2 solution2 = new Solution2();
        assertEquals(1024.0, solution2.myPow(2.0, 10));
        assertEquals(9.261, solution2.myPow(2.1, 3), 0.0001);
        assertEquals(0.0, solution2.myPow(2.0, -2147483648));
    }
}