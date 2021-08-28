package com.fan.sort.merge;

/**
 * 归并排序
 *
 * 将数组分解，排序好后再合并，递归执行
 *
 * 时间复杂度O(nlgn)
 * 空间复杂度O(n)
 * 稳定
 */
public class Solution1 {
    private static Comparable[] aux;

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
        aux = new Comparable[len];
        sort(arr, 0, len - 1);
    }

    private static void merge(Comparable[] arr, int low, int mid, int high) {
        for (int k = low; k <= high; k++) {
            aux[k] = arr[k];
        }

        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > high) {
                arr[k] = aux[i++];
            } else if (lessThan(aux[i], aux[j])) {
                arr[k] = aux[i++];
            } else {
                arr[k] = aux[j++];
            }
        }
    }

    /**
     * 自顶向下法
     */
    private static void sort(Comparable[] arr, int low, int high) {
        if (high <= low) {
            return;
        }

        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    /**
     * 自底向上法
     */
    public static void sortBU(Comparable[] arr) {
        int len = arr.length;
        aux = new Comparable[len];

        for (int size = 1; size < len; size = size + size) {
            for (int low = 0; low < len; low += size + size) {
                merge(arr, low, low + size - 1, Math.min(low + size - 1 + size, len - 1));
            }
        }
    }
}
