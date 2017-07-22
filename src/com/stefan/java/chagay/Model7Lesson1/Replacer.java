package com.stefan.java.chagay.Model7Lesson1;


import com.stefan.java.chagay.Model7Lesson1.Printer.AdvConsolePrinter;
import com.stefan.java.chagay.Model7Lesson1.Printer.ConsolePrinter;
import com.stefan.java.chagay.Model7Lesson1.Printer.IPrint;
import com.stefan.java.chagay.Model7Lesson1.Readers.IReader;
import com.stefan.java.chagay.Model7Lesson1.Readers.PredefinedReader;

public class Replacer {

        private final IReader reader;

        private final IPrint printer;

    public Replacer(final IReader reader,
                    final IPrint printer) {
        this.reader = reader;
        this.printer = printer;
    }

        public void replace() {
        final String text = reader.read();
        final String replaceText = text.replace(":)", "=)");
        printer.print(replaceText);
        }

    public static void main(String[] args) {
        final IReader reader = new PredefinedReader("abc:)asfojjasljfl:):)jfj:)");
        final IPrint printer = new ConsolePrinter();
        final IPrint advPrinter = new AdvConsolePrinter();
        final Replacer replacer = new Replacer(reader, printer);
        final Replacer adcReplacer = new Replacer(reader, advPrinter);
        replacer.replace();
        adcReplacer.replace();
    }
}
