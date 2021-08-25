package com.fan.sort.insertion;

/**
 * 插入排序
 *
 * 将当前数和左边的数比较，如果反序，则向左移动
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
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int j = i;
            while (j >= 1 && lessThan(arr[j], arr[j - 1])) {
                swap(arr, j,j - 1);
                j--;
            }
        }
    }
}
