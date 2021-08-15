package com.fan.剑指Offer.剑指Offer28对称的二叉树;

import com.fan.helpers.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer28对称的二叉树解法1")
class Solution1Test {

    @Test
    void isSymmetric() {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(2);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        Solution1 solution1 = new Solution1();
        assertTrue(solution1.isSymmetric(root1));
        assertFalse(solution1.isSymmetric(root2));
    }
}