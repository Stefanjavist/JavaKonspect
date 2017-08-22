package com.stefan.java.chagay.JavaLessons101.Model8lesson1;


public class HumanUsage {

    public static void main(String[] args) {
        final Human max = new Human();
//        max.relations = Human.Relations.ACTIVE_SEARCH;
        max.relations = new Human.Relations("faster relation");
        max.length = new Human.Relations.Length(34);
    }

}
