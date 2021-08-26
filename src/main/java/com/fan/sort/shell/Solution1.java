package com.fan.sort.shell;

/**
 * 希尔排序
 *
 * 插入排序每次只能移动一步，如果较元素分布在相反方向，则移动效率较低，因此通过提高每次移动的距离，
 * 先将部分元素移动到合适的位置，减少后续移动次数
 *
 * 理论上来讲，该算法比较鸡肋，小规模数据排序即使直接采用插入排序，性能也不会太差，大规模数据又有更性能更优的排序算法
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
        int h = 1;
        while (h < len / 3) {
            h = 3 * h + 1;
        }

        while (h >= 1) {
            for (int i = h; i < len; i++) {
                int j = i;
                while (j >= h && lessThan(arr[j], arr[j - h])) {
                    swap(arr, j, j - h);
                    j -= h;
                }
            }
            h = h / 3;
        }
    }
}
