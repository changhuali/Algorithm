package com.fan.sort.heap;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("堆排序")
public class Solution1Test {

    @Test
    void sort() {
        // 第一位为占位符
        Integer[] arr1 = {0, 1, 2, 3, 4, 5};
        Solution1.sort(arr1);
        assertArrayEquals(new Integer[] {0, 1, 2, 3, 4, 5}, arr1);

        Integer[] arr2 = {0, 4, 2, 3, 2, 1};
        Solution1.sort(arr2);
        assertArrayEquals(new Integer[] {0, 1, 2, 2, 3, 4}, arr2);
    }
}
