package com.fan.剑指Offer19正则表达式匹配;

class Solution1 {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        if (m == 0 && n == 0 || (n == 2 && p.charAt(1) == '*' && m == 0)) return true;
        if (m * n == 0) return false;
        char firstS = s.charAt(0), firstP = p.charAt(0);
        char nextP = n > 1 ? p.charAt(1) : '\0';
        if (nextP == '*') {
            String restP = p.substring(2);
            int i = 0, j = 0;
            while (i < m && (s.charAt(i) == firstP || firstP == '.')) {
                i++;
            }
            while (i >= 0) {
                if (isMatch(s.substring(i), restP)) {
                    return true;
                }
                i--;
            }
        } else {
            if (firstS == firstP || firstP == '.') {
                return isMatch(s.substring(1), p.substring(1));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        solution1.isMatch("", ".*");
    }
}
