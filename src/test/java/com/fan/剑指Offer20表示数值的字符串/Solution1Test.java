package com.fan.剑指Offer20表示数值的字符串;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution1Test {

    @Test
    void isNumber() {
        Solution1 solution1 = new Solution1();
        assertTrue(solution1.isNumber("+100"));
        assertTrue(solution1.isNumber("5e2"));
        assertTrue(solution1.isNumber("-123"));
        assertTrue(solution1.isNumber("3.1416"));
        assertTrue(solution1.isNumber("-1E-16"));
        assertTrue(solution1.isNumber("0123"));
        assertFalse(solution1.isNumber("12e"));
        assertFalse(solution1.isNumber("1a3.14"));
        assertFalse(solution1.isNumber("1.2.3"));
        assertFalse(solution1.isNumber("+-5"));
        assertFalse(solution1.isNumber("12e+5.4"));
    }
}