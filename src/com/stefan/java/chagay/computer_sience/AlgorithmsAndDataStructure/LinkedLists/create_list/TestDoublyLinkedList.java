package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.LinkedLists.create_list;

public class TestDoublyLinkedList <T> {

    private static class Node<T> {

        T element;
        Node next;
        Node prev;

        public Node(T element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T element ) {
        Node tmp = new Node(element, head, null);
        if(head != null) {
            head.prev = tmp;
        } head = tmp;

        if(tail == null) {
            tail = tmp;
        } size++;
        System.out.println("adding first element  - " + element);

    }

    public void addLast(T element) {
        Node tmp = new Node(element, null, tail);
        if(tail != null) {
            tail.next = tmp;
        } tail = tmp;

        if(head == null) {
            head = tmp;
        } size++;
        System.out.println("adding last element - " + element);
    }

    public void iterateForward() {
        System.out.println("iterateForward");
        Node tmp = head;
        while(tmp != null) {
            System.out.println(tmp.element);
            tmp = tmp.next;
        }
    }

    public void iterateBackward() {
        System.out.println("iterateBackward");
        Node tmp = tail;
        while (tmp != null) {
            System.out.println(tmp.element);
            tmp = tmp.prev;
        }
    }
//todo removelast and removefirst



}
