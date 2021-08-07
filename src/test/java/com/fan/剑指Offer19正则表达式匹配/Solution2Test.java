package com.fan.剑指Offer19正则表达式匹配;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer19正则表达式匹配解法2")
class Solution2Test {

    @Test
    void isMatch() {
        Solution2 solution2 = new Solution2();
        assertFalse(solution2.isMatch("aa", "a"));
        assertTrue(solution2.isMatch("aa", "a*"));
        assertTrue(solution2.isMatch("aa", ".*"));
        assertTrue(solution2.isMatch("aab", "c*a*b"));
        assertFalse(solution2.isMatch("mississippi", "mis*is*p*."));
        assertTrue(solution2.isMatch("aaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*b"));
    }
}