package com.stefan.java.chagay.another_app.Arrays;


public class Main {

    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        stringArray.traceMass();

        ArraySimple arrays = new ArraySimple();
        arrays.iArray();

        MultiArrayString mulArrStr = new MultiArrayString();
        mulArrStr.iMultiArrayString();

        /**
         * foreach
         * Он позволяет более просто записать проход по всем элементам массива.
         */
        int[] sample = {12, 32, 23, 4, 53, 11, 33,};

        //выводим элементы в цикле foreach
        for (int t : sample) {
            System.out.println(t);
        }/*
        Эту запись можно интепретировать следующим образом — цикл проходит по всем элементам массива,
        каждый раз помещая в переменную t значение следующего элемента массива.
        Т.е. при каждом проходе цикла в переменной t последовательно будет появляться значение sample[0], sample[1], sample[2] и т.д.
        */
//~~~~~~~~~~~~~~~~~~~
        /**
         * перменная t и переменная sample[0] — это РАЗНЫЕ переменные. Рассмотрим более сложный пример:
         */

        int[] sample1 = new int[5];

        System.out.println("До цикла foreach");
        for (int i : sample1) {

        }

        //Думаем, что происходит инициализация
        for (int i : sample1) {
            i = 99;
        }

        System.out.println("После foreach");
        for (int i : sample1) {
            System.out.println(i);
        }
//~~~~~~~~~~~~~~~~~~~~~~~~~~
        /**
         * Для инициализации придется использовать обычную конструкцию.
         */
        int[] sample2 = new int[5];

        System.out.println("До цикла foreach");
        for (int i : sample2) {

        }

        //Думаем, что происходит инициализация
        for (int i = 0; i < sample2.length; i++) {
            sample2[i] = 99;
        }

        System.out.println("После foreach");
        for (int i : sample2) {
            System.out.println(i);

        }
    }
}


