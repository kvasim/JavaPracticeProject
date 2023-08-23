package com.thread.evenOdd;

public class OddEvenSemaphoreTask implements Runnable{
    private int max;
    private SharedPrinter print;
    private boolean isEvenNumber;

    public OddEvenSemaphoreTask(SharedPrinter print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }
    @Override
    public void run() {
        int number = isEvenNumber? 2:1;
        while(number <=max) {
            if(isEvenNumber) {
                print.printEvenNumber(number);

            } else {
                print.printOddNumber(number);
            }
            number= number+2;
        }

    }
}
