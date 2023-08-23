package com.array;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ArrayDemo {
    public static void main(String[] args) {
        System.out.println("This is system processor :"+Runtime.getRuntime().availableProcessors());
        System. out. println("Current JVM version - " + System. getProperty("java.version"));
        int[] arr= {3,2,5,6};
        //Stream.of(arr).mapToInt(e-> Arrays.stream(e).boxed()).forEach(System.out::println);
    }
}
