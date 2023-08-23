package com.array;

import java.util.Arrays;

public class ArrayExampleWithConstantSpace {
    public static void main(String[] args) {
        char[] chrs = {'h','e','l','l','o', ' ', 'i', ' ', 's','e','e', ' ', 'y','o','u'};
        //output: you see i hello
        System.out.println("Q : "+ Arrays.toString(chrs));
        char[] result = reverseArrayWithConstantSpace(chrs);
        System.out.println("Result :"+Arrays.toString(result));
        for(char ch:result) {
            System.out.print(ch);
        }
    }

    private static char[] reverseArrayWithConstantSpace(char[] chrs) {
        int front = 0;
        int rear = chrs.length-1;
        while (front < rear) {
            char ch = chrs[front];
            chrs[front] = chrs[rear];
            chrs[rear] = ch;
            front++;
            rear--;
        }
        System.out.println("First iteration : "+ Arrays.toString(chrs));
        int start =0;
        for(int counter=0;counter< chrs.length;counter++){
            if(chrs[counter]==' ' ) {
                swapWord(chrs, start, counter-1);
                start = counter+1;
            }
            if ( counter == chrs.length-1) {
                swapWord(chrs, start, counter);
            }
        }
        return chrs;
    }

    private static void swapWord(char[] chrs, int start, int end) {
        while (start < end){
            char ch = chrs[start];
            chrs[start]= chrs[end];
            chrs[end] = ch;
            start++;
            end--;
        }
    }
}
