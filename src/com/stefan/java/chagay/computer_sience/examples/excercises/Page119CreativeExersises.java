package com.stefan.java.chagay.computer_sience.examples.excercises;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

public class Page119CreativeExersises {

    public static void main(String[] args) {
//        for (int i:test1_2_15("D:\\test.txt") ){
//            System.out.println(i);
        for (int i:test1_2_15("D:\\test.txt")) {
            System.out.println(i);
        }
//        }
    }

    //i don't understand it
    public static int[] test1_2_15(String name) {
        In a = new In(name);
        String input = a.readAll();
        String[] words = input.split("\\s+");
        int [] ints = new int [words.length];
        for (int i = 0; i < words.length; i++) {
            ints[i] = Integer.parseInt(words[i]);
        }
        return ints;
    }

}
