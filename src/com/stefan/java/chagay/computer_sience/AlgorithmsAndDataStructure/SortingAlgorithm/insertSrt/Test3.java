package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.insertSrt;


public class Test3 {

    public static void main(String[] args) {
        int[] arr = new int[] {
                323,23,3,443,3,4,32
        };

        for (int i : insertSort(arr)) {
            System.out.println(i);
        }
    }

    private static int[] insertSort(int[] arr) {
        int min, tmp, i, j;

        for (i = 1; i < arr.length; i++) {
            min = arr[i];
            j = i - 1;

            while(j >= 0 && min < arr[j]) {

                tmp = arr[j];
                arr[j] = min;
                arr[j+1] = tmp;
                j--;
            }
        }
        return arr;
    }

}
