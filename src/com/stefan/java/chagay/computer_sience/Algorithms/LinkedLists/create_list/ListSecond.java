package com.stefan.java.chagay.computer_sience.Algorithms.LinkedLists.create_list;


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
        ls.iterate(cell1.getData());
        ls.iterate(cell2.getData());
        ls.iterate(cell3.getData());

        System.out.println("выставление чисел \nзаполнение cells...\n\ndelete and check first node\n");

        ls.delete(cell1.getData());


        System.out.println(ls.findCell(12)+ " - " + cell1.getName());
        System.out.println(ls.findCell(4)+ " - " + cell2.getName());
        System.out.println(ls.findCell(82)+ " - " + cell3.getName());

    }

    MyCell top = null;

//    he's gorgeous))) he's creating obj by input values
    public void iterate(int i) {
        MyCell myCell = new MyCell("");
        myCell.setData(i);
        myCell.setNext(top);
        top = myCell;
    }

    public void print(int data) {
        if (data == 0) {
            System.out.println("0 - нет числа");
        } else {
            System.out.println(data);
        }
    }

    //findCell
    public MyCell findCell(int i) {
        return findLogic(top, i);
    }

    private MyCell findLogic(MyCell top, int target) {
        while (top != null) {
            if (top.getData() == target) {
                return top;
            }else {
                top = top.getNext();
            }
        }
            return null;
    }

    public MyCell findPredecessor(int i) {
        return findPredecessorLogic(top, i);
    }

    private MyCell findPredecessorLogic(MyCell top, int index) {
            if (top == null || top.getNext() == null) {
                return null;
            }
            if (top.getNext().getData() == index) {
                return top;
            }else {
                return findPredecessorLogic(top.getNext(), index);//здесь нельзя через while т. к. данные не будут обновляться!!!!
                                                                    //только итерация с обновлёнными данными!!!
            }
    }

    //delete include findCell(), findPredecessor()
    public void delete(int index) {
        MyCell element = findCell(index);
        if(element != null) {

            MyCell predecessor = findPredecessor(index);
            if(predecessor != null){
                predecessor.setNext(element.getNext());
            }else{
                top = element.getNext();
            }
            element = null;
        }

    }

}
