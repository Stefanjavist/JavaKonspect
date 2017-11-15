package com.stefan.java.chagay.philosophyJava.static_in_java.order_initialization;

public class Window {

    Window(int mar) {
        System.out.println("Window("+mar+")");
    }

    private static class House {
        Window w1 = new Window(1);
        House(){
            //выполнение конструктора
            System.out.println("House()");
            w3 = new Window(33); //повторная инициализ
        }

        Window w2 = new Window(2);
        void f(){
            System.out.println("f()");
        }
        Window w3 = new Window(3);//в конце
    }

    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
