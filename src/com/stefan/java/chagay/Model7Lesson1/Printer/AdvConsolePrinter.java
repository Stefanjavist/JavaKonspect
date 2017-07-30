package com.stefan.java.chagay.Model7Lesson1.printer;


import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class AdvConsolePrinter implements IPrinter {


    @Override
    public void print(String text) {
        System.out.println(text);
        System.out.println(String.format("Text length - %d", text.length()));
    }
}
