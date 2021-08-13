package com.fan.剑指Offer.剑指Offer10斐波那契数列;

public class Solution1 {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int[] results = new int[n + 1];
        results[0] = 0;
        results[1] = 1;
        for (int i = 2; i <= n; i++) {
            results[i] = (results[i - 1] + results[i - 2]) % 1000000007;
        }
        return results[n];
    }
}
