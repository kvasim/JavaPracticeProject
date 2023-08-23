package com.codility;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddOccurrencesInArray {
    static Set<Integer> aSet = new HashSet<>();
    public static void main(String[] args) {
        int[] A={9,3,9,3,9,7,9,7,7};
        int result = solution2(A);
        System.out.println("Result :"+result);
    }

    private static int solution(int[] A) {

        return Arrays.stream(A)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()%2 !=0)
                .findFirst()
                .get()
                .getKey();

    }
    private static int solution2(int[] A) {

        for(int i=0;i<A.length;i++) {
            int a = A[i];
            if(aSet.contains(a)) {
                aSet.remove(new Integer(a));
            } else {
                aSet.add(a);
            }
        }
        return aSet.iterator().next();
    }

}
