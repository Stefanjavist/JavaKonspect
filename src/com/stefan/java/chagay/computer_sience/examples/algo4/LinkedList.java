package com.stefan.java.chagay.computer_sience.examples.algo4;

public class LinkedList<Item> {

    private static class Node<Item> {
        Item item;
        Node next;

        public Item getItem() {
            return item;
        }

        public void setItem(Item item) {
            this.item = item;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    Node first = null;

    public void addNode(Item item) {
        Node oldNode = new Node();
        oldNode.item = item;
        first.next = oldNode;
    }

    public void deleteFromStart() {
        if(first.next != null){
            first = first.next;
            first = null;
        }
    }

    public void addInFinish(Item item) {
        Node lastOld = findLast(first);
        Node<Item> last = new Node<>();
        last.item = item;
        lastOld.next = last;
    }

    private Node findLast (Node node) {
        if(node != null) {
            return node;
        }
        findLast(node.next);
        return null;
    }

    public static void main(String[] args) {
        /**
         * create linked list
         */
        Node<String> first  = new Node<>();
        Node<String> second = new Node<>();
        Node<String> third = new Node<>();

        first.item = "to";
        second.item = "be";
        third.item = "or";

        first.next = second;
        second.next = third;

        //add in start
        Node<String> oldFirst = first;
        first = new Node<>();
        first.item = "not";
        first.next = oldFirst;
        first = second;
        first = null;

        //delete from end
        Node<String> oldLast = third;
        Node<String> last = new Node<>();
        last.item = "to";
        oldLast.next = last;


    }

}
