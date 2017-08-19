package com.stefan.java.chagay.computer_sience.Algorithms.SortingAlgorithm.bubbleSrt;

public class TestBubbleSrt {

    private static int[] bubbleSr (int[] list) {

        int i, j, temp = 0;

        for ( i = 0; i < list.length; i++) {
            for ( j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    temp = list[j];
                    list[j] =list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        //second version
//        boolean stoped = true;
//        while (stoped) {
//            for (i = 0; i < list.length - 1; i++) {
//                if(list[i] > list[i + 1]) {
//                    temp = list[i];//big
//                    list[i] = list[i + 1];//little
//                    list[i + 1] = temp;//
//                stoped = true;
//                }else stoped = false;
//            }
//        }

            return list;

    }

    public static void main(String[] args) {
        int[] list = new int[]{7, 4, 1, 2};
        for(int i : bubbleSr(list)){
        System.out.println(i);
        }
    }
}
