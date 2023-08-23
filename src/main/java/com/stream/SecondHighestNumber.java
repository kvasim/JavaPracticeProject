package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] num ={3,1,5,9,6,10};
        OptionalInt max = Arrays.stream(num).reduce((a, b)-> Math.max(a,b));
        OptionalInt secondHighest = Arrays.stream(num).filter(n->n<max.getAsInt()).reduce((a,b)->Math.max(a,b));
        System.out.println("Second highest :"+ secondHighest.getAsInt());
        System.out.println("----------Generator------");
        //Stream generator
        Stream<String> streamGenerated = Stream.generate(()->"Wkhan").limit(10);
        //streamGenerated.forEach(System.out::println);
        System.out.println("---Partition by------");
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
        Map<Boolean, List<Integer>> isEven = intList.stream().collect(
                Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(isEven);

        Stream.of(1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1,0)
                .dropWhile(x -> x <= 5)
                .forEach(System.out::println);

        /*Stream.of(1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,6661,0)
                .dropWhile(x -> x <= 5)
                .forEach(System.out::println);*/

        //---chatgtp
        System.out.println("--------chatgtp=----------");
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,5,2,3);

        // Drop elements until a number greater than 5 is encountered
        Stream<Integer> result = numbers.dropWhile(x -> x <= 5);

        result.forEach(System.out::println);
        // Output: 6, 7, 8, 9, 10


    }
}
