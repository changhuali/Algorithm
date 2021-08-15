package com.fan.剑指Offer.剑指Offer27二叉树的镜像;

import com.fan.helpers.TreeNode;

public class Solution1 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode right = root.right;
        root.right = mirrorTree(root.left);
        root.left = mirrorTree(right);
        return root;
    }
}
