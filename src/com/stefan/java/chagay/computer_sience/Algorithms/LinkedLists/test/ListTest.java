package com.stefan.java.chagay.computer_sience.Algorithms.LinkedLists.test;


import java.lang.reflect.Array;

public class ListTest {

    public static void main(String[] args) {
         final int cell1 = 12;
         final int cell2 = 46;
         final int cell3 = 28;
         final int cell4 = 42;

        ListTest listTest = new ListTest();
        for (int i : new int[]{cell1, cell2, cell4, cell3}) {
            System.out.println(listTest.insert(i));

        }

    }

    //в нём и будут добавляться, defined и удаляться cell
    /*
   1) class that represents a list and insert operation
    */
    private MyCell first;//first element list

    private ListTest() {
        this.first = null;//and he tells
    }

    private MyCell insert(int data) {
        MyCell myCell = new MyCell();
        myCell.setNext(first);
        myCell.setData(data);
        first = myCell;
        return first;
    }

    //finds cells
    private MyCell find(int data) {
        return findLogic(first, data);
    }

    private MyCell findLogic(MyCell cell, int data) {
        if(cell == null) {
            return null;
        }
        if(cell.getData() == data) {
            return cell;
        }
        return findLogic(cell.getNext(), data);
    }


   //для удаления сначало нужно найти предка (Predecessor)
    public void delete(int i) {
        MyCell element = find(i);
        if(element != null) {
            MyCell predecessor = findPredecessor(i);

            if(predecessor != null) {
                predecessor.setNext(element.getNext());
            }else {
               first = element.getNext();
            }
        }
    }

    private MyCell findPredecessor(int i) {
        return findPredecessor(first, i);
    }

    private MyCell findPredecessor(MyCell cell, int i) {

        if(cell == null || cell.getNext() == null) {
            return null;
        }
        if(cell.getNext().getData() == i) {
            return cell;
        }
        return findPredecessor(cell, i);
    }


}
