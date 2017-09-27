package com.stefan.java.chagay.computer_sience.examples.algo4;

/**
 * Created by Stefan on 9/22/2017.
 */
public class Counter {
    private int i = 0;
    private String st;

    public Counter(String st) {
        this.st = st;
    }

    public void increment() {
        i++;
    }

    public int tally() {
        return i;
    }

    @Override
    public String toString() {
        return st + " " +tally();
    }
}
