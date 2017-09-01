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
                5,3,7,1
        };

        for (int i : ijd(array)) {
            System.out.println(i);
        }
    }

    private static int [] ijd(int [] arr){
        int i, j, key, tmp = 0;
        for (i = 1; i < arr.length ; i++) {
            key = arr[i];
            j = i - 1;
            //
//здесьучитывается сохраняемая переменная key, а не i!!!!!
            while(j >= 0 && key < arr[j]) {
                tmp = arr[j];
                arr[j] = key;
                arr[j + 1] = tmp;
                j--;
            }

        }
        return arr;

    }


}
