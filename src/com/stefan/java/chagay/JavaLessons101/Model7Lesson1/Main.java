package com.stefan.java.chagay.JavaLessons101.Model7Lesson1;


import com.stefan.java.chagay.JavaLessons101.Model7Lesson1.printer.AdvConsolePrinter;
import com.stefan.java.chagay.JavaLessons101.Model7Lesson1.printer.ConsolePrinter;
import com.stefan.java.chagay.JavaLessons101.Model7Lesson1.printer.IPrinter;
import com.stefan.java.chagay.JavaLessons101.Model7Lesson1.reader.IReader;
import com.stefan.java.chagay.JavaLessons101.Model7Lesson1.reader.PredifineReader;

public class Main {

    public static void main(String[] args) {
        final IReader reader = new PredifineReader("jlfjsljf:) sdfn:) kf:)");
        final IPrinter printer = new ConsolePrinter();
        final Replacer replacer = new Replacer(reader, printer);
        replacer.replace();

        System.out.println();

        final IPrinter advConPrinter = new AdvConsolePrinter();
        final Replacer advReplacer = new Replacer(reader, advConPrinter);
        advReplacer.replace();
    }

}
