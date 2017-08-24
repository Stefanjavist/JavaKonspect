package com.stefan.java.chagay.JavaLessons101.Model8lesson3;


public class TextPrinter implements IPrinter{

    private final String text;

    public TextPrinter(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

    public void printNameClass(){
        System.out.println(getClass().getCanonicalName());
    }
}
