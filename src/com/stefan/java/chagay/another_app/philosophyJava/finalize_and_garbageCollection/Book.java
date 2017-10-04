package com.stefan.java.chagay.another_app.philosophyJava.finalize_and_garbageCollection;


public class Book {

    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize()  {
//        super.finalize();
        if(checkedOut)
            System.out.println("Mistake. checkedOut");
    }
}
