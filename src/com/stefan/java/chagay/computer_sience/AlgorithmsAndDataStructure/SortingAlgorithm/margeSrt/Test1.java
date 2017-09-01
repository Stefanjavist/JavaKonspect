package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.margeSrt;


public class Test1 {

    private int [] numbers;
    private int [] helper;
    private int num;

    public Test1(int[] arr) {
        this.numbers = arr;
        this.num = arr.length;
        this.helper = new int[num];
        margeSort(0, num - 1);
    }

    private void margeSort(int low, int high) {
        if(low < high) {
            int middle = low + (high - low) / 2;//2
            margeSort(low, middle);
            margeSort(middle+ 1, high);
            marge(low, middle, high);
        }
    }

    private int [] marge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int low1 = low;
        int low2 = low;
        int middle1 = middle + 1;

        while(low1 <= middle && middle1 <= high) {
            if(helper[low1] >= helper[middle1]) {
                numbers[low2] = helper[middle1];
                middle1++;
            }  else{
                numbers[low2] = helper[low1];
                low1++;
            }
            low2++;
        }
//этот цикл до заполняет массив, а точнее последнюю ячейку
        while(low1 <= middle) {
            numbers[low2] = helper[low1];
            low1++;
            low2++;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {
                21,33,23,4
        };

        Test1 test1 = new Test1(arr);

    }
}
