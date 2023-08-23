package com.leetcode.array;

import java.util.stream.IntStream;

public class PrintItem {
    public static void main(String[] args) {
        int n=10;
        printItem(n);
    }

    private static void printItem(int n) {
        IntStream.rangeClosed(1,n).forEach(System.out::println);
    }
}
