package com.stefan.java.chagay.computer_sience.Algorithms.LinkedLists.create_list;


public class MyCell {

    //этот клас является частью связанного linked list'а
    private int data;//он имеет значение
    private MyCell next;//и ссылку по которой его можно найти, удалить
    private String name;


    MyCell(String name) {
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public String getName() {
        return name;
    }

    public void setData(int data) {
        this.data = data;
    }

    public MyCell getNext() {
        return next;
    }

    public void setNext(MyCell next) {
        this.next = next;
    }
}
