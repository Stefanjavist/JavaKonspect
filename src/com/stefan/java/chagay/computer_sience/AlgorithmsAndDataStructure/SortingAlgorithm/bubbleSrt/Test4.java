package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.bubbleSrt;


public class Test4 {

    public static int[] bubleSrt(int[] array) {

        int temp = 0;

        for (int k = 0; k < array.length; k++) {
            for (int x = 0;  x < array.length - 1;  x++) {
                if(array[x] > array[x + 1]) {
                    temp = array[x];
                    array[x] = array[x + 1];
                    array[x + 1] = temp;
                }
            }
        }


        return array;
    }


    public static void main(String[] args) {
        int[] array = new int[] {3, 4, 5, 23, 1, 7};

        for (int i : bubleSrt(array)) {
            System.out.println(i);
        }
    }

}
