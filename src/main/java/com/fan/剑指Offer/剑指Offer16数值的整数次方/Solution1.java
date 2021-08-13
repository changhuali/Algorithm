package com.fan.剑指Offer.剑指Offer16数值的整数次方;

public class Solution1 {
    public double myPow(double x, int n) {
        if  (x == 0.0) return 0;
        long b = n;
        if (n < 0) {
            b = -b;
            x = 1 / x;
        }
        double res = 1.0;
        while (b > 0) {
            res *= x;
            b--;
        }
        return res;
    }
}
