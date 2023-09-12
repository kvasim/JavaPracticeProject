package com.leetcode.array;

import java.util.Arrays;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        //[24,12,8,6]
        int[] result = productExceptSelfNumsAsPrefix(nums);
        System.out.println("Result :"+Arrays.toString(result));

    }

    private static int[] findProductOfArray(int[] nums) {
        int[] result = new int[nums.length];
        int counter=0;
        for(int i=0;i<nums.length;i++){
            int mul=1;
            for(int k=0;k<nums.length;k++) {
                if(i==k) {
                    continue;
                }
                mul = mul*nums[k];
            }
            result[counter++]= mul;
        }
        return result;
    }
    //Copied
    public static int[] productExceptSelfNumsAsPrefix(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
//{1,2,3,4};
        for (int i = 0; i < nums.length - 1; i++) {
            output[i + 1] = output[i] * nums[i];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            output[i] = nums[i + 1] * output[i];
            nums[i] = nums[i] * nums[i + 1];
        }
        return output;
    }
}
