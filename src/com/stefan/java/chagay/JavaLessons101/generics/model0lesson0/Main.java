package com.stefan.java.chagay.JavaLessons101.generics.model0lesson0;

public class Main {

    public static void main(String[] args) {
        final Tupe student1 = new Tupe(1, 112);
        final String name = (String) student1.getLeft() ;//!!!!! here getLeft Integer cannot be cast to java.lang.String
        System.out.print(name);
    }
}
