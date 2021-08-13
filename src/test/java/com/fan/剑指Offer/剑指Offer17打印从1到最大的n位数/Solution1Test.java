package com.fan.剑指Offer.剑指Offer17打印从1到最大的n位数;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("剑指Offer17打印从1到最大的n位数解法1")
class Solution1Test {

    @Test
    void printNumbers() {
        Solution1 solution1 = new Solution1();
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, solution1.printNumbers(1));

        int[] arr2 = new int[99];
        int i2 = 1;
        while (i2 < 100) {
            arr2[i2 - 1] = i2;
            i2++;
        }
        assertArrayEquals(arr2, solution1.printNumbers(2));
    }
}