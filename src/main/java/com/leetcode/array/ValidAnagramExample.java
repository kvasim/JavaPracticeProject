package com.leetcode.array;

import java.util.Arrays;

public class ValidAnagramExample {
    public static void main(String[] args) {
        String s="tac";
        String t="cat";
        boolean result = isAnagram(s,t);
        System.out.println("Strings are anagram :"+result);
    }

    private static boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        Arrays.sort(firstString);
        Arrays.sort(secondString);
        System.out.println(Arrays.toString(firstString));
        System.out.println(Arrays.toString(secondString));
        return Arrays.toString(firstString).equals(Arrays.toString(secondString));
    }
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            System.out.println(Arrays.toString(store));
            store[t.charAt(i) - 'a']--;
            System.out.println(Arrays.toString(store));
        }
        System.out.println(Arrays.toString(store));
        for (int n : store) if (n != 0) return false;

        return true;
    }
}
