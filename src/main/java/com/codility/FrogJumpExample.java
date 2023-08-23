package com.codility;

import com.example.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrogJumpExample {

    public static void main(String[] args) {
        Character[] ch= {'a',' ','c',' ','e'};
        int x=10;
        int y=80;
        int d=30;
        int result = solution(x, y, d);
        System.out.println("Minimum required jump :"+result);
    }

    private static int solution(int X, int Y, int D) {
        double reqJump = (Y-X)/(double)D;
        return Double.valueOf(Math.ceil(reqJump)).intValue();

    }
}
