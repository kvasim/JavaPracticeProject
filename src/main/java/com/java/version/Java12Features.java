package com.java.version;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/*
1-  CompactNumberFormat
2- Comparing two files
3- JMH
4- Shenandoah GC
5- Teeing Collector
6- Switch Expression
 */
public class Java12Features {
    public static void main(String[] args) {
        //1- Number format
        NumberFormat numberformat = NumberFormat.getNumberInstance(Locale.US);
        System.out.println("NumberFormat : "+numberformat.format(1500));

        // Teeing collector
        List<String> input = List.of("Reading","someone's","else", "code", "is", "tough");
        //input.stream().collect(Collectors.teeing())

    }
}
