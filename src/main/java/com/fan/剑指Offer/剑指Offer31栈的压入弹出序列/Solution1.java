package com.fan.剑指Offer.剑指Offer31栈的压入弹出序列;

import java.util.Stack;

public class Solution1 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int ele: pushed) {
            stack.push(ele);
            while (!stack.isEmpty() && stack.peek() == popped[i]) {
                i++;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
