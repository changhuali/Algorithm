package com.fan.剑指Offer.剑指Offer20表示数值的字符串;

import java.util.HashMap;

public class Solution2 {
    public boolean isNumber(String s) {
        HashMap<Character, Integer>[] states = new HashMap[10];
        states[0] = new HashMap<Character, Integer>() {{
            put(' ', 0);
            put('s', 1);
            put('d', 2);
            put('.', 4);
        }};
        states[1] = new HashMap<Character, Integer>() {{
            put('d', 2);
            put('.', 4);
        }};
        states[2] = new HashMap<Character, Integer>() {{
            put('d', 2);
            put('.', 3);
            put('e', 6);
            put(' ', 9);
        }};
        states[3] = new HashMap<Character, Integer>() {{
            put('d', 5);
            put('e', 6);
            put(' ', 9);
        }};
        states[4] = new HashMap<Character, Integer>() {{
            put('d', 5);
        }};
        states[5] = new HashMap<Character, Integer>() {{
            put('d', 5);
            put('e', 6);
            put(' ', 9);
        }};
        states[6] = new HashMap<Character, Integer>() {{
            put('s', 7);
            put('d', 8);
        }};
        states[7] = new HashMap<Character, Integer>() {{
            put('d', 8);
        }};
        states[8] = new HashMap<Character, Integer>() {{
            put('d', 8);
            put(' ', 9);
        }};
        states[9] = new HashMap<Character, Integer>() {{
            put(' ', 9);
        }};
        int n = s.length();
        int curStateIndex = 0;
        char t = '\0';
        for (int i = 0; i < n; i ++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                t = 'd';
            } else if (c == '+' || c == '-') {
                t = 's';
            } else if (c == 'e' || c == 'E') {
                t = 'e';
            } else if (c == '.') {
                t = '.';
            } else if (c == ' ') {
                t = ' ';
            } else {
                return false;
            }
            HashMap<Character, Integer> state = states[curStateIndex];
            if (!state.containsKey(t)) return false;
            curStateIndex = state.get(t);
        }
        return curStateIndex == 2 || curStateIndex == 3 || curStateIndex == 5 || curStateIndex == 8 || curStateIndex == 9;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.isNumber("   2.2e+2   "));
    }
}
