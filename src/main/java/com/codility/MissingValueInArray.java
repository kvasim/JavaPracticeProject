package com.codility;

import java.util.Arrays;

public class MissingValueInArray {
    public static void main(String[] args) {
        //int[] A = {2,3,1,4,5,7};
        int[] A = {2,1,3,4};
        int
                missingElement = solution(A);
        System.out.println("Missing Element :"+ missingElement);
    }

    private static int solution(int[] A) {
        long n= A.length;
        long sum = ((n+1)*(n+2))/2;
        System.out.println("Formula sum :"+sum);
        long inputSum = Arrays.stream(A).asLongStream().sum();
        System.out.println("Array sum :"+inputSum);
        return (int) (sum-inputSum);
    }
}
