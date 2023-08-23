package com.codility;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
/*
Task description
A non-empty array A consisting of N integers is given.

A permutation is a sequence containing each element from 1 to N once, and only once.

For example, array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.

The goal is to check whether array A is a permutation.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

For example, given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.

Given array A such that:

    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [1..1,000,000,000].
 */
public class PermutationSolution {
    public static void main(String[] args) {
        int[] A ={4,1,3,2};
        int result = solution2(A);
        System.out.println("Response :"+result);
    }
// Correct one
    private static int solution2(int[] A) {
        Set<Integer> set = IntStream.rangeClosed(1,A.length).boxed().collect(Collectors.toSet());
        System.out.println(set);
        for(int a:A) {
            if(!set.contains(a)){
                return 0;
            }else {
                set.remove(a);
            }
        }
        return set.isEmpty()? 1:0;
    }


    private static int solution(int[] A) {
        Set<Integer> set = Arrays.stream(A).boxed().collect(Collectors.toSet());
        if(set.size()==1 && A.length !=1){
            return 0;
        }
        int missingNumber = findMissingNumber(A);
        Arrays.sort(A);
        if(A[A.length-1]> missingNumber){
            return 0;
        }
        return 1;
    }
    private static int findMissingNumber(int[] A) {
        long n= A.length;
        long sum = ((n+1)*(n+2))/2;
        System.out.println("Formula sum :"+sum);
        long inputSum = Arrays.stream(A).asLongStream().sum();
        System.out.println("Array sum :"+inputSum);
        return (int) (sum-inputSum);
    }
}
