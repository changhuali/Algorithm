package com.fan.sort.bubble;

/**
 * 冒泡排序
 *
 * 比较j,j+1，如果反序，交换位置
 *
 * 时间复杂度O(n2)
 * 原地
 * 稳定
 */
public class Solution1 {
    private static void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static boolean lessThan(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    public static void sort(Comparable[] arr) {
        boolean sorted = false;
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
               if (lessThan(arr[j + 1], arr[j])) {
                   swap(arr, j, j + 1);
                   sorted = true;
               }
            }

            if (!sorted) {
                return;
            }
        }
    }
}
