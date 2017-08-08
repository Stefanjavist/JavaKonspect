package com.stefan.java.chagay.Model7Lesson1.reader;

public class PredifineReader implements IReader{

    private final String str;

    public PredifineReader(final String str) {
        this.str = str;
    }

    @Override
    public String read() {
        return str;
    }
}
