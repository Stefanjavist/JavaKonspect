package com.stefan.java.chagay.computer_sience.examples;


public class Scip {

    public static void main(String[] args) {

        long af = factIter(1,1,50);
        System.out.println(af);

    }

    private static long factIter(long sum, int counter, int fact) {

        if (counter == fact) {
            return  sum * counter;
        }

        return factIter(sum*counter, counter + 1, fact);
    }
}
