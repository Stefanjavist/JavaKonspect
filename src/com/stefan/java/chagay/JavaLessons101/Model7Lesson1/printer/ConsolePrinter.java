package com.stefan.java.chagay.JavaLessons101.Model7Lesson1.printer;

import com.stefan.java.chagay.JavaLessons101.Model7Lesson1.reader.IReader;

public class ConsolePrinter implements IPrinter {

    @Override
    public void print(final String text) {
        System.out.println(text);
    }


}
