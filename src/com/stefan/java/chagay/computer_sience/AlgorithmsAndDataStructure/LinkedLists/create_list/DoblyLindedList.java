package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.LinkedLists.create_list;


import java.util.NoSuchElementException;

public class DoblyLindedList <E>{

    private NodeDoubl head;
    private NodeDoubl tail;
    private int size;

    public DoblyLindedList() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size ==0;
    }

    public void addFirst(E element) {
        NodeDoubl<E> tmp = new NodeDoubl(element, head, null);
                if(head != null) {
                    head.prev = tmp;
                }//здесь всё дело в ссылках, а точнее использование и запись в них
                head = tmp;
                if(tail == null) {
                    tail = tmp;
                }
                    size++;
                    System.out.println("adding: " + element);

    }

    public void addLast(E element) {
        NodeDoubl tmp = new NodeDoubl(element, null, tail);
        if(tail != null) {
            tail.next = tmp;
        }tail =tmp;

        if(head == null) {head = tmp;}
        size++;
        System.out.println("adding: " + element);
    }

    // this method walks forward through the linked list
    public void  iterateForward() {
        System.out.println("iterating forward..");
        NodeDoubl tmp = head;
        while (tmp != null) {
            System.out.println(tmp.element); //!!!
            tmp = tmp.next;
        }
    }

//     this method walks backward through the linked list
    public void iterateBackward() {
        System.out.println("iterating backward..");
        NodeDoubl tmp = tail;
        while (tmp != null) {
            System.out.println(tmp.element);
            tmp = tmp.prev;
        }
    }

    public E removeFirst() {
        if (size == 0) throw new NoSuchElementException();

            NodeDoubl<E> tmp = head;
            head = head.next;
            head.prev = null;
            size--;

            System.out.println("deleted " + tmp.element);
            return tmp.element;
    }

    public E removeLast() {
        if(size == 0)throw new NoSuchElementException();

        NodeDoubl<E> tmp = tail;
        tail = tail.prev;
        tail.next = null;
        size--;

        System.out.println("delete: " + tmp.element);
        return tmp.element;
    }

        public static void main (String[] args) {
        DoblyLindedList<Integer> dll = new DoblyLindedList();
        dll.addFirst(22);
        dll.addFirst(30);
        dll.addLast(64);
        dll.addLast(11);
        dll.iterateForward();
        dll.removeFirst();
        dll.removeLast();
        dll.iterateBackward();



    }
}
