package com.codility.countingElement;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,6,7,8,10};
        int n=10;
        int missingNumber = findMissingNumber(arr, n);
        System.out.println("Missing number is : "+missingNumber);
    }

    private static int findMissingNumber(int[] arr,int n) {
        int sum = n*(n+1)/2;
        int actualSum = Arrays.stream(arr).sum();
        return sum-actualSum;
    }
}
