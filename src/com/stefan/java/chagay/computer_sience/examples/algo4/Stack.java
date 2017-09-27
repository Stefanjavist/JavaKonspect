package com.stefan.java.chagay.computer_sience.examples.algo4;

public class Stack<T> {

    private T[] var;
    private int count;

    public void push(T element) {
        var[count++] = element;
    }

    public T pop() {
        T element = var[--count];
        var[--count] = null;
        return element;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

}
