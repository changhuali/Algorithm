package com.fan.helpers;

import java.util.Optional;

public class Heap<T extends Comparable<T>> {
    private T[] arr;
    private int N = 0;

    public Heap(int max) {
        arr = (T[]) new Comparable[max + 1];
    }

    private static void swap(Comparable[] arr, int i, int j) {
        Comparable temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static boolean lessThan(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
    private void sink(int k) {
        int j = 2 * k;
        while (j <= N) {
            if (j < N && lessThan(arr[j], arr[j + 1])) {
                j++;
            }
            if (!lessThan(arr[k], arr[j])) {
                break;
            }
            swap(arr, k, j);
            j *= 2;
        }
    }
    private void swim(int k) {
        while (k > 1 && lessThan(arr[k/2], arr[k])) {
            swap(arr, k/2, k);
            k = k/2;
        }
    }

    public void insert(T v) {
        arr[++N] = v;
        swim(N);
    }
    public T delMax() {
        T max = arr[1];
        swap(arr, 1, N--);
        arr[N + 1] = null;
        sink(1);
        return max;
    }
    public Optional<T> max() {
        if (N > 0) {
            return Optional.of(arr[1]);
        }
        return Optional.empty();
    }
}
