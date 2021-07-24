package com.fan.剑指Offer10青蛙跳台阶问题;

class Solution1 {
    public int numWays(int n) {
        int prevTwo = 1, prevOne = 1, result = 1;
        for (int i = 2; i <= n; i++) {
            result = (prevOne + prevTwo) % 1000000007;
            prevTwo = prevOne;
            prevOne = result;
        }
        return result;
    }
}
