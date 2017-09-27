package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.margeSrt;

public class MargeSort {

    private int[] numbers;
    private int[] helper;

    private int count;

    public MargeSort(int[] values) {
        this.numbers = values;
        count = values.length;
        this.helper = new int[count];
        mergesort(0, count - 1);
    }

    private void mergesort(int low, int high) {
// check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;//на перевой итерации было 0
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);//middle после выполнения marge становится больше на 1
        }
    }

    private int[] merge(int low, int middle, int high) {
        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int low1 = low;
        int middle1 = middle + 1;
        int low2 = low;
        // Copy the smallest values from either the left or the right side back

        // to the original array
        while (low1 <= middle && middle1 <= high) {
            if(helper[low1] <= helper[middle1]) {
            numbers[low2] = helper[low1];
            low1++;
            } else {
                numbers[low2] = helper[middle1];
                middle1++;//grow middle
            }
            low2++;//current cell header array
        }
        // Copy the rest of the left side of the array into the target array
        while (low1 <= middle) {
            numbers[low2] = helper[low1];
            low2++;
            low1++;
        }

        return numbers;
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.
    }


    public static void main(String[] args) {
        int [] arr = new int[]{
                21,33,23,4
        };

        }




}


