package com.fan.剑指Offer20表示数值的字符串;

public class Solution1 {
    public boolean isNumber(String s) {
        int n = s.length();
        if (n < 1) return false;
        int i = 0, j = n - 1;
        while (i <= j && s.charAt(i) == ' ') {
            i++;
        }
        while (j > i && s.charAt(j) == ' ') {
            j--;
        }
        return _isNumber(s, i, j);
    }
    private boolean _isNumber(String s, int start, int end) {
        int n = end - start + 1;
        if (n <= 0) return false;
        boolean hasSign = isSign(s, start);
        if (isSign(s, start)) {
            start++;
        }
        int i = start;
        for (; start <= end; start++) {
            char c = s.charAt(start);
            if (Character.isDigit(c)) {
                continue;
            }
            if (c == '.') {
                // TODO: 完善逻辑
                return ;
            }
            if ((c == 'e' || c == 'E')) {
                return i != start &&  isInt(s, start + 1, end, true);
            }
            return false;
        }
        if (hasSign) {
            return n > 1;
        }
        return true;
    }
    private boolean isE(String s, int start, int end) {
        int n = end - start;
        if (n <= 0) return false;
        while (start <= end) {
            char c = s.charAt(start);
            if (Character.isDigit(c)) {
                start++;
                continue;
            } else if (c == 'e' || c == 'E') {
                return isInt(s, start + 1, end, true);
            }
            return false;
        }
        return true;
    }
    private boolean isInt(String s, int start, int end, boolean sign) {
        int n = end - start + 1;
        if (n <= 0) return false;
        boolean hasSign = sign && isSign(s, start);
        if (hasSign) {
            start++;
        }
        for (int i = start; i <= end; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        if (hasSign) {
            return n > 1;
        }
        return true;
    }
    private boolean isSign(String s, int index) {
        char c = s.charAt(index);
        return c == '-' || c == '+';
    }

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.isNumber("."));
    }
}
