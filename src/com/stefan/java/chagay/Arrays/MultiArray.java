package com.stefan.java.chagay.Arrays;

import java.util.Arrays;

public class MultiArray {


    static class ArrayOfInteger {

        private static Integer [][] arrayOfInt = {{1,2},{3,4}};

        public static String ToString(){
            return Arrays.deepToString(arrayOfInt);
        }

    }
}
