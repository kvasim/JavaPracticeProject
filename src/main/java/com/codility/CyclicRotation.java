package com.codility;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {
        int[] A ={1, 1, 2, 3, 5};
        //int[] A ={1,2,3,4};
        int k=5;
        System.out.println(Arrays.toString(A));
        System.out.println("--------------------");
        int[] result = solution1(A,k);

        System.out.println("After: "+k+" rotation : "+ Arrays.toString(result));

    }

    public static int[] solution1(int[] A, int K){

        int arrLength = A.length;
        if(arrLength==0 || arrLength==K){
            return A;
        }

        for(int i=0;i<K;i++) {
           int lastValue = A[arrLength-1];
           for(int j=arrLength-2;j>=0;j--){
               A[j+1]=A[j];
           }
           A[0]=lastValue;
        }
        return A;
    }

    public static int[] solution(int[] A, int K){
        int arrLength = A.length;
        int newIndex=0;
        int endIndex=0;
        for(int i=0;i<arrLength;i++) {
            int reqIndex = (i+K)%arrLength;
            int temp = A[reqIndex];
            A[reqIndex] = A[i];
            A[i]=temp;
            if(i+1==K){
                newIndex=reqIndex+1;
                endIndex=i;
                break;
            }
        }

        for(;newIndex<endIndex;newIndex++){
            int temp= A[newIndex];
            A[newIndex]=A[newIndex+1];
            A[newIndex+1]=temp;
        }
        return A;
    }
}
