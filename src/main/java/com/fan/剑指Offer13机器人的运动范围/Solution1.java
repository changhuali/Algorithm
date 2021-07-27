package com.fan.剑指Offer13机器人的运动范围;

import java.util.LinkedList;
import java.util.Set;

class Solution1 {
    public int movingCount(int m, int n, int k) {
        LinkedList<int[]> queue = new LinkedList<>();
        int count = 0;
        int[] pos = {0, 0};
        boolean[][] vis = new boolean[m][n];
        queue.add(pos);
        while (!queue.isEmpty()) {
            int[] curPos = queue.poll();
            int i = curPos[0], j = curPos[1];
            if (i >= m || j >= n || vis[i][j] || bitSum(i) + bitSum(j) > k) continue;
            count++;
            vis[i][j] = true;
            queue.add(new int[]{i + 1, j});
            queue.add(new int[]{i, j + 1});
        }
        return count;
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
