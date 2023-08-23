package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamMinimumNumberLecture2 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,100,23,93,99);
        findMin(integerList);
        findMix(integerList);
    }

    private static void findMin(List<Integer> integerList) {
        int result = integerList.stream().min(Comparator.comparingInt(num->num)).get();
        System.out.println("Result :"+result);
    }
    private static void findMix(List<Integer> integerList) {
        int result = integerList.stream().max(Comparator.comparingInt(num->num)).get();
        System.out.println("Max Result :"+result);
    }
}
