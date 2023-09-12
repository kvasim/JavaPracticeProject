package com.leetcode.array;

import java.util.*;
import java.util.stream.Collectors;

/*
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.



Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.


Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */
public class TopKFrequentElements {
    public static void main(String[] args) {
        //int[] nums = {1,1,1,2,2,3};
        int[] nums = {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
        int k=4;
        int[] result = findTopKFrequentElements(nums, k);
        System.out.println("Result : "+ Arrays.toString(result));
    }

    private static int[] findTopKFrequentElements(int[] nums, int k) {
        Map<Integer, Integer> frequentElMap = new HashMap<>();
        for(int value : nums) {
            if(frequentElMap.containsKey(value)) {
                frequentElMap.put(value,frequentElMap.get(value)+1);
            } else {
                frequentElMap.put(value, 1);
            }
        }
        return frequentElMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
                .map(Map.Entry::getKey)
                .limit(k)
                .toList()
                .stream().mapToInt(value -> value).toArray();

    }
}
