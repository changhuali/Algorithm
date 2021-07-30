package com.fan.剑指Offer15二进制中1的个数;

public class Solution1 {
    public int hammingWeight(int n) {
        int ret = 0;
        int k = 0;
        while (k < 32) {
            if ((n & (1 << k)) != 0) {
                ret++;
            }
            k++;
        }
        return ret;
    }
}
