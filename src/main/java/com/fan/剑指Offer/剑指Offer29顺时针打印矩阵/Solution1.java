package com.fan.剑指Offer.剑指Offer29顺时针打印矩阵;

import java.util.Arrays;

public class Solution1 {
    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }

        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int index = 0;
        int[] order = new int[matrix.length * matrix[0].length];

        while (left <= right && top <= bottom) {
            // 向右
            for (int i = left; i <= right; i++) {
                order[index++] = matrix[top][i];
            }
            // 向下
            for (int i = top + 1; i <= bottom; i++) {
                order[index++] = matrix[i][right];
            }
            // 向左
            if (bottom > top) {
                for (int i = right - 1; i > left; i--) {
                    order[index++] = matrix[bottom][i];
                }
            }
            // 向上
            if (right > left) {
                for (int i = bottom; i > top; i--) {
                    order[index++] = matrix[i][left];
                }
            }
            top++;
            right--;
            bottom--;
            left++;
        }
        return order;
    }

    static public void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {1, 2, 3},
                {1, 2, 3}
        };
        System.out.println(Arrays.toString(new Solution1().spiralOrder(matrix)));
    }
}
