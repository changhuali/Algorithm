package com.fan.剑指Offer.剑指Offer32I从上到下打印二叉树;

import com.fan.helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class Solution1 {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }
        LinkedList<TreeNode> list = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        list.add(root);
        while (!list.isEmpty()) {
            TreeNode curr = list.poll();
            if (curr == null) {
                continue;
            }
            result.add(curr.val);
            list.add(curr.left);
            list.add(curr.right);
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
