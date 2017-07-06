package com.stefan.java.chagay.Static;


public class Static {

       static int s = 7;


    public static int methodStatic(int a, int b) {
        return s+a+b;
    }

    public static void main(String[] args) {
        System.out.println(Static.methodStatic(1,1));

        Simple simple11 = new Simple();
        System.out.println(simple11.sipmleMethod(12, 0));
    }

    public static class Simple {

        int simpleValue = 12;

        public int sipmleMethod(int a, int b) {
            return a - 12 + b;
        }
    }

}