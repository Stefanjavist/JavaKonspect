package com.stefan.java.chagay.StringInJava;

public class Model6Lesson3 {

    public String str = "For me";

    public static void main(String[] args) {
        Model6Lesson3 m = new Model6Lesson3();
        System.out.println(m.str + " " + m);

        //1concatenation
        System.out.println(1 + 2 + "4");//"34"
        System.out.println(3 + "4" + 2);//"342"
        System.out.println(8 + (1 + 7 + "9"));//"889"

        //2numbers to String by methods
        Integer.toString(12);
        //это тоже самое что и выше
        //также и с double, byte, long, short и т. д.
        //Integer i = new Integer(12)
        //i.toString

        //3String to number
        float a = Float.parseFloat("23");

        double d = 929.23;
        String s = Double.toString(d);

        int dot = s.indexOf('.');

        System.out.println(dot + " digits " +
                "before decimal point.");
        System.out.println(s.length() - dot - 1 +
                " digits after decimal point.\n\n");

        //4преобразование стринга в число
        System.out.println(methodConvert("23121"));
        System.out.println(methodConvertFloat("23121"));
        System.out.println(methodConvertInt("23121"));
    }

    public static int methodConvert(String str) {
        Integer i = Integer.parseInt(str);
        return i;

    }

    public static float methodConvertFloat(String str) {
        Float i = Float.valueOf(str);
        Float n = i.floatValue();
        return n;
    }

    public static int methodConvertInt(String str) {
        Integer i = Integer.valueOf(str);
        Integer b = i.intValue();
        return b;

    }


}
