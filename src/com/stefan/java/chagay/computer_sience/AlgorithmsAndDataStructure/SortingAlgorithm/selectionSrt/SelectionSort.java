package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.selectionSrt;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = new int[]{
                5, 14,42,8,15
        };

        for (int i : selectionSrt(array)) {
            System.out.println(i);
        }


    }

    public static int[] selectionSrt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }

            }
                    if (min != i) {
                        int temp = arr[i];
                        arr[i] = arr[min];
                        arr[min] = temp;
                    }
        }

        return arr;
    }

}
