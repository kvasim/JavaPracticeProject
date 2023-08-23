package com.hackerrank;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class FizzBuzzProblem {
    static IntPredicate fizz = num-> { if(num%3==0) {
        System.out.println("Fizz");
    }
    return false;};
    public static void main(String[] args) {
        IntStream.rangeClosed(1,100)
                .filter(fizz);
    }
}
