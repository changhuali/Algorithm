package com.fan.剑指Offer.剑指Offer28对称的二叉树;

import com.fan.helpers.TreeNode;

public class Solution1 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return recurse(root.left, root.right);
    }

    private boolean recurse(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return recurse(left.left, right.right) && recurse(left.right, right.left);
    }
}
