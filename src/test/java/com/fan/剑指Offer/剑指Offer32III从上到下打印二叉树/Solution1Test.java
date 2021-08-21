package com.fan.剑指Offer.剑指Offer32III从上到下打印二叉树;

import com.fan.helpers.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer32III从上到下打印二叉树解法1")
class Solution1Test {

    @Test
    void levelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution1 solution1 = new Solution1();
        assertEquals("[[3], [20, 9], [2, 5, 15, 7]]", solution1.levelOrder(root).toString());
    }
}