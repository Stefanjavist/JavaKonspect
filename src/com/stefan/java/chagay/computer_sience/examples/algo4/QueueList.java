package com.stefan.java.chagay.computer_sience.examples.algo4;


public class QueueList <T> {

    private class Node {
        T item;
        Node next;
        Node prev;

    }
    private Node first;
    private Node last;
    private int size;

    public void enQueue(T item) {
        Node oldNode = last;
        last = new Node();
        last.item = item;
        if(isEmpty()) first = last;
        else oldNode.next = last;
        size++;
    }

    public T deQueue() throws NullPointerException{
        //delete from start list
        T item = first.item;
        first = first.next;
        if (isEmpty()) last =null;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }
}
