package com.fan.剑指Offer.剑指Offer20表示数值的字符串;


public class Solution1 {
    public boolean isNumber(String s) {
        return s.matches("^\\s*[-+]?(\\d+\\.\\d*|\\.\\d+|\\d+)([eE][-+]?\\d+)?\\s*$");
    }
}
