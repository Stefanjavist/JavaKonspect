package com.stefan.java.chagay.JavaLessons101.StringInJava;


public class MonipulationWithString {

    public static void main(String[] args) {
        final String name = "  tepshen Muchachos ";
        name.trim();
        name.lastIndexOf('h',4);
        name.lastIndexOf('h');
        name.indexOf('M', 11);
        name.indexOf("phen");
        System.out.println(name.trim().toLowerCase().indexOf("s", 4));
        //charAt если мы указываем номер буквы нужно учитывать что
        //выводиться будет не та которую мы указали(учитывая ноль), а после неё стоящая!!!!
        System.out.println(name.charAt(2));


        /**
         Note: The String class is immutable, so that once it is created a String object cannot be changed.
         The String class has a number of methods, some of which will be discussed below, that appear to modify strings.
         Since strings are immutable, what these methods really do is create and return a new string that contains the result of the operation.
         */
        //create String
        char[] helloArray = {'h','e','l','l','o','.'};
        String string = new String(helloArray);
        System.out.println("\n//create String");
        System.out.println(string);


        /**
         * String Length
         */
        final String palindrome = "Stefan best programmer";
        int len = palindrome.length();
        char [] tempCharArray = new char[len];
        char [] charArray = new char[len];

        //put original string in an array if cgars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = palindrome.charAt(i);//вот здесть осторожно!!!
        }

        //reverse array of chars
        for (int j = 0; j < len; j++) {
            charArray[j] = tempCharArray[len - 1 - j];//here always len+1
        }

        String reversePalindrome = new String(charArray);
        String ni = new String(tempCharArray);
        System.out.println(ni + " - original");
        System.out.println(reversePalindrome+ " - reverse");
    }

}
