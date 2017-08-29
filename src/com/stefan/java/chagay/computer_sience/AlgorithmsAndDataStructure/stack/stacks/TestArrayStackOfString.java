package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.stack.stacks;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestArrayStackOfString {

    private int [] stack;
    private int cuppacity;

    public TestArrayStackOfString(int i) {
        stack = new int[i];
        cuppacity = i;
    }

    private boolean isEmpty(){
        return cuppacity == 0;
    }

    private boolean isFull(){
        return cuppacity == stack.length;
    }

    private void push(int numb) {
        if(!isFull()){
            stack[cuppacity + 1] = numb;
            cuppacity++;
        }
        System.out.println("stack is full!!");
    }

    private void pop() {
        if(!isEmpty()){
            stack[cuppacity] = stack[cuppacity - 1];
            cuppacity--;
        }
        System.out.println("stack is empty!!");
    }

    public static void main(String[] args) throws IOException {
        int capacity = Integer.parseInt(args[0]);
        TestArrayStackOfString testArrStack = new TestArrayStackOfString(capacity);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
//        while() {
//            if(br.equals("-")){
//                testArrStack.pop();
//            }else if(!testArrStack.isFull()){
//                testArrStack.push();
//            }
//            System.out.println("stack is empty ");
//
//        }

    }
}
