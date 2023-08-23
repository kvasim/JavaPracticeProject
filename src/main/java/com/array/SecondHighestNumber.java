package com.array;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] num ={3,1,5,9,6,10,9};
        OptionalInt max = Arrays.stream(num).reduce((a, b)-> Math.max(a,b));
        //OptionalInt secondHighest = Arrays.stream(num).filter(n->n<max.getAsInt()).reduce((a,b)->Math.max(a,b));
        OptionalInt secHigh = Arrays.stream(num).filter(n->n<max.getAsInt()).reduce(Math::max);
        System.out.println("Second highest :"+ secHigh.getAsInt());


    }
}
