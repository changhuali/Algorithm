package com.fan.剑指Offer.剑指Offer13机器人的运动范围;

public class Solution2 {
    public int movingCount(int m, int n, int k) {
        boolean[][] vis = new boolean[m][n];
        return dfs(m, n, k, 0, 0, vis);
    }
    private int dfs(int m, int n, int k, int i, int j, boolean[][] vis) {
        if (i < 0 || i >= m || j < 0 || j >= n || vis[i][j] || bitSum(i) + bitSum(j) > k) return 0;
        vis[i][j] = true;
        return 1 + dfs(m, n, k, i, j + 1, vis) + dfs(m, n, k, i + 1, j, vis);
    }
    private int bitSum(int k) {
        int sum = 0;
        while (k != 0) {
            sum += k % 10;
            k /= 10;
        }
        return sum;
    }
}
