package com.fan.剑指Offer19正则表达式匹配;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer19正则表达式匹配解法1")
class Solution1Test {

    @Test
    void isMatch() {
        Solution1 solution1 = new Solution1();
        assertFalse(solution1.isMatch("aa", "a"));
        assertTrue(solution1.isMatch("aa", "a*"));
        assertTrue(solution1.isMatch("aa", ".*"));
        assertTrue(solution1.isMatch("aab", "c*a*b"));
        assertFalse(solution1.isMatch("mississippi", "mis*is*p*."));
        assertTrue(solution1.isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*b"));
    }
}