package com.problemSolving;

public class SquareRootExample {
    public static void main(String[] args) {
        /*
        sqrt(n+1) = (SqrtN+(num/sqrtN))/2.0
         */
        System.out.println(square(16));
    }
    public static double square(double number){
        double t;

        double squareroot = number / 2;

        do {
            t = squareroot;
            squareroot = (t + (number / t)) / 2;
        } while ((t - squareroot) != 0);

        return squareroot;
    }
}
