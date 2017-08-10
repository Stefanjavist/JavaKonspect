package com.stefan.java.chagay.JavaLessons101.Model7Lesson2;


public class PredefSmileProc extends AbstractSmileProcessor {

    @Override
    protected String readString() {
        return "text from :) file :) :) :)";
    }

    public static void main(String[] args) {
        final PredefSmileProc predefSmileProc = new PredefSmileProc();
        predefSmileProc.process();
    }

    @Override
    public void test1() {

    }
}
