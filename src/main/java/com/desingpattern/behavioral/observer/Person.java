package com.desingpattern.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Person implements Observer{

    private String personName;

    Person(String personName, Subject subject){
        this.personName = personName;
        subject.registerObserver(this);
    }
    @Override
    public void update(String availability) {
        System.out.println("Hello :"+personName+", product is now "+ availability +" on Flipkart.");
    }
}
