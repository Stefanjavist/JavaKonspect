package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.stack.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ResizingArrayStack<Item> implements Iterable <Item> {

    private Item[] a; // array of items
    private int n; //number of elements on stack

    /**
     * initializes an empty stack
     */
    ResizingArrayStack() {
        a = (Item[]) new Object[2];
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public int size() {
        return n;
    }

    //resize the underlying array holding the elements
    private void resize(int capacity){
        assert capacity >= n;

        //textbook implementation
        Item[] temp = (Item[]) new Object[capacity];
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }
        a = temp;

        // alternative implementation
        // a = java.util.Arrays.copyOf(a, capacity);
    }

    /**
     * adds the item to this stack
     */
    public void push(Item item) {
        if(n == a.length) {
            resize(2 * a.length);
        } // double size of array if necessary
        a[n++] = item; // simple add item
    }

    public Item pop() {
        if(!isEmpty()) {
            throw new NoSuchElementException();
        } Item item = a[n - 1];//???? why one instead a--
        a[n -1]= null;//element become null
        n--;//and size array shrink
        //shrink size of array if necessary
        if(n > 0 && n == a.length/4) resize(a.length/2);//????
        return item;
    }

    /**
     * Returns an iterator to this stack that iterates through the items in LIFO order.
     * @return an iterator to this stack that iterates through the items in LIFO order.
     */
    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    //an iterator, doesn't implement remove() since it's optional
    private class ReverseArrayIterator implements  Iterator<Item> {

        private int i;

        public ReverseArrayIterator() {
            i = n - 1;
        }

        public boolean hasNext() {
            return i >= 0;
        }

        public Item next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return a[i--];
        }
    }

        public static void main(String[] args) throws IOException {
            ResizingArrayStack<String> stack = new ResizingArrayStack<String>();
            BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
            String newElemet = bs.readLine();
            while(!newElemet.isEmpty()) {
                String item = bs.readLine();
                if(!item.equals("-")) {
                    stack.push(item);
                } else if(!stack.isEmpty()) {
                    System.out.println(stack.pop());
                }
                System.out.println("(" + stack.size() + " left on stack)");
            }
        }
    }





