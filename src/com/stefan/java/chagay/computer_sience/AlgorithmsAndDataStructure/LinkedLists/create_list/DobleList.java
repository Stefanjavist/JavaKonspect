package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.LinkedLists.create_list;


import java.util.NoSuchElementException;

public class DobleList<T> {
    //first node is this head and tail concurrently
    private Node head;
    private Node tail;
    private int size;


    public static void main(String[] args) {
        DobleList<String> dl = new DobleList<String>();
        dl.firstInsert("hello");
        dl.firstInsert("how");
        dl.lastInsert("are");
        dl.lastInsert("you");
        dl.lastInsert("?");

        dl.iF();
        dl.firstRemove();
        dl.lastRemove();
        dl.iB();
    }

    private void sizeList() {
        System.out.print("\nsize - " + size+"\n");
    }

    private T lastRemove() {
        if(size == 0) throw new NoSuchElementException();

        Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return tmp.data;

    }

    private T firstRemove() throws NullPointerException{
        if(size == 0) throw new NullPointerException();

        Node tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        return tmp.data;
    }

    private void firstInsert(T data) {
        Node tmp = new Node(data, head, null);
        if(head != null ) {head.prev = tmp;}
        head = tmp;
        if(tail == null) { tail = tmp;}
        size++;
    }

    private void lastInsert(T data) {
        Node tmp = new Node(data, null, tail);
        if(tail != null) {tail.next = tmp;}
        tail = tmp;
        if(head == null) { head = tmp;}
        size++;
    }

    private void iF() {
        System.out.println("iterate frontward");
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    private void iB() {
        System.out.println("iterate backward");
        Node tmp = tail;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.prev;
        }
    }


    /**
     * nodes
     */
    private class Node {
        private T data;
        private Node next;
        private Node prev;

        public Node(T data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

}
