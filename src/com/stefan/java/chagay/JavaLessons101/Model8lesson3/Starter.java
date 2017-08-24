package com.stefan.java.chagay.JavaLessons101.Model8lesson3;

public class Starter {

    public static void main(String[] args) {
        final IPrinter textPrinter = new TextPrinter("text to print"){

            @Override
            public void print() {
                System.out.println("**********");
                System.out.println(getClass().getCanonicalName());
                super.print();
            }

        };//create new class

    }


}
