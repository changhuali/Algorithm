package com.fan.剑指Offer.剑指Offer11旋转数组的最小数字;

public class Solution1 {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        if (len == 0) {
            return -1;
        }
        for (int i = 0; i < len - 1; i++) {
            if (numbers[i+1] < numbers[i]) {
                return numbers[i+1];
            }
        }
        return numbers[0];
    }
}
