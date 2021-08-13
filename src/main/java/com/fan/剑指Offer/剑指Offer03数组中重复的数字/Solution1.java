package com.fan.剑指Offer.剑指Offer03数组中重复的数字;

import java.util.HashMap;

public class Solution1 {
    public int findRepeatNumber(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int cur = numbers[i];
            if (map.containsKey(cur)) {
                return cur;
            }
            map.put(cur, i);
        }
        return  - 1;
    }
}
