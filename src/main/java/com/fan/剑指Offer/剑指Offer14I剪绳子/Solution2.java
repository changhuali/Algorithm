package com.fan.剑指Offer.剑指Offer14I剪绳子;

class Solution2 {
    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                int restLen = i - j;
                dp[i] = Math.max(dp[i], j * Math.max(restLen, dp[restLen]));
            }
        }
        return dp[n];
    }
}