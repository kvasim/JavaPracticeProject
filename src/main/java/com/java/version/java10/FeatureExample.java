package com.java.version.java10;

import java.util.ArrayList;
import java.util.List;
/*
1- Local variable type inference
2- orElseThrow() in optional class
3- Creating unmodifiable Collection
4- Application Class-Data Sharing
5- Improved Container Awareness

 */
public class FeatureExample {


    public static void main(String[] args) {
        var value ="Hello";
        System.out.println(value);
       // value = 10;
        List<String> list = new ArrayList<>();
        list.add("Wkhan");
        System.out.println(list);
        var list1 = new ArrayList<Integer>();
        list1.add(545);
        //  list1.add("khan");
        System.out.println("--- list with var : "+list1);
    }

}
