package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.margeSrt;


public class Test1 {

    int [] numbers;
    int [] helper;

    int number;

    public Test1(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        margeSort(0, number - 1);
     }

    /**
     * very difficult code
     * @param low
     * @param high
     */
     private void margeSort(int low, int high) {
            if(low < high) {
                int middle = low + (high - low) / 2;
                margeSort(low, middle);
                margeSort(middle + 1, high);
                marge(low, middle, high);
            }
     }

    /**
     * very easy code))
     * @param low
     * @param middle
     * @param high
     * @return
     */
     private int[] marge(int low, int middle, int high) {
         for (int i = low; i < high; i++) {
             numbers[i] = helper[i];
         }

         int low1 = low;
         int low2 = low;
         int middle1 = middle + 1;

         while(low1 <= middle && middle1 <= high) {
             if(helper[low1] > helper[middle1]) {
                 numbers[low2] = helper[middle1];
                 middle1++;
             } else {
                 numbers[low2] = helper[low1];
                 low1++;
             }
             low2++;
         }

         while (low1 <= middle) {
             numbers[low2] = helper[low1];
             low1++;
             low2++;
         }
         return numbers;
     }
}
