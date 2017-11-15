package com.stefan.java.chagay.philosophyJava.arrays;

public class Peel<A, B> {

    public final A first;
    public final B second;
    public Peel(A a, B b) {
        first = a;
        second = b;
    }
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
