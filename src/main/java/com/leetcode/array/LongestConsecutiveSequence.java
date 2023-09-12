package com.leetcode.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
128. Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.



Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        //int[] nums = {1,2,0,1};
        int[] nums ={9,1,4,7,3,-1,0,5,8,-1,6};
        //output- Output: 7
        int result = findLongestSequenceDigit(nums);
        System.out.println("Longest Sequence :"+result);
    }

    // Error for some input as :Memory Limit Exceeded
    private static int findLongestSequence(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        int result =0;
        int counter =0;
        Arrays.sort(nums);
        System.out.println("Sorted input :"+Arrays.toString(nums));
        List<Integer> sequenceValues = IntStream.rangeClosed(nums[0], nums[nums.length-1])
                .boxed()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Seq :"+sequenceValues);
        List<Integer> inputList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(Integer seq : sequenceValues) {
            if(inputList.contains(seq)) {
                counter++;
                continue;
            }
            if (result < counter){
                result = counter;
            }
            counter =0;
        }
        if (result < counter){
            result = counter;
        }
        return result;
    }
//Accepted code
    private static int findLongestSequenceDigit(int[] nums) {
        if(nums == null || nums.length==0){
            return 0;
        }
        int result =0;
        int counter =1;
        Arrays.sort(nums);
        System.out.println("Sorted Input : "+Arrays.toString(nums));
        int initialValue = nums[0];
        for(int i=1;i<nums.length;i++) {
            //If duplicate value, continue without counter increment
            if(nums[i]==initialValue)continue;
            if(nums[i] == (initialValue+1)) {
                counter++;
                initialValue = nums[i];
                continue;
            }
            if (result < counter){
                result = counter;
            }
            initialValue = nums[i];
            counter =1;
        }
        if (result < counter){
            result = counter;
        }
        return result;
    }

    // Copied
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int num:nums) hs.add(num);
        int longest =1;
        for(int num: nums ){
            //check if the num is the start of a sequence by checking if left exists
            if(!hs.contains(num-1)){ // start of a sequence
                int count =1;
                while(hs.contains(num + 1)){ // check if hs contains next no.
                    num++;
                    count++;
                }
                longest = Math.max(longest, count);

            }
            if(longest > nums.length/2) break;

        }
        return longest;
    }
}
