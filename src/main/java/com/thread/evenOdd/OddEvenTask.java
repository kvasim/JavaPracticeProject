package com.thread.evenOdd;

public class OddEvenTask implements Runnable{
    private int max;
    private Print print;
    private boolean isEvenNumber;

    public OddEvenTask(Print print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }
    @Override
    public void run() {
        int number = isEvenNumber? 2:1;
        while(number <=max) {
            if(isEvenNumber) {
                print.printEven(number);

            } else {
                print.printOdd(number);
            }
            number= number+2;
        }

    }
}
