package com.stefan.java.chagay.PassByValue;

/**
 * Created by Stefan on 09.07.2017.
 */
class New {
    public static void change(int n) {
        n = 5;
    }

    public static void main(String[] args) {
        int n = 0;
        change(n);
        System.out.print(n);
    }
}
