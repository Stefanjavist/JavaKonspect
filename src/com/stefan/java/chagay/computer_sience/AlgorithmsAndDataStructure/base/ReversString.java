package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.base;


public class ReversString {

    public static void main(String[] args) {
        String string = "hello world";
        char[] a = string.toCharArray();

        int length = a.length;
        char tmp;
        int i, j;

        for (i = 0, j = length - 1; i < j; i++, j--) {
            tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

        String str = "hello";
        char[] b = str.toCharArray();
//        System.out.println(a);
        System.out.println(revers(b));
    }
    /*
     //Конвертируем String в char и char в String на java
    public static void main(String[] args) {
        //Преобразуем строку в массив char'ов
        String string = "12345";
        char[] chArray = string.toCharArray();
        System.out.println("Строку в массив символов: " + Arrays.toString(chArray));
        //String в char
        char char = string.charAt(1);
        System.out.println("String в char: " + c);

        //char в String
        String s = Character.toString(c);
        System.out.println("char в String: " + s);

        //удаляем символ 1 со строки
        System.out.println("удаляем все символы '1' со строки: " + removeSpecificCharsFromString("1A1B1C1D121D1", '1'));
    }

    private static String removeSpecificCharsFromString(String str, char c) {
        // находим в строке str все символы c и заменяем на строковую заглушку ""
        return str.replaceAll(Character.toString(c), "");
    }
     */


    private static char[] revers(char[] str) {

        int i, j;
        for (i = 0, j = str.length - 1; i < j; i++, j--) {
            char tmp = str[i];
            str[i] = str[j];
            str[j] = tmp;
        }
        return str;
    }

}
