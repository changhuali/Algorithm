package com.fan.剑指Offer07重建二叉树;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer07重建二叉树解法1")
class Solution1Test {

    @Test
    void buildTree() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        Solution1 solution1 = new Solution1();
        assertEquals(3, solution1.buildTree(preorder, inorder).val);
    }
}