package com.leetcode.array;

import java.util.*;
import java.util.stream.Collectors;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]


Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
 */
public class GroupAnagram {
    public static void main(String[] args) {
        //String[] groupAnagram = {"eat","tea","tan","ate","nat","bat"};
        String[] groupAnagram = {"a"};
        List<List<String>> result = findAnagramStrings(groupAnagram);
        System.out.println("Result :"+result);

    }

    private static List<List<String>> findAnagramStrings(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for(String word:strs) {
            String sortedWord = sortString(word);
            if(anagramMap.containsKey(sortedWord)) {
                anagramMap.get(sortedWord).add(word);
            } else {
                anagramMap.computeIfAbsent(sortedWord,k-> new ArrayList<>(Collections.singleton(word)));
            }
        }
        return anagramMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
    }

    private static String sortString(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
//Copied code
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
