package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.base;


public class ReversString {

    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = str.toCharArray();

        int len = chars.length;
        int i,j;
        char tmp;

        for (i = 0, j = len-1; i < j; i++, j--) {
            tmp = chars[i];
            chars[i] = chars[j];
            chars[j] = tmp;
        }

        System.out.println(revers(chars));

    }

//     //Конвертируем String в char и char в String на java
//    public initialization_in_java void main(String[] args) {
//        //Преобразуем строку в массив char'ов
//        String string = "12345";
//        char[] chArray = string.toCharArray();
//        System.out.println("Строку в массив символов: " + Arrays.toString(chArray));
//        //String в char
//        char c= string.charAt(1);
//        System.out.println("String в char: " + c);
//
//        //char в String
//        String s = Character.toString(c);
//        System.out.println("char в String: " + s);
//
//        //удаляем символ 1 со строки
//        System.out.println("удаляем все символы '1' со строки: " + removeSpecificCharsFromString("1A1B1C1D121D1", '1'));
//    }
//
//    private initialization_in_java String removeSpecificCharsFromString(String str, char c) {
//        // находим в строке str все символы c и заменяем на строковую заглушку ""
//        return str.replaceAll(Character.toString(c), "");
//    }



    private static char[] revers(char[] str) {

        int i,j;
        int len = str.length;
        char tmp;

        for (i = 0, j = len -1 ; i>j ; i++, j--) {//enough change i<j and we'll change our string
            tmp = str[i];
            str[i] = str[j];
            str[j] = tmp;
        }
        return str;
    }






































}
