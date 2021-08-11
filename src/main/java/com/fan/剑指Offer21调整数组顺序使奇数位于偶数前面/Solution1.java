package com.fan.剑指Offer21调整数组顺序使奇数位于偶数前面;

public class Solution1 {
    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if ((nums[left] & 1) == 0) {
                while (right > left && (nums[right] & 1) == 0) {
                    right--;
                }
                swap(nums, left, right);
            }
            left++;
        }
        return nums;
    }

    private void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
