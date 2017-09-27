package com.stefan.java.chagay.computer_sience.examples.algo4;


import java.util.Iterator;

public class ResizingArrayStack<Item> {

    private Item[] st = (Item[]) new Object[1];
    private int N;

    public void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < max; i++) {
            temp[i] = st[i];
        }
        st = temp;
    }

    public boolean isEmpty() {
        return N ==0;
    }

    public int size() {
        return N;
    }

    public void push(Item element) {
        if(N == st.length) resize(st.length * 2);
        st[N++] = element;
    }

    public Item pop() {
        Item item = st[--N];
        st[N] = null;
        if(N == 0 && N == st.length/4) resize(st.length/2);
        return item;
    }

    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item>{
        //by LIFO
        int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return st[--i];
        }
    }

}
