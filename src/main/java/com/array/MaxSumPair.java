package com.array;
/*
Find the Two Numbers with Maximum Sum in an Array with best optimization
--{111, 4, 2, 7, 9, 33};
--This optimized solution reduces the time complexity to O(n), where n is the length of the array.
 It avoids unnecessary comparisons and nested loops, resulting in improved efficiency.
 */
public class MaxSumPair {
    public static int[] findMaxSumPair(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array should contain at least two numbers.");
        }

        int maxSum = Integer.MIN_VALUE;
        int maxSumIndex1 = -1;
        int maxSumIndex2 = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int currentSum = nums[i] + nums[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    maxSumIndex1 = i;
                    maxSumIndex2 = j;
                }
            }
        }

        if (maxSumIndex1 == -1 || maxSumIndex2 == -1) {
            throw new IllegalArgumentException("Unable to find two numbers with maximum sum.");
        }

        int[] result = {nums[maxSumIndex1], nums[maxSumIndex2]};
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {111, 4, 2, 7, 9, 33};
        int[] maxSumPair = findMaxSumPair2(nums);
        System.out.println("Two numbers with maximum sum: " + maxSumPair[0] + " and " + maxSumPair[1]);
    }

    public static int[] findMaxSumPair2(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array should contain at least two numbers.");
        }

        int maxNum1 = Math.max(nums[0], nums[1]);
        int maxNum2 = Math.min(nums[0], nums[1]);
        int maxSum = nums[0] + nums[1];

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > maxNum1) {
                maxNum2 = maxNum1;
                maxNum1 = nums[i];
            } else if (nums[i] > maxNum2) {
                maxNum2 = nums[i];
            }

            maxSum = Math.max(maxSum, maxNum1 + maxNum2);
        }

        int[] result = {maxNum1, maxNum2};
        return result;
    }
}
