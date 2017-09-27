package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.insertSrt;

public class InsertSrt {

    private static int[] insertSrt(int[] list) {
        int i, j, key, temp;
        for (i = 1; i < list.length; i++) {
            key = list[i];
            j = i - 1;

            while (j >= 0 && key < list[j]) {
                //swap
                temp = list[j];
                list[j] = key;//key = list[j + 1]
                list[j+1] = temp;//next element is key, but key equals list[j + 1]

                j--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] array = new int[]{
                5,3,2,1
        };

        for (int i : ijd(array)) {
            System.out.println(i);
        }
    }

    private static int [] ijd(int [] arr) {

        int key,tmp,i;
        for (i = 1; i < arr.length; i++) {
            key = i -1 ;

            while(key >= 0 && arr[key] > arr[key + 1]) {
                tmp = arr[key + 1];
                arr[key+1] = arr[key];
                arr[key] = tmp;
                key--;
            }
        }
        return arr;
    }

}
