package com.stefan.java.chagay.Model7Lesson1.printer;

import com.stefan.java.chagay.Model7Lesson1.printer.IPrinter;

public class ConsolePrinter implements IPrinter {

    @Override
    public void print(final String text) {
        System.out.println(text);
    }
}
