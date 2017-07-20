package com.stefan.java.chagay.Algorithms.ConectedList;


public class LocomotionAtList {

    public int value = 1;
    public LocomotionAtList next;

    public void print (){
        System.out.println(value);
    }

    public static void main(String[] args) {

    }

    public static void iterate(LocomotionAtList top) {
        while (top != null){
            top.print();
            top = top.next;
        }
    }
}
