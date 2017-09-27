package com.stefan.java.chagay.computer_sience.examples.algo4;

import edu.princeton.cs.algs4.StdOut;

public class Accumulator {
    private double total = 0;
    private int N = 0;

    public void addDataValue(double val) {
        N++;
        total = val + total;
    }

    public double mean() {
        return total / N;
    }

    @Override
    public String toString(){
        return "Mid (" + N + " mean): "
                + String.format("%7.5f", mean());
    }

    public static void main(String[] args) {
            Accumulator a= new Accumulator();
        for (int i = 0; i < 7; i++) {
            a.addDataValue(i);
            StdOut.println(a);
        }
    }
}
