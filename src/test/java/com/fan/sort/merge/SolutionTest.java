package com.fan.sort.merge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("归并排序")
public class SolutionTest {

    @Test
    void sort() {
        Integer[] arr1 = {5, 4, 3, 2, 1};
        Solution1.sort(arr1);
        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5}, arr1);

        Integer[] arr11 = {5, 4, 3, 2, 1};
        Solution1.sortBU(arr11);
        assertArrayEquals(new Integer[] {1, 2, 3, 4, 5}, arr11);

        Integer[] arr2 = {4, 2, 3, 2, 1};
        Solution1.sort(arr2);
        assertArrayEquals(new Integer[] {1, 2, 2, 3, 4}, arr2);

        Integer[] arr22 = {4, 2, 3, 2, 1};
        Solution1.sortBU(arr22);
        assertArrayEquals(new Integer[] {1, 2, 2, 3, 4}, arr22);
    }
}
