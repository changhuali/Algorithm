package com.fan.剑指Offer.剑指Offer26树的子结构;

import com.fan.helpers.TreeNode;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer26树的子结构解法1")
class Solution1Test {

    @Test
    void isSubstructure() {
        TreeNode A = new TreeNode(3);
        A.left = new TreeNode(4);
        A.right = new TreeNode(5);
        A.left.left = new TreeNode(1);
        A.left.right = new TreeNode(2);

        TreeNode B = new TreeNode(4);
        B.left = new TreeNode(1);

        assertTrue(new Solution1().isSubstructure(A, B));
    }
}