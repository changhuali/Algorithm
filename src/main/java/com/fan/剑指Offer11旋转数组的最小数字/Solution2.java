package com.fan.剑指Offer11旋转数组的最小数字;

public class Solution2 {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int low = 0, high = len - 1;
        while (low <= high) {
            int pivot = (low + high) / 2;
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high--;
            }
        }
        return numbers[low];
    }
}
