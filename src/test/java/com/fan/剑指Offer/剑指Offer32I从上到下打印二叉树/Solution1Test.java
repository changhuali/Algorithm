package com.fan.剑指Offer.剑指Offer32I从上到下打印二叉树;

import com.fan.helpers.TreeNode;
import com.fan.剑指Offer.剑指Offer32I从上到下打印二叉树.Solution1;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer32I从上到下打印二叉树解法1")
class Solution1Test {

    @Test
    void levelOrder() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution1 solution1 = new Solution1();
        assertArrayEquals(new int[]{3,9,20,15,7}, solution1.levelOrder(root));
    }
}