package com.datastructure.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(4);
        stack.push(14);
        stack.push(24);
        stack.push(44);
        stack.push(47);
        stack.pop();
        System.out.println(stack);

        Stack stack1 = new Stack();
        stack1.push(6);

    }
}
