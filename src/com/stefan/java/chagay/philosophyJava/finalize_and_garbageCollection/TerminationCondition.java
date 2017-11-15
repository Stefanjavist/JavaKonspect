package com.stefan.java.chagay.philosophyJava.finalize_and_garbageCollection;


public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        //right clear
        novel.checkIn();
        //lose refer, forget clear it
        new Book(true);
        //compulsory garbage collection, finalize
        System.gc();
    }
}
