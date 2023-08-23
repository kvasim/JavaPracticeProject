package com.stream;

import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j;

import java.util.stream.IntStream;
import java.util.stream.Stream;
@Log
public class StreamRange {
    public static void main(String[] args) {
        IntStream.range(1,10).forEach(System.out::print);
        System.out.println();
        IntStream.rangeClosed(1,10).forEach(System.out::print);

        //Skip
        System.out.println("-----------Skip example-------");
        Stream<String> onceModifiedStream =
                Stream.of("abcd", "bbcd", "cbcd").skip(1);
        onceModifiedStream.forEach(System.out::println);

        System.out.println("-----Reduce---------");
        int reducedParams = Stream.of(1, 2, 3)
                .reduce(10, (a, b) -> a + b, (a, b) -> {
                    log.info("combiner was called");
                    return a + b;
                });
        System.out.println("Reduce result :"+reducedParams);
    }
}
