package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.stack.stacks;

import com.stefan.java.chagay.JavaLessons101.Model7Lesson3.Item;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class TestArrayResizing<Item> implements Iterable<Item>{

    private Item[] arr;
    private int n;

    public TestArrayResizing(){
        arr = (Item[]) new Object[2];
        n = 0;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public void push(Item item) {
        if(n == arr.length) {
            resize(arr.length * 2);
        }
        arr[n++] = item;
    }

    public Item pop() {
        if(isEmpty()) throw new NoSuchElementException();

        Item item = arr[n-1];
        arr[n - 1] = null;
        n --;
        if(n >= 0 && n == arr.length / 4) resize(arr.length / 2);
        return item;
    }

    public void resize(int capability) {
        assert capability >=n;

        Item[] temp = (Item[]) new Object[capability];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }


    @Override
    public Iterator<Item> iterator() {
        return new ResizingIterator<Item>();
    }

    private class ResizingIterator<Item> implements Iterator<Item>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Item next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }

    public static void main(String[] args) throws IOException {
        TestArrayResizing<String> stack = new TestArrayResizing<>();

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String st = br.readLine();

         while (!st.isEmpty()) {

             String item = br.readLine();

             if (!item.equals("-")) {
                 stack.push(item);
             } else if (!stack.isEmpty())
                 System.out.println(stack.pop());
        System.out.println("(" + stack.size() + " - size resizing array");
         }
    }
}

