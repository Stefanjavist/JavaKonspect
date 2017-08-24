package com.stefan.java.chagay.JavaLessons101.Model8lesson3;

/**
 * мы можетм делать instance interfaces спомощью анонимных классов,
 * но не возможно создавать instance interfaces
 */
public class Staret2 {



    public static void main(String[] args) {
        final IPrinter iPrinter = new IPrinter(){
            @Override
            public void print() {
                System.out.println("hello guy");
            }
        };
        iPrinter.print();
    }
}
