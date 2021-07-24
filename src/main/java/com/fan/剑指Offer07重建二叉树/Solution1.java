package com.fan.剑指Offer07重建二叉树;

import java.util.HashMap;

public class Solution1 {
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        for (int i = 0; i < n; i++) {
            map.put(preorder[i], i);
        }
        return buildSubTree(preorder, inorder, 0, n - 1, 0, n - 1);
    }
    private TreeNode buildSubTree(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight) {
        if (preLeft > preRight) return null;
        int rootVal = preorder[preLeft];
        int rootValIndex = map.get(rootVal);
        int leftNodesLength = rootValIndex - preLeft;
        TreeNode root = new TreeNode(rootVal);
        root.left = buildSubTree(preorder, inorder, preLeft + 1, preLeft + leftNodesLength, inLeft, rootValIndex - 1);
        root.right = buildSubTree(preorder, inorder, preLeft + leftNodesLength + 1, preRight, rootValIndex + 1, inRight);
        return root;
    }
}
