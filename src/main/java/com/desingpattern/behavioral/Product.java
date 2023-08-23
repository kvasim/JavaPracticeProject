package com.desingpattern.behavioral;

import com.desingpattern.behavioral.observer.Observer;
import com.desingpattern.behavioral.observer.Subject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String productName;
    private String productType;
    private String productPrice;
    private String availability;

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
        System.out.println("Observer added in system....");
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
        System.out.println("Observer removed from system....");

    }

    public void setAvailability(String availability) {
        this.availability = availability;
        System.out.println("Availability changed from not available to available");
        notifyObeserver();
    }
    @Override
    public void notifyObeserver() {
        System.out.println("Product name : "
                +   this.getProductName() +", Product Type : "+this.productType+ ", product price : "+ this.productPrice
        + " is available now. So, notifying all the users.");
        this.observers.forEach(observer1 -> observer1.update(this.availability));
    }
}
