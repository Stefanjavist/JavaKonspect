package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.stack;


public class Stack {

    public static void main(String[] args) {
        Stack stack = new Stack();
//        System.out.println(stack.isEmpty());
        System.out.println("top element - " + stack.peek());
        stack.push(1);      // ^
        stack.push(54);     // | ...
        stack.push(4);      // | data2
        stack.push(543);    // | data1
        stack.push(24);     // | top

        while(!stack.isEmpty()) {
            int data = stack.isPop();
            System.out.printf("%d \n", data);
        }
        System.out.printf("Stack is full %s\n", stack.isFull()?"true":"false");
        System.out.printf("Stack is empty %s\n", stack.isEmpty()?"true":"false");
//        System.out.println(stack.peek());
//        stack.push(23);
//        System.out.println("\n"+stack.isPop(23));

    }

    private int MAX_SIZE;
    private int top = 0;
    private int[] stack;

    //Basic Operations
    private int peek() {
        return stack[top];
    }

    private boolean isFull() {

        if (top == MAX_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isEmpty() {
        if (top == stack[0]) {
            return true;
        } else {
            return false;
        }
    }

    //Push processing
    //Step 1 − Checks if the stack is full.

//    Step 2 − If the stack is full, produces an error and exit.
//
//    Step 3 − If the stack is not full, increments top to point next empty space.
//
//    Step 4 − Adds data element to the stack location, where top is pointing.
//
//    Step 5 − Returns success.

    private void push(int data) {
        if (!isFull()) {
            stack[top++] = data;
            return;
        }
        System.out.println("Error stack is full");
    }

    //Pop Operation
    //Step 1 − Checks if the stack is empty.

//    Step 2 − If the stack is empty, produces an error and exit.
//
//    Step 3 − If the stack is not empty, accesses the data element at which top is pointing.
//
//    Step 4 − Decreases the value of top by 1.
//
//    Step 5 − Returns success.
    private int isPop() {
        int data;

        if(!isEmpty()) {
            data = stack[--top];
            return data;
        }
        return 404;

    }
}
