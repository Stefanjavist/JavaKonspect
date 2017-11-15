package com.stefan.java.chagay.philosophyJava.arrays.array_how_object;


import com.stefan.java.chagay.philosophyJava.arrays.feature.BerylliumSphere;

import java.util.Arrays;

public class ArrayOptions {

    /**
     * этот пример показывает раздичные способы инициализации массивов и присваивание ссылок на массивы.
     * Он также наглядно демонстрирует, что массивы обектов и массивы приметивных типов практически идентичны.
     * Елинственные различия между ними в том, что массивы объектов содержут ссылки, а примитивные массивы содержут
     * примитивные значения
     *
     * @param args
     */
    public static void main(String[] args) {
        //массив объектов
        BerylliumSphere[] a;//локальная не инициализированная переменная
        BerylliumSphere[] b = new BerylliumSphere[5];//ссылки в массиве автоматом становятся null

        System.out.println("b ." + Arrays.toString(b));

        BerylliumSphere[] c = new BerylliumSphere[4];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == null) {
                c[i] = new BerylliumSphere();
            }
        }

        //Агрегатная инициализация
        BerylliumSphere[] d = {new BerylliumSphere(), new
                BerylliumSphere(), new BerylliumSphere(), new
                BerylliumSphere(), new BerylliumSphere()};

        //Динамическая агрегатная инициализация
        a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};

        System.out.println("a.length = " + a.length);
        System.out.println("b.length = " + b.length);
        System.out.println("c.length = " + c.length);
        System.out.println("d.length = " + d.length);

        a = d;
        System.out.println("a.length = " + a.length);


        //А теперь массивы примитивов
        int[] e;
        int[] f = new int[5];//автоматически инициализируются null
        System.out.println(f);

        int[] g = new int[4];
        for (int i = 0; i < g.length; i++) {
            g[i] = i * i;
        }

        int[] h = {44, 43, 32};

        //ошибка, переменная e не проинициализированна
        //System.out.println("e.length = " + e.length);
        System.out.println("f.length = " + f.length);
        System.out.println("g.length = " + g.length);
        System.out.println("h.length = " + h.length);

        //e = g;
        e = h;
        System.out.println("e.length = " + e.length);

        e = new int[]{1, 3};
        System.out.println("e.length = " + e.length);
    }

}
