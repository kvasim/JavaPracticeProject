package com.java9;

import java.util.List;
import java.util.Map;

public class CollectionsExample {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("A", "22", "33","B");
        System.out.println(map);
       // map = Map.of("A", "22", "");
        System.out.println(map);
        //Null not allowed
        List.of(null);
    }
}
