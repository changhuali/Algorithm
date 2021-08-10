package com.fan.剑指Offer20表示数值的字符串;

public class Solution3 {
    public boolean isNumber(String s) {
        int n = s.length();
        int start = 0, end = n - 1;
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }
        while (end > start && s.charAt(end) == ' ') {
            end--;
        }
        boolean dot = false, exp = false, digit = false;
        for (int i = start; i <= end; i++) {
            char c = s.charAt(i);
            if (c == '-' || c == '+') {
                if (i == start || s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E')
                continue;
            }
            if (c >= '0' && c <= '9') {
                digit = true;
                continue;
            }
            if (c == 'e' || c == 'E') {
                if (exp || !digit) return false;
                exp = true;
                digit = false;
                continue;
            }
            if (c == '.') {
                boolean dotNum = !digit && i < end && Character.isDigit(s.charAt(i + 1));
                boolean numDot = i > start && Character.isDigit(s.charAt(i - 1));
                if (dot || exp || (!dotNum && !numDot)) return false;
                dot = true;
                continue;
            }
            return false;
        }
        return digit;
    }
}
