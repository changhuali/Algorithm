package com.fan.剑指Offer19正则表达式匹配;

public class Solution2 {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        boolean[][] dp = new boolean[n + 1][m + 1];
        for(int i = 0; i <= n; i++) {
            dp[i][0] = i == 0;
            for (int j = 1; j <= m; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 2];
                    if (!dp[i][j] && i > 0 && match(s.charAt(i - 1), p.charAt(j - 2))) {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else if (i > 0) {
                    dp[i][j] = dp[i - 1][j - 1] && match(s.charAt(i - 1), p.charAt(j - 1));
                }
            }
        }
        return dp[n][m];
    }

    private boolean match(char s, char p) {
        return s == p || p == '.';
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isMatch("aaa", "ab*a*c*a"));
    }
}
