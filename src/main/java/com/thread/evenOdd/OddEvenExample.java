package com.thread.evenOdd;

public class OddEvenExample {
    public static void main(String[] args) {
        Print print = new Print();
        Thread evenThread = new Thread(new OddEvenTask(print,10,true),"EVEN");
        Thread oddThread = new Thread(new OddEvenTask(print,10,false),"ODD");

        evenThread.start();
        oddThread.start();

        System.out.println("--------- Main Thread-------------");


    }
}
