package com.stefan.java.chagay.JavaLessons101.Model7Lesson1.printer;


public class AdvConsolePrinter implements IPrinter {


    @Override
    public void print(String text) {
        System.out.println(text);
        System.out.println(String.format("Text length - %d", text.length()));
    }
}
