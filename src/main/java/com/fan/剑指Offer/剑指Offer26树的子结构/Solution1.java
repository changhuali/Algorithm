package com.fan.剑指Offer.剑指Offer26树的子结构;

import com.fan.helpers.TreeNode;

public class Solution1 {
    public boolean isSubstructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (recurse(A, B) || isSubstructure(A.left, B) || isSubstructure(A.right, B));
    }

    private boolean recurse(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || A.val != B.val) return false;
        return recurse(A.left, B.left) && recurse(A.right, B.right);
    }


}
