package com.stefan.java.chagay.Model7Lesson1.Printer;



public class ConsolePrinter implements IPrint{
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
