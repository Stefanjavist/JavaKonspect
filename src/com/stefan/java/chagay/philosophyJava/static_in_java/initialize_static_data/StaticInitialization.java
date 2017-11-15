package com.stefan.java.chagay.philosophyJava.static_in_java.initialize_static_data;


public class StaticInitialization {

    public static void main(String[] args) {
        System.out.println("Create new Object Cupboard in main()");
        new Cupboard();
        System.out.println("Create new Object Cupboard in main()");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    /**
     * 2/сначала иниц initialization_in_java члены и только потом инициализируются не initialization_in_java объекты(в книжке страница 143)
     */
    static Table table= new Table();
    static Cupboard cupboard= new Cupboard();
}
