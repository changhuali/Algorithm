package com.fan.剑指Offer.剑指Offer14I剪绳子;

class Solution1 {
    public int cuttingRope(int n) {
        if (n < 4) {
            return n - 1;
        }
        if (n == 4) {
            return 4;
        }
        int res = 1;
        while (n > 4) {
            res = res * 3;
            n -= 3;
        }
        return res * n;
    }
}