package com.fan.剑指Offer.剑指Offer32III从上到下打印二叉树;

import com.fan.helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        int level = 0;
        while (!queue.isEmpty()) {
            List<Integer> subList = new LinkedList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode curr = queue.poll();
                subList.add(curr.val);
                if (level % 2 == 0) {
                    if (curr.left != null) {
                        queue.add(curr.right);
                    }
                    if (curr.right != null) {
                        queue.add(curr.left);
                    }
                } else  {
                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }
            }
            list.add(subList);
            level++;
        }
        return list;
    }
}
