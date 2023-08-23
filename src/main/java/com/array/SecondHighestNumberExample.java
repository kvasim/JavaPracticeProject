package com.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondHighestNumberExample {
    public static void main(String[] args) {
        //Find second highest number from unsorted array
        int[] unSortedArray = {55,2,6,45,8,1,44,54};
        int result = findSecondHighestNumber(unSortedArray);
        System.out.println("Result:: Second Highest Number : "+ result);
        System.out.println("-------------");
        int[] nums = {5, 2, 8, 9, 3, 10, 6};
        int secondHighest = findSecondHighest(nums);
        System.out.println("Second highest number: " + secondHighest);

    }

    private static int findSecondHighestNumber(int[] unSortedArray) {
        int max=unSortedArray[0];
        int secondMax=0;
        for(int num :unSortedArray) {
            if (num > max) {
                secondMax = max;
                max = num;
            }
            if (num > secondMax && num !=max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    //By ChatGTP
    public static int findSecondHighest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array should contain at least two numbers.");
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Array does not have a second highest number.");
        }

        return secondHighest;
    }
    public static int findSecondHighest2(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array should contain at least two numbers.");
        }

        OptionalInt max = Arrays.stream(nums).reduce(Math::max);
        OptionalInt secondHighest = Arrays.stream(nums).filter(n->n<max.getAsInt()).reduce(Math::max);
        System.out.println("Second highest :"+ secondHighest.getAsInt());

        return secondHighest.getAsInt();
    }
}
