package com.leetcode.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Description
Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.

Please implement encode and decode

Only $39.9 for the "Twitter Comment System Project Practice" within a limited time of 7 days!

WeChat Notes Twitter for more information（WeChat ID jiuzhang104）


Example
Example1

Input: ["lint","code","love","you"]
Output: ["lint","code","love","you"]
Explanation:
One possible encode method is: "lint:;code:;love:;you"
Example2

Input: ["we", "say", ":", "yes"]
Output: ["we", "say", ":", "yes"]
Explanation:
One possible encode method is: "we:;say:;:::;yes"

 */
public class EncodeAndDecodeProblem {
    final static String SEPERATER ="#";
    public static void main(String[] args) {
        String[] strs = {"lint","code","love","you"};
        String encodedString = encodeStr(strs);
        System.out.println("Encoded String : "+encodedString);

        List<String> decodedStr = decodeStr(encodedString);
        System.out.println("Decoded String : "+decodedStr);

    }

    private static List<String> decodeStr(String str) {
        return Arrays.stream(str.split(SEPERATER))
                .filter(word->!SEPERATER.equals(word))
                .collect(Collectors.toList());
    }

    private static String encodeStr(String[] strs) {
        String encodedStr = Arrays.stream(strs).collect(Collectors.joining(SEPERATER));
        return encodedStr;
    }
    private static String encodeStr(List<String> strs) {
        return strs.stream().collect(Collectors.joining(SEPERATER));
    }
}
