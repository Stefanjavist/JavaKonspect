package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.LinkedLists.create_list;


import java.util.NoSuchElementException;

public class DobleList<T> {
    //first node is this head and tail concurrently
    private Node head;  // ---prev|head|next---
    private Node tail;  // ---prev|tail|next---
    private String first;
    private String last;
    private String mistake;
    private int size;


    public DobleList() {
        size = 0;
        mistake = "Error not found Node";
        last = "adding new Node in the last: ";
        first = "adding new Node in the first: ";
    }

    public static void main(String[] args) {
        DobleList<String> dl = new DobleList<String>();
        dl.firstInsert("hello");
        dl.firstInsert("how");
        dl.lastInsert("are");
        dl.lastInsert("you");
        dl.lastInsert("?");

        dl.firstRemove();
        dl.lastRemove();
        dl.lastRemove();
        dl.lastRemove();
        dl.sizeList();

        dl.iB();
        dl.iF();
    }

    private void sizeList() {
        System.out.print("\nsize - " + size+"\n");
    }

    private T lastRemove() {
        if(size == 0) throw new NoSuchElementException();

        Node<T> tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        System.out.println("delete - "+tmp.data);
        return tmp.data;
    }

    private T firstRemove() {
        if(size == 0) throw new NoSuchElementException();

        Node<T> tmp = head;
        head = head.next;
        head.prev = null;
        size--;
        System.out.println("delete - "+tmp.data);
        return tmp.data;
    }

    private void firstInsert(T data) {
        Node newNode = new Node(data, head, null);
        if (head != null) {
          head.prev = newNode;//!!!!!1
        }
        head = newNode;

        if(tail == null) {
            tail = newNode;
        }
        size++;
        System.out.println(first + newNode.data);
    }

    private void lastInsert(T data) {
        Node newNode = new Node(data, null, tail);
        if (tail != null) {
            tail.next = newNode;//!!!!!
        }
        tail = newNode;

        if(head == null) {
            head = newNode;
        }
        size++;
        System.out.println(last + newNode.data);
    }

    private void iF() {
        System.out.println("iterate frontward");
        Node<T> node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    private void iB() {
        System.out.println("iterate backward");
        Node<T> node = tail;
        while(node != null) {
            System.out.println(node.data);
            node = node.prev;
        }
    }


    /**
     * nodes
     * @param <T>
     */
    private class Node<T> {
        private T data;
        private Node next;
        private Node prev;

        public Node(T data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrev() {
            return prev;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }
    }

}
