package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.LinkedLists.create_list;

/**
 * this class keeps track of each element information
 * @author java2novice
 *
 */
public class NodeDoubl<E> {

    E element;
    NodeDoubl next;
    NodeDoubl prev;

    public NodeDoubl(E element, NodeDoubl next, NodeDoubl prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
