package com.fan.sort.shell;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("希尔排序")
public class SolutionTest {

    @Test
    void sort() {
        Integer[] arr1 = {5, 4, 3, 2, 1};
        Solution1.sort(arr1);
        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5}, arr1);

        Integer[] arr2 = {4, 2, 3, 2, 1};
        Solution1.sort(arr2);
        assertArrayEquals(new Integer[] {1, 2, 2, 3, 4}, arr2);
    }
}
