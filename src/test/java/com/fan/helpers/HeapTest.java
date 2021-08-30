package com.fan.helpers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("堆")
public class HeapTest {
    @Test
    void insertAndDelMax() {
        Heap<Integer> heap = new Heap<>(10);

        heap.insert(1);
        assertEquals(heap.max(), Optional.of(1));
        heap.insert(3);
        assertEquals(heap.max(), Optional.of(3));
        heap.insert(2);
        assertEquals(heap.max(), Optional.of(3));
        heap.insert(6);
        assertEquals(heap.max(), Optional.of(6));
        heap.insert(7);
        assertEquals(heap.max(), Optional.of(7));
        heap.insert(5);
        assertEquals(heap.max(), Optional.of(7));
        heap.insert(4);
        assertEquals(heap.max(), Optional.of(7));

        Integer v1 = heap.delMax();
        assertEquals(v1, 7);
        Integer v2 = heap.delMax();
        assertEquals(v2, 6);
        Integer v3 = heap.delMax();
        assertEquals(v3, 5);
        Integer v4 = heap.delMax();
        assertEquals(v4, 4);
        Integer v5 = heap.delMax();
        assertEquals(v5, 3);
        Integer v6 = heap.delMax();
        assertEquals(v6, 2);
        Integer v7 = heap.delMax();
        assertEquals(v7, 1);
    }
}
