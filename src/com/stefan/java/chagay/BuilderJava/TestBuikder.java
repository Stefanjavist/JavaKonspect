package com.stefan.java.chagay.BuilderJava;

/**
 * Created by Stefan on 12.07.2017.
 */
public class TestBuikder {

    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("");
        a.append("hello how are you ");
        a.append("fine thanks ");
        a.append(false);
        a.append(" what is it ");
        a.indexOf("2sdf", 1);
        System.out.println(a);


        String string = "103";
        int f = Integer.parseInt(string);
        System.out.println(f);

        int in = 10;
        String first = in + "";
        String second = String.valueOf(first);
        String third = Integer.toString(in);
        System.out.println(third);

        String he = " hello";
        String no = "not tup ";
        String point = ", ";
        System.out.println(String.format(no, point, he));

        String format = "i need to %s English in %d ";
        System.out.println(String.format(format, "learn", 2018));

    }
}
