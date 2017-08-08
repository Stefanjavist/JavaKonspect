package com.stefan.java.chagay.JavaLessons101.Model7Lesson2;


public abstract class AbstractSmileProcessor implements ITest {

    public void process() {
        final String text = this.readString();
        final String result = text.replace(":)", "^^)");
        System.out.println(result);
    }
    protected abstract String readString();

//    public static void main(String[] args) {
////        final AbstractSmileProcessor sm = new AbstractSmileProcessor();
//           так нельзя т. к. неоткуда брать реализацию
//    }

}
