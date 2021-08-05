package com.fan.剑指Offer19正则表达式匹配;

class Solution1 {
    public boolean isMatch(String s, String p) {
        int n = s.length(), m = p.length();
        if (n == 0 && m == 0) return true;
        if (n > 0 && m == 0) return false;
        // p[1]是否为*
        boolean p1IsStar = m > 1 && p.charAt(1) == '*';
        if (p1IsStar) {
            int k = 0;
            while (k < n && isCharMatch(s.charAt(k), p.charAt(0))) {
                k++;
            }
            while (k >= 0) {
                if (isMatch(s.substring(k), p.substring(2))) {
                    return true;
                }
                k--;
            }
        } else if (n != 0) { // n=0，直接返回false
            if (isCharMatch(s.charAt(0), p.charAt(0))) {
                return isMatch(s.substring(1), p.substring(1));
            }
        }
        return false;
    }

    private boolean isCharMatch(char a, char b) {
        return a == b || b == '.';
    }
}
