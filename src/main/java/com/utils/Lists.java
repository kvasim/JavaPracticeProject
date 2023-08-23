package com.utils;

import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class Lists {

    public static List<ArrayList<String>> newArrayList(List<ArrayList<String>> list1,List<ArrayList<String>> list2,
                                                       List<ArrayList<String>> list3){
        list1.addAll(list2);
        list1.addAll(list3);
        return list1;

    }

    public static List<ArrayList<String>> newArrayList(String mariam, String alex, String ismail) {
        List<ArrayList<String>> arrayLists = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(mariam);
        arrayList.add(alex);
        arrayList.add(ismail);
        arrayLists.add(arrayList);
        return arrayLists;
    }

    public static List<ArrayList<String>> newArrayList(String susy, String ali) {
        List<ArrayList<String>> arrayLists = new ArrayList<>();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(susy);
        arrayList.add(ali);
        arrayLists.add(arrayList);
        return arrayLists;
    }
}
