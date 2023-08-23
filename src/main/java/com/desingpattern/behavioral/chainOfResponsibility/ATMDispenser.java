package com.desingpattern.behavioral.chainOfResponsibility;

import java.util.Scanner;
import java.util.Scanner;

interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispense(Currency currency);
}

class Currency {
    private int amount;

    public Currency(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}

class Dollar10Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;
            System.out.println("Dispensing " + num + " $10 note");

            if (remainder != 0) {
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}

class Dollar20Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;
            System.out.println("Dispensing " + num + " $20 note");

            if (remainder != 0) {
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}

class Dollar50Dispenser implements DispenseChain {
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;
            System.out.println("Dispensing " + num + " $50 note");

            if (remainder != 0) {
                nextChain.dispense(new Currency(remainder));
            }
        } else {
            nextChain.dispense(currency);
        }
    }
}

public class ATMDispenser {
    private DispenseChain dispenserChain;

    public ATMDispenser() {
        // Initialize the chain of dispensers
        dispenserChain = new Dollar50Dispenser();
        DispenseChain dollar20Dispenser = new Dollar20Dispenser();
        DispenseChain dollar10Dispenser = new Dollar10Dispenser();

        // Set the next chain in the order: $50 -> $20 -> $10
        dispenserChain.setNextChain(dollar20Dispenser);
        dollar20Dispenser.setNextChain(dollar10Dispenser);
    }

    public static void main(String[] args) {
        ATMDispenser atmDispenser = new ATMDispenser();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter amount to withdraw: ");
            int amount = scanner.nextInt();

            if (amount ==0 || amount % 10 != 0) {
                System.out.println("Amount should be multiple of 10s.");
                continue;
            }

            Currency currency = new Currency(amount);
            atmDispenser.dispenserChain.dispense(currency);

            System.out.println("******************************");
        }
    }

    private void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            dispenserChain.dispense(currency);
        } else {
            System.out.println("Amount should be greater than 10.");
        }
    }
}
