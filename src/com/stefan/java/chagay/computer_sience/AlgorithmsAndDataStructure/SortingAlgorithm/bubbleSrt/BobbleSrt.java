package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.bubbleSrt;


public class BobbleSrt {

    private static int[] bubbleSort(int[] list) {

        int i, j, temp;

        for (i = 0; i < list.length; i++) {
            for (j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] list = new int[]{4, 3, 9, 6, 7};
        for(int i : bubbleSort(list)){
            System.out.println(i);
        }
    }

}
