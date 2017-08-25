package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.selectionSrt;


public class Test3 {

    public static void main(String[] args) {
        int[] arr = new int[] {
                12,124,3,4,1
        };

        for (int i : selectSrt(arr)) {
            System.out.println(i);

        }
    }

    private static int[] selectSrt(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }

        }
        return arr;
    }
}
