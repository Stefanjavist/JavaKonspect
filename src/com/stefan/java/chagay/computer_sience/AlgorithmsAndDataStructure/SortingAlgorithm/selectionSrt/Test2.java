package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.selectionSrt;

/**
 * Created by Stefan on 8/23/2017.
 */
public class Test2 {

    public static void main(String[] args) {
        int [] arr = new int[] {12, 3,434,4,23
        };

        for (int i : selectionSort(arr)) {
            System.out.println(i);
        }
    }

    private static int [] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
          if(arr[j] < arr[i]) {

                  int temp = arr[j];
                  arr[j] = arr[i];
                  arr[i] = temp;
          }

            }
        }
        return arr;

    }
}
