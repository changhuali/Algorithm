package com.fan.剑指Offer11旋转数组的最小数字;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer11旋转数组的最小数字解法2")
class Solution2Test {

    @Test
    void minArray() {
        Solution2 solution2 = new Solution2();
        int[] numbers1 = {3,4,5,1,2};
        int[] numbers2 = {2,2,2,0,1};
        assertEquals(1, solution2.minArray(numbers1));
        assertEquals(0, solution2.minArray(numbers2));
    }
}