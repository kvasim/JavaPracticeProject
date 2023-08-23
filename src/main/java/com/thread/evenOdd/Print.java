package com.thread.evenOdd;

public class Print {
    private volatile boolean isOdd;
    synchronized public void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
    }
    synchronized public void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }
}
