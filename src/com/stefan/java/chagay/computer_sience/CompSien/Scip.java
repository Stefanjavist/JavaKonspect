package com.stefan.java.chagay.computer_sience.CompSien;


public class Scip {

    public static void main(String[] args) {

        int af = factIter(1,1,3);
        System.out.println(af);

    }

    private static int factIter(int sum, int counter, int fact) {

        if (counter == fact) {
            return  sum * counter;
        }

        return factIter(sum*counter, counter +1, fact);
    }
}
