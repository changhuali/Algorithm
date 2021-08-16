package com.fan.helpers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@DisplayName("二叉树遍历")
class TreeNodeTest {

    static TreeNode root;

    {
        /**
         *            1
         *           / \
         *          2   3
         *         / \  /\
         *        4  5 6  7
         */
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
    }

    @Test
    void preorder() {
        assertArrayEquals(TreeNode.preorderR(root), TreeNode.preorder(root));
    }

    @Test
    void inorder() {
        assertArrayEquals(TreeNode.inorderR(root), TreeNode.inorder(root));
    }

    @Test
    void postorder() {
        assertArrayEquals(TreeNode.postorderR(root), TreeNode.postorder(root));
    }
}