package com.fan.sort.quick;

/**
 * 快速排序
 *
 * 选择一个值pivot（多种策略），小于pivot的放置在一侧，大于pivot的放置到另一侧，递归执行
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

    private static int partition(Comparable[] arr, int low, int high) {
        int i = low + 1, j = high;
        Comparable pivot = arr[low];

        while (true) {
            while (lessThan(arr[i], pivot)) {
                i++;
                if (i >= high) {
                    break;
                }
            }
            while (lessThan(pivot, arr[j])) {
                j--;
                if (j <= low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }

            swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }

    private static void sort(Comparable[] arr, int low, int high) {
        if (high <= low) {
            return;
        }

        int k = partition(arr, low, high);
        sort(arr, low, k - 1);
        sort(arr, k + 1, high);
    }

    public static void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }
}
