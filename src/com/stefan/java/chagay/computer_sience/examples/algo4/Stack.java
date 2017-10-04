package com.stefan.java.chagay.computer_sience.examples.algo4;

import edu.princeton.cs.algs4.StdIn;

public class Stack<T> {

    private int count = 0;
    private int MAX_SIZE;
    private T[] var;

    public Stack(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
         var = (T[]) new Object[MAX_SIZE];
    }

    public void push(T element) {
        var[count++] = element;
    }

    public T pop() throws NullPointerException{
        if(isEmpty()) throw new NullPointerException();

        T element = var[--count];
        var[count] = null;
        return element;
    }

    //count need reduce to one because last element array it's [n-1]
    public T peek() {
        return var[count-1];
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(5);
        while(!StdIn.isEmpty()) {
            String st = StdIn.readLine();

            if (st.equals("--")) {
                System.out.println("see last element: " + stack.peek());
            }

            if (!st.equals("-")) {
                stack.push(st);
            } else {
                System.out.print("delete element: " + stack.pop() + " ");
            }
        }
        System.out.println("Size array = " + stack.size());
        }
    }

