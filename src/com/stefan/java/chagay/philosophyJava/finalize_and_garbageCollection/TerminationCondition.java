package com.stefan.java.chagay.philosophyJava.finalize_and_garbageCollection;


public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        //right clear
        novel.checkIn();
        //теряем ссылку, забыли про очистку
        new Book(true);
        //принуд сборка мусора и finalize
        System.gc();
    }
}
