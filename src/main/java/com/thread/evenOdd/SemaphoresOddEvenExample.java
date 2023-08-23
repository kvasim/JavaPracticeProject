package com.thread.evenOdd;

public class SemaphoresOddEvenExample {
    public static void main(String[] args) {
        SharedPrinter printer = new SharedPrinter();
        Thread even = new Thread(new OddEvenSemaphoreTask(printer,20,true), "EVEN");
        Thread odd = new Thread(new OddEvenSemaphoreTask(printer,20,false),"ODD");
        even.start();
        odd.start();
        System.out.println("Main thread finished---------------");

    }
}
