package com.fan.剑指Offer19正则表达式匹配;

class Solution1 {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        if (m == 0 && n == 0) return true;
        if (m > 0 && n == 0) return false;
        char fcInS = m > 0 ? s.charAt(0) : '\0', fcInP = p.charAt(0);
        char scInP = n > 1 ? p.charAt(1) : '\0';
        if (scInP == '*') {
            String restP = p.substring(2);
            int k = 0;
            while (k < m && isCharMatch(s.charAt(k), fcInP)) {
                k++;
            }
            while (k >= 0) {
                if (isMatch(s.substring(k), restP)) {
                    return true;
                }
                k--;
            }
        } else {
            if (isCharMatch(fcInS, fcInP)) {
                return isMatch(s.substring(1), p.substring(1));
            }
        }
        return false;
    }

    private boolean isCharMatch(char a, char b) {
        return a != '\0' && (a == b || b == '.');
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.isMatch("", "."));
    }
}
