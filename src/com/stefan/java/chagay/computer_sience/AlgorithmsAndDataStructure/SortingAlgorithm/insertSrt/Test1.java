package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.SortingAlgorithm.insertSrt;


public class Test1 {

    public static void main(String[] args) {
        int[] arr = new int[] {
                12,244,552,123,53,3
        };

        for (int i : insertSort(arr)) {
            System.out.println(i);
        }
    }

    private static int[] insertSort(int[] arr) {
       int i, j, key, temp;
        for ( i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                temp = arr[j];
                arr[j] = key;//тут должна быть key, а не arr[i] т. к. мы сохранили в key число которое подставляем на позицию arr[j], а если поставим arr[i], то мы подставим число из пазиции arr[i], каторое будет уже перезаписано
                //кароче нам нужно число, а не позиция
                arr[j + 1] = temp;
                j--;
            }
        }
        return arr;
    }
}
