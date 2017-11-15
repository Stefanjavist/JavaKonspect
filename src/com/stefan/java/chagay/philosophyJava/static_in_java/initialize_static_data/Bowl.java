package com.stefan.java.chagay.philosophyJava.static_in_java.initialize_static_data;

//данные статичиского поля всегда существуют в един
//экземпляре не зависимо от кол-ва созднных объектов

//след пример позвол понять как проходит инициализ статитечская память
public class Bowl {

    Bowl(int marker) {
        System.out.println("Bowl("+marker+")");
    }

    void f1(int marker) {
        System.out.println("f1("+marker+")");
    }
}
