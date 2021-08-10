package com.fan.剑指Offer20表示数值的字符串;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer20表示数值的字符串解法3")
class Solution3Test {

    @Test
    void isNumber() {
        Solution3 solution3 = new Solution3();
        assertTrue(solution3.isNumber("+100"));
        assertTrue(solution3.isNumber("5e2"));
        assertTrue(solution3.isNumber("-123"));
        assertTrue(solution3.isNumber("3.1416"));
        assertTrue(solution3.isNumber("-1E-16"));
        assertTrue(solution3.isNumber("0123"));
        assertFalse(solution3.isNumber("12e"));
        assertFalse(solution3.isNumber("1a3.14"));
        assertFalse(solution3.isNumber("1.2.3"));
        assertFalse(solution3.isNumber("+-5"));
        assertFalse(solution3.isNumber("12e+5.4"));
    }
}