package com.fan.剑指Offer11旋转数组的最小数字;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer11旋转数组的最小数字解法1")
class Solution1Test {

    @Test
    void minArray() {
        int[] arr1 = {3,4,5,1,2};
        int[] arr2 = {2,2,2,0,1};
        Solution1 solution1 = new Solution1();
        assertEquals(1, solution1.minArray(arr1));
        assertEquals(0, solution1.minArray(arr2));
    }
}