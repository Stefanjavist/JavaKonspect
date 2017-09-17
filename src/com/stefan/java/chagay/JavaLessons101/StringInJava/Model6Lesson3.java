package com.stefan.java.chagay.JavaLessons101.StringInJava;

public class Model6Lesson3 {

    private String str = "For me";

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Model6Lesson3 m = new Model6Lesson3();
        System.out.println(m.str + " " + m.toString());

        //1concatenation
        System.out.println(1 + 2 + "4");//"34"
        System.out.println(3 + "4" + 2);//"342"
        System.out.println(8 + (1 + 7 + "9"));//"889"

        //2numbers to String by methods
        System.out.println(Integer.toString(12)+"sds");
        //это тоже самое что и выше
        //также и с double, byte, long, short и т. д.
        //Integer i = new Integer(12)
        //i.toString

        //3 String to number
        float a = Float.parseFloat("23");

        double d = 929.23;
        String s = Double.toString(d);

        int dot = s.indexOf('.');

        System.out.println(dot + " digits " +
                "before decimal point.");
        System.out.println(s.length() - dot - 1 +
                " digits after decimal point.\n\n");

        //3 String to number another realisation
        System.out.println(methodConvertFloat("23121"));
        System.out.println(methodConvertInt("23121"));



        //1
        print1();

        //2
        print2();

        //3
        print3();

        //3another
        print3An();
    }

    private static float methodConvertFloat(String str) {
        Float i = Float.valueOf(str);
        Float n = i.floatValue();
        return n;
    }

    private static int methodConvertInt(String str) {
        Integer i = Integer.valueOf(str);
        Integer b = i.intValue();
        return b;
    }

        //1
    private static void print1() {
        System.out.println(1+4+"4"+12+2);//54122
        System.out.println(1+"23"+3+(1+"2"+8+0));//12331280
        System.out.println(3+"3"+5+3+"2"+2+7+8+9+"2\n\n"+6);//33532278926
    }

        //2
        private static void print2() {
            System.out.println(Integer.toString(13)+5);
        //or
        Integer a = new Integer(13);
            System.out.println(a.toString()+"\n\n");
        }

        //3
        private static void print3() {
        //String to number
            int i = Integer.parseInt("100",2);
            System.out.println(i+"\n");

            short f = Short.parseShort("111"+11);
            System.out.println(f);
        }

        //3 another realisation
        private static void print3An() {
        //String to number
            Integer a = Integer.valueOf("123");
            System.out.println(a+12);
        }
}
