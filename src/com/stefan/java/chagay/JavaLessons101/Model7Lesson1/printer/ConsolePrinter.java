package com.stefan.java.chagay.JavaLessons101.Model7Lesson1.printer;

public class ConsolePrinter implements IPrinter {

    @Override
    public void print(final String text) {
        System.out.println(text);
    }
}
