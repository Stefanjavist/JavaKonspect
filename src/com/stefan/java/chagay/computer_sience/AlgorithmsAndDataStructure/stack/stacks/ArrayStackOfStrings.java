package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.stack.stacks;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayStackOfStrings implements Iterator<String> {

    private String[] items;//holds the items
    private int n;// number of items in stack

    public ArrayStackOfStrings(int capacity) {
        items = new String[capacity];
    }


    public boolean isEmpty() {
        return n == 0;
    }

    public boolean isFull() {
        return n == items.length;
    }

    public void push(String item) {
        items[n++] = item;
    }

    public String pop() {
        return items[--n];
        /**
         * my helps
        int x = 5, y = 5;
        System.out.println(++x); // outputs 6
        System.out.println(x); // outputs 6

        System.out.println(y++); // outputs 5
        System.out.println(y); // outputs 6
         */
    }

    public Iterator<String> iterator() {
        return new ReverseArrayIterator();
    }

    public boolean hasNext() {
        return false;
    }

    public String next() {
        return null;
    }

    public String peek() {
        return items[n];
    }

    // an iterator, doesn't implement remove() since it's optional
    private class ReverseArrayIterator implements Iterator<String> {
        private int i = n - 1;

        public boolean hasNext() {
            return i >= 0;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            return items[i--];
        }
    }

    public static void main(String[] args) throws IOException {
        int capacity = Integer.parseInt(args[0]);
        ArrayStackOfStrings stack = new ArrayStackOfStrings(capacity);
        stack.iterator().hasNext();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();

//        Scanner sc = new Scanner(System.in);
//        String string = sc.nextLine();

        while (!string.isEmpty()) {
            string = br.readLine();
            if(string.equals("--")){
                System.out.println(stack.peek());
                continue;
            }
            if (!string.equals("-")) {
                stack.push(string);
                System.out.print("stack full? " + stack.isFull() + "\n");
            } else {
                System.out.println(stack.pop() + " - stack empty? " + stack.isEmpty());
            }
        }
    }

}
