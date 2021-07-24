package com.fan.剑指Offer10斐波那契数列;

public class Solution2 {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int prevTwo = 0, prevOne = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = (prevOne + prevTwo) % 1000000007;
            prevTwo = prevOne;
            prevOne = result;
        }
        return result;
    }
}
