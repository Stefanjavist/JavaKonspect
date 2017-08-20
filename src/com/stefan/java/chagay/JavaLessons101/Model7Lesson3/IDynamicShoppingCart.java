package com.stefan.java.chagay.JavaLessons101.Model7Lesson3;


public interface IDynamicShoppingCart {

    int size();
    Item getItem(int index);
    void addItem(Item item);
    void deleteItem(int index);
}
