package com.codility;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrogRiverJumpSolution {
    public static void main(String[] args) {
        int[] A = {1};
        int X = 1;
        int result = solution(A,X);
        System.out.println("Result : "+result);
    }

    private static int solution(int[] A, int X) {
        Set<Integer> fallingLeaves = IntStream.rangeClosed(1, X).boxed().collect(Collectors.toSet());
        int counter=0;
        for(int value : A){
            if(fallingLeaves.remove(value)) {
                if (fallingLeaves.isEmpty()) {
                    return counter;
                }
            }
            counter++;
        }
        return -1;
    }
}
