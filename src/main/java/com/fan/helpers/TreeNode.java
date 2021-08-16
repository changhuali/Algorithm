package com.fan.helpers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树节点
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    /**
     * 先序遍历二叉树-循环实现
     * @param root 二叉树
     * @return 结果数组
     */
    public static int[] preorder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();
            while (top != null) {
                list.add(top.val);
                stack.push(top.right);
                top = top.left;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    /**
     * 先序遍历二叉树-递归实现
     * @param root 二叉树
     * @return 结果数组
     */
    public static int[] preorderR(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderRecursion(root, list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    private static void preorderRecursion(TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            preorderRecursion(root.left, list);
            preorderRecursion(root.right, list);
        }
    }

    /**
     * 中序遍历二叉树-循环实现
     * @param root 二叉树
     * @return 结果数组
     */
    public static int[] inorder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();
            list.add(top.val);
            top = top.right;
            while (top != null) {
                stack.push(top);
                top = top.left;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    /**
     * 中序遍历二叉树-递归实现
     * @param root 二叉树
     * @return 结果数组
     */
    public static int[] inorderR(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderRecursion(root, list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    private static void inorderRecursion(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorderRecursion(root.left, list);
            list.add(root.val);
            inorderRecursion(root.right, list);
        }
    }
    /**
     * 后序遍历二叉树-循环实现
     * @param root 二叉树
     * @return 结果数组
     */
    public static int[] postorder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
        TreeNode last = null;
        while (!stack.isEmpty()) {
            TreeNode top = stack.peek();
            if (top.right == null || top.right == last) {
                list.add(top.val);
                stack.pop();
                last = top;
                continue;
            }
            top = top.right;
            while (top != null) {
                stack.push(top);
                top = top.left;
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    /**
     * 后序遍历二叉树-递归实现
     * @param root 二叉树
     * @return 结果数组
     */
    public static int[] postorderR(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderRecursion(root, list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    private static void postorderRecursion(TreeNode root, List<Integer> list) {
        if (root != null) {
            postorderRecursion(root.left, list);
            postorderRecursion(root.right, list);
            list.add(root.val);
        }
    }
}
