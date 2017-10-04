package com.stefan.java.chagay.computer_sience.examples.algo4;


public class DoublyConnList <Item>{

    private class Node {
        Item item;
        Node next;
        Node prev;

        public Node(Item item, Node next, Node prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }


    }

    private Node head;// ---prev|head|next---
    private Node tail;// ---prev|tail|next---
    private int size;

    //it's when add first node
    //
    // |head|-|node|-|tail|

    //it's when add second node
    //|head|prev---|SecondNode|-|node|-|tail|

    public void addFirst(Item item) {
        Node node = new Node(item, head, null);
        if(head != null) {
            head.next = node;
        }else head = node;

        if(tail == null) {
            tail = node;
        }
        size++;
    }


    public void addLast(Item item) {
        Node node = new Node(item, null, tail);
        if(tail != null) {
            tail.prev = node;
        }
        tail = node;

        if(head == null) {
            head = node;
        }
        size++;
    }

    public void firstRemove() throws NullPointerException {
        if(size == 0) throw new NullPointerException();

        head = head.next;
        head.prev = null;
        size--;
    }

    public void lastRemove() throws NullPointerException {
        if (size == 0) throw new NullPointerException();

        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public int sizeList() {
        return size;
    }

    private void iF() {
        System.out.println("\niterate frontward\n");
        Node currentHead = head;//дублированная ссылка для того чтобы не изменять глобальную ссылку
        while (currentHead != null) {
            System.out.println(currentHead.item);
            currentHead = head.next;
        }
    }

    private void iB() {
        System.out.println("\niterate backward\n");
        Node currentTail = tail;
        while(currentTail != null) {
            System.out.println(currentTail.item);
            currentTail = tail.prev;
        }
    }


    public static void main(String[] args) {

    DoublyConnList<String> dol = new DoublyConnList<>();
        dol.addFirst("hello");
        dol.addFirst("how");
        dol.addLast("are");
        dol.addLast("you");
        dol.addLast("?");

        dol.firstRemove();
        dol.sizeList();
        dol.iF();
        dol.iB();
    }
}
