package com.stefan.java.chagay.Model7Lesson1.Printer;


public class AdvConsolePrinter implements IPrint{


    @Override
    public void print(String text) {
        System.out.println(text);
        System.out.println(String.format("String length:%d", text.length()));
    }
}
