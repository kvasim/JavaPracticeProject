package com.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
 */
public class TwoSumProblem {
    public static void main(String[] args) {
        int[] nums = {2,5,5,11};
        int target = 10;
        int[] result = findTargetSumIndices(nums,target);
        System.out.println(Arrays.toString(result));

    }

    private static int[] findTargetSumIndices(int[] nums, int target) {
        int[] result = {-1,-1};
        var i=0;
        while(i<nums.length-1) {
            for(int k=i+1;k<nums.length;k++) {
                int sum = nums[i] + nums[k];
                if (sum == target) {
                    result[0] = i;
                    result[1] = k;
                    return result;
                }
            }
            i++;

        }
        return result;
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();
        //{2,5,5,11};//10
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
}
