package com.stefan.java.chagay.computer_sience.Algorithms.LinkedLists.create_list;


import java.util.ArrayList;

public class ListSecond {

    public static void main(String[] args) {
        ListSecond ls = new ListSecond();

        MyCell cell1 = new MyCell("First cell");
        MyCell cell2 = new MyCell("Second cell");
        MyCell cell3 = new MyCell("Third cell");

        /**
         * выставление чисел
         */
        cell1.setData(12);
        cell2.setData(4);
        cell3.setData(82);

        /**
        *заполнение cells
         */
        ls.insert(cell1.getData());
        ls.insert(cell2.getData());
        ls.insert(cell3.getData());

        System.out.println("выставление чисел \nзаполнение cells...\n\ndelete and check first node\n");

        ls.delete(cell1.getData());

        System.out.println(ls.findCell(12)+ " - " + cell1.getName());
        System.out.println(ls.findCell(4)+ " - " + cell2.getName());
        System.out.println(ls.findCell(82)+ " - " + cell3.getName());

        ls.insertPosition(2, 121);
        System.out.println(ls.findCell(121) + " - " + ls.findCell(121).getName());
        System.out.println(ls.findCell(121).getData());


        ls.deletePosition(1);
        System.out.println(ls.findCell(5));
    }

    MyCell top;

//    he's gorgeous))) he's creating obj by input values

    //Добавление в связанный список константная операция.
    // Оно заключается в простом добавлении нового элемента в начало списка и модификации указателя так,
    // чтобы первый указатель был направлен к новому элементу.
    public void insert(int i) {
        MyCell myCell = new MyCell("");
        myCell.setData(i);
        myCell.setNext(top);// newCell2 /указатель\ --->newCell1 /указатель\--->null
        top = myCell;//сохраняем новую клетку первой как в стеке
        //в итоге получим  newCell2 --->newCell1 --->null
        //так как в top сохранилась newCell1
    }


    public MyCell findPredecessor(int i) {
        return findPredecessorLogic(top, i);
    }

    private MyCell findPredecessorLogic(MyCell cell, int index) {
            if (cell == null || cell.getNext() == null) {
                return null;
            }
            if (cell.getNext().getData() == index) {
                return cell;
            }else {
                return findPredecessorLogic(cell.getNext(), index);//здесь нельзя через while т. к. данные не будут обновляться!!!!
                                                                    //только итерация с обновлёнными данными!!!
            }
    }

    //findCell
    public MyCell findCell(int i) {
        return findLogic(top, i);
    }

    private MyCell findLogic(MyCell top, int target) {
        while (top != null) {//начальный равен null?
            if (top.getData() == target) {// у начальнего есть значение которое нам нужно найти?
                return top;
            }else {
                top = top.getNext();
            }
        }
            return null;
    }

    //delete include findCell(), findPredecessor()
    public void delete(int index) {
        MyCell element = findCell(index);
        if(element != null) {

            MyCell predecessor = findPredecessor(index);
            if(predecessor != null){
                predecessor.setNext(element.getNext());//!!!!!
            }else{
                top = element.getNext();
            }
            element = null;
        }

    }

    //Добавление елемента на определенные позиции

    public void insertPosition(int position, int data) {
        if(position == 0) {//if start
            insert(data);//create new cell in start
            return;
        }
        MyCell predecessor = findElementAt(position - 1);
        if(predecessor != null) {//if finish cell stand still the predecessor
            MyCell newCell = new MyCell("new cell from insert");
            newCell.setData(data);
            newCell.setNext(predecessor.getNext());//установка связи со следующей cell
            predecessor.setNext(newCell);//привязывает свою указатель к новому появившемуся cell
        }
    }

    public MyCell findElementAt(int i) {
        MyCell result = top;//взятие клетки в начале цепи
        while(result != null && i-- > 0) {//уменьшается счётчик и кол-во передвидений снижается
            result = result.getNext();//передвижение к след cell
        }
        return result;
    }

    public void deletePosition (int position) {

        if(position == 0){
            top = null;
        }

        MyCell predecessor = findElementAt(position - 1);
        MyCell next2Cell = predecessor.getNext();


        if (predecessor == null) {
            predecessor.setNext(next2Cell);
        }
    }


}
