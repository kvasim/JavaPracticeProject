package com.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true

 */
public class DuplicateValueExample {
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
       // boolean isDuplicate = isDuplicateAvailable(nums);
        boolean isDuplicate = containsDuplicate(nums);
        System.out.println("Result : "+isDuplicate);

    }

    private static boolean isDuplicateAvailable(int[] nums) {
        Set<Integer> inputSet = Arrays.stream(nums).boxed().distinct().collect(Collectors.toSet());
        return nums.length != inputSet.size();
    }
    private static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean isDuplicate=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) {
                isDuplicate= true;
                break;
            }
        }
        return isDuplicate;
    }
    //Copy
    public static boolean containsDuplicateFinal(int[] nums) {
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(Integer.valueOf(nums[i]))) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}
