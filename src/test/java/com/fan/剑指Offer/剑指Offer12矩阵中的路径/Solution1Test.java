package com.fan.剑指Offer.剑指Offer12矩阵中的路径;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer12矩阵中的路径解法1")
class Solution1Test {

    @Test
    void exist() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'},};
        Solution1 solution1 = new Solution1();
        assertTrue(solution1.exist(board, "ABCCED"));
    }
}