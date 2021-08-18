package com.fan.剑指Offer.剑指Offer30包含min函数的栈;

import java.util.Stack;

public class Solution1 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int val) {
        stack.push(val);
        if (stack2.isEmpty() || val <= stack2.peek()) {
            stack2.push(val);
        }
    }
    public void pop() {
        if (stack.pop().equals(stack2.peek())) {
            stack2.pop();
        }
    }
    public int top() {
        return stack.peek();
    }
    public int min() {
        return stack2.peek();
    }
}
