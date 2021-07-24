package com.fan.剑指Offer04二维数组中的查找;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer04二维数组中的查找解法1")
class Solution1Test {

    @Test
    void findNumberIn2DArray() {
        int[][] matrix = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 3}
        };
        Solution1 solution1 = new Solution1();
        assertTrue(solution1.findNumberIn2DArray(matrix, 9));
        assertFalse(solution1.findNumberIn2DArray(matrix, 100));
    }
}