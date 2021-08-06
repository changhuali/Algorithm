package com.fan.剑指Offer19正则表达式匹配;

class Solution1 {
    public boolean isMatch(String s, String p) {
        return _isMatch(s, p, 0, 0);
    }

    private boolean _isMatch(String s, String p, int sk, int pk) {
        int n = s.length(), m = p.length();
        if (sk == n && pk == m) return true;
        if (sk < n && pk == m) return false;
        // p[pk+1]是否为*
        boolean star = pk + 1 < m && p.charAt(pk + 1) == '*';
        if (star) {
            int k = 0;
            while (sk + k < n && isCharMatch(s.charAt(sk + k), p.charAt(pk))) {
                k++;
            }
            while (k >= 0) {
                if (_isMatch(s, p, sk + k, pk + 2)) {
                    return true;
                }
                k--;
            }
        } else if (sk != n) { // n=0，直接返回false
            if (isCharMatch(s.charAt(sk), p.charAt(pk))) {
                return _isMatch(s, p, sk + 1, pk + 1);
            }
        }
        return false;
    }

    private boolean isCharMatch(char a, char b) {
        return a == b || b == '.';
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.isMatch("aaa", "ab*a*c*a");
    }
}
