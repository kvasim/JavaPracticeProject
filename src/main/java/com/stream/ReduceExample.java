package com.stream;

import com.utils.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceExample {
    public static void main(String[] args) {
        /*
        Complete method bellow withoutFlatMap(): Combine arrayListOfNames into one single list and print it to the console. The output should be: [Mariam, Alex, Ismail, John, Alesha, Andre, Susy, Ali]
private static final List<ArrayList<String>> arrayListOfNames = Lists.newArrayList(
      Lists.newArrayList("Mariam", "Alex", "Ismail"),
      Lists.newArrayList("John", "Alesha", "Andre"),
      Lists.newArrayList("Susy", "Ali")
    );

         */


        final List<ArrayList<String>> arrayListOfNames = Lists.newArrayList(
                Lists.newArrayList("Mariam", "Alex", "Ismail"),
                Lists.newArrayList("John", "Alesha", "Andre"),
                Lists.newArrayList("Susy", "Ali")
        );
        Arrays.asList();
        List<String> nameList = new ArrayList<>();
        arrayListOfNames.forEach(arrayList -> arrayList.forEach(value->nameList.add(value)));


        System.out.println("arrayListOfNames : "+arrayListOfNames);
        System.out.println("List of Name -: "+nameList);

        // WithFlatMap
        List<String> listName = arrayListOfNames.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("WithFlatMap :"+listName);

    }
}
