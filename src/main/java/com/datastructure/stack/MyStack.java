package com.datastructure.stack;

import java.util.Arrays;

public class MyStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public MyStack(int size) {
        maxSize=size;
        stackArray = new long[maxSize];
        top=-1;
    }
    public void push(long value) throws Exception {
        top++;
        if(top>=maxSize) {
            throw new Exception("Stack is full :"+top);
        }
        stackArray[top] = value;
    }
    public long pop() {
        return stackArray[top--];
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "stackArray=" + Arrays.toString(stackArray) +
                '}';
    }
}
