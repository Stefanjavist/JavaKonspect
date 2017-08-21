package com.stefan.java.chagay.JavaLessons101.generics.model0lesson1;


public class Main {

    public static void main(String[] args) {
        Tuple<String> st2 = new Tuple<String>("l", "r");//here можно new Tuple <don't write>
        System.out.println(st2.getLeft());

        Tuple<Integer> st3 = new Tuple<>(221, 343);
        System.out.println(st3.getRight() + 12);

        Tuple <SuperClass> tuple = new Tuple<>(new SuperClass(), new SuperClass());
        System.out.println(tuple.getLeft());

    }

    private static  class SuperClass {
        @Override
        public String toString() {
            return "super";
        }
    }
}
