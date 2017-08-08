package com.stefan.java.chagay.another_app.ClassObject;


public class GetClass {

    public static void main(String[] args) {

        String s ="abc";

        Class cl = s.getClass();
        System.out.println(cl.getName());

        Point p1 = new Point(1,2);
        Point p2 = new Point(1,2);
        System.out.println(p1.equals(p2));
    }

    public static class Point{
        int a;
        int b;
        Point(int a, int b){
            this.a = a;
            this.b = b;

        }
    }
}

