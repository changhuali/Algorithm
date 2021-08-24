package com.fan.sort.selection;

/**
 * 选择排序
 *
 * 内循环得出最小值索引minIndex，内循环完成后和i交换
 *
 * 时间复杂度O(n2)
 * 原地
 * 不稳定
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
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < len; j++) {
                if (lessThan(arr[j], arr[minIndex])) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
}
