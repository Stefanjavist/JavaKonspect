package com.stefan.java.chagay.PassByValue;

public class Satic {
    private static String srt = "Value1";

    private static void change(String s){
        s = "Value2";
    }

    public static void main(String[] args) {
        change(srt);
        System.out.println(srt);
    }
}
