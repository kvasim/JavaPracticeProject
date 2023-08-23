package com.thread.evenOdd;

import java.util.concurrent.Semaphore;
import java.util.stream.Stream;

public class SharedPrinter {
    Semaphore evenSemaphore = new Semaphore(0);
    Semaphore oddSemaphore = new Semaphore(1);

    void printEvenNumber(int num) {
        try {
            evenSemaphore.acquire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(Thread.currentThread().getName()+" : "+num);
        oddSemaphore.release();
    }

    void printOddNumber(int num) {
        try {
            oddSemaphore.acquire();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName()+" : "+num);
        evenSemaphore.release();
    }
}
