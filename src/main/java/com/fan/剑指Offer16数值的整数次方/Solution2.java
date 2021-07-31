package com.fan.剑指Offer16数值的整数次方;

public class Solution2 {
    public double myPow(double x, int n) {
        if (x == 0.0) return 0;
        long b = n;
        if (n < 0) {
            x = 1 / x;
            b = -b;
        }
        double res = 1.0;
        while (b > 0) {
            if ((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }
}
