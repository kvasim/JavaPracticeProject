package com.desingpattern.behavioral.observer;

import com.desingpattern.behavioral.Product;

import java.util.ArrayList;
import java.util.List;

/*
The observer design pattern is a software design pattern in which an object, called the subject,
 maintains a list of its dependents, called observers, and notifies them automatically of any state
  changes, usually by calling one of their methods.
  - The observer pattern defines a one to many dependency between objects so that when one onject changes state, all of its dependents are
  notified and updated automatically.
  - Another name of observer is listener
 */
public class ObserverExample {
    public static void main(String[] args) {
        Product vuLEDTV = Product.builder()
                .productName("VU LED")
                .productType("LED TV")
                .productPrice("40000 Rs")
                .availability("Not available")
                .observers(new ArrayList<>())
                .build();
        Person wkhan = new Person("Wasim Khan", vuLEDTV);
        Person tanveer = new Person("Tanveer Ansari", vuLEDTV);
        List<Observer> observerList = vuLEDTV.getObservers();
        System.out.println("Subscriber list : "+observerList);
        observerList.forEach(observer -> System.out.println(((Person)observer).getPersonName()));
        System.out.println("----------");
        System.out.println("LED current status : "+ vuLEDTV.getAvailability());
        System.out.println("----------");
        vuLEDTV.setAvailability("Available");

    }
}
