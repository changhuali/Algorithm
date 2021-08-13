package com.fan.剑指Offer.剑指Offer17打印从1到最大的n位数;

public class Solution2 {
    static final char[] chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public String printNumbers(int n) {
        return dfs("", n);
    }
    private String dfs(String prefix, int n) {
        if (n == 0) return prefix + ',';
        String str = "";
        for (char c: chars) {
            str += dfs(prefix + c, n - 1);
        }
        return str;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.printNumbers(3));
    }
}
