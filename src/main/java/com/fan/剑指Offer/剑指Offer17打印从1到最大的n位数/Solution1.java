package com.fan.剑指Offer.剑指Offer17打印从1到最大的n位数;

public class Solution1 {
    public int[] printNumbers(int n) {
        int end = (int)Math.pow(10, n) - 1;
        int i = 1;
        int[] res = new int[end];
        while (i <= end) {
            res[i - 1] = i;
            i++;
        }
        return res;
    }
}
