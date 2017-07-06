package com.stefan.java.chagay.Static;

/**
 * Created by Stefan on 29.06.2017.
 */
public class OraclTestStatic {

    public int a;

    public static int b;

    public void showA(){
        System.out.println(a);
    }

    public void showB(){
        System.out.println(b);
    }

    /**
     * разица между присваиванием heap and stack
     */
    public void f (int a){

 // stack = stack
        a = a;      //само себе

 //       heap = stack
        this.a = a; //полю этого класса
    }
}
