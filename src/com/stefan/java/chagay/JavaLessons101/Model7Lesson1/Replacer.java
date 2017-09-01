package com.stefan.java.chagay.JavaLessons101.Model7Lesson1;


import com.stefan.java.chagay.JavaLessons101.Model7Lesson1.printer.IPrinter;
import com.stefan.java.chagay.JavaLessons101.Model7Lesson1.reader.IReader;

public class Replacer {

    private final IReader reader;

    private final IPrinter printer;

    public Replacer(final IReader reader, final IPrinter printer) {
        this.reader = reader;
        this.printer = printer;
    }

    public void replace(){
        final String text = reader.read();
        final String replacedText = text.replace(":)", "TM");
        printer.print(replacedText);
    }


}
