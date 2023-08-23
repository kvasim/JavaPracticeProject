package com.codility.countingElement.string;

public class LowerAndUpperCaseString {
    public static void main(String[] args) {
        String input = "This is javaTech This is javaTech";
        String result = convertFirstStringInLowerAndSecondStringUpperCase(input);
        System.out.println("Result : "+ result);
    }

    private static String convertFirstStringInLowerAndSecondStringUpperCase(String input) {
        int middlePoint = input.length()/2;
        return input.substring(0,middlePoint).toLowerCase()+input.substring(middlePoint).toUpperCase();
    }
}
