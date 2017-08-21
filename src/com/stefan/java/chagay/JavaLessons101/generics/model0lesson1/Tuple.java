package com.stefan.java.chagay.JavaLessons101.generics.model0lesson1;


public class Tuple <T> {

    private final T left;


    private final T right;


    public Tuple(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public T getRight() {
        return right;
    }
}
