package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.stack.stacks;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestArrayStackOfString<T> {

    private String [] stack;
    private int cappacity;

    public TestArrayStackOfString(int capacity) {
        this.stack = new String[capacity];
    }

    private boolean isEmpty()
    {
        return cappacity == 0;
    }

    private boolean isFull()
    {
        return cappacity == stack.length;
    }

    private void push(String val) {
//        if(!isFull()){
            stack[cappacity++] = val;

//        System.out.println("stack is full!!");
    }

    private String pop() {
//        if(!isEmpty()){
            return stack[--cappacity];
//        }
//        return "stack is empty!!";
    }

    public static void main(String[] args) throws IOException {
        int capacity = Integer.parseInt(args[0]);
        TestArrayStackOfString testArrStack = new TestArrayStackOfString(capacity);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        while(!a.isEmpty()) {
             a = br.readLine();
            if(!a.equals("-")) {
                testArrStack.push(a);
            } else  {
                System.out.println("Delete - "+testArrStack.pop());
            }
        }

    }
}
