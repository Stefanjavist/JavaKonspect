package com.stefan.java.chagay.JavaLessons101;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TestWithInAndOutPut {


    public static void main(String[] args) {
        {
            // check if length of args array is
            // greater than 0
            if (args.length > 0) {
                System.out.println("The command line" +
                        " arguments are:");

                // iterating the args array and printing
                // the command line arguments
                for (String val : args)
                    System.out.println(val);
            } else
                System.out.println("No command line " +
                        "arguments found.");

            System.out.println("\n\n");
            Scanner sc = new Scanner(System.in);

                try {
                    int name = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Error it isn't number");



                }




        }
    }


}
