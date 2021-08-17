package com.fan.剑指Offer.剑指Offer29顺时针打印矩阵;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer29顺时针打印矩阵解法1")
class Solution1Test {
    int[][] matrix1 = {
            {1, 2, 3},
            {1, 2, 3},
            {1, 2, 3}
    };

    @Test
    void spiralOrder() {
        Solution1 solution1 = new Solution1();
        assertArrayEquals(new int[]{1, 2, 3, 3, 3, 2, 1, 1, 2}, solution1.spiralOrder(matrix1));
    }
}