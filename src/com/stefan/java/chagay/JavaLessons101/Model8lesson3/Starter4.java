package com.stefan.java.chagay.JavaLessons101.Model8lesson3;

/**
 * anonymous classes in non-static methods
 */
public class Starter4 {
    private String text;

    public static void main(String[] args) {
        Starter4 st4 = new Starter4();
        st4.text = "12122";
        st4.m();
    }

    public void m() {//non - static method!!
        IPrinter printer = new IPrinter() {
            @Override
            public void print() {
                System.out.println(text);
            }
        };
        printer.print();
        text = "1212";
    }

}
