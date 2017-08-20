package com.stefan.java.chagay.JavaLessons101.Model7Lesson3;


import java.util.Arrays;

public class DynamicShoppingCart implements IDynamicShoppingCart{

    Item [] items = new Item[1];

    int size = 0;
    @Override
    public int size() {
        return size;
    }

    @Override
    public Item getItem(int index) {
        return items[index];
    }

    @Override
    public void addItem(Item item) {
        if(size == items.length){
            items = Arrays.copyOf(items, items.length + 1);
        }
        items[size] = item;
        size++;

    }

    @Override
    public void deleteItem(int index) {

    }
}
