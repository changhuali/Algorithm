package com.fan.剑指Offer.剑指Offer04二维数组中的查找;

class Solution1 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length, cols = matrix[0].length;
        int i = 0, j = cols - 1;
        while (i < rows && j >= 0) {
            int cur = matrix[i][j];
            if (cur == target) return true;
            if (target > cur) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
