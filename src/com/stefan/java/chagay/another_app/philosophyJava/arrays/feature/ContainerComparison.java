package com.stefan.java.chagay.another_app.philosophyJava.arrays.feature;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainerComparison {

    /**
     * в следующем примере сравниваются массивы и параметризованные контейнеры
     * @param args
     */
    public static void main(String[] args) {
        BerylliumSphere[] spheres = new BerylliumSphere[10];
        for (int i = 0; i < 5; i++) {
            spheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(spheres));
        System.out.println(spheres[4]);
//------------------------------------------
        List<BerylliumSphere> sphereList = new ArrayList<BerylliumSphere>();
        for (int i = 0; i < 5; i++) {
            sphereList.add(new BerylliumSphere());
        }
        System.out.println(sphereList);
        System.out.println(sphereList.get(4));

        //--------------------------
        int[] i = {0, 1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(i));
        System.out.println(i[4]);


        List<Integer> listInt = new ArrayList<Integer>(
        Arrays.asList(0, 1, 2, 3, 4, 5));

        listInt.add(97);
        System.out.println(listInt);
        System.out.println(listInt.get(4));
    }

}
