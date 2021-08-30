package com.fan.sort.heap;

/**
 * 堆排序
 *
 * 构造一个堆（由一颗完全二叉树构成），依次取最小值/最大值即可
 *
 * 时间复杂度O(nlgn)
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

    // 构造大顶堆
    private static void sink(Comparable[] arr, int N, int k) {
        while (2 * k <= N) {
            int j = 2 * k;

            if (j < N && lessThan(arr[j], arr[j + 1])) {
                j++;
            }
            if (!lessThan(arr[k], arr[j])) {
                break;
            }
            swap(arr, k, j);
            k = j;
        }
    }

    public static void sort(Comparable[] arr) {
        int N = arr.length - 1;

        for (int k = N/2; k >= 1 ; k--) {
            sink(arr, N, k);
        }

        // 每次将最大值移动到末尾，从而获得一个倒序数组
        while (N > 1) {
            swap(arr, 1, N--);
            sink(arr, N, 1);
        }
    }
}
