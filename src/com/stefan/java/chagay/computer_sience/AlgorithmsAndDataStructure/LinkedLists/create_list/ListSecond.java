package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.LinkedLists.create_list;


import com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.LinkedLists.data.MyCell;

public class ListSecond {


    public static void main(String[] args) {
        ListSecond ls = new ListSecond();


        /**
         * выставление чисел
         */
        int data1 = 12;
        int data2 = 4;
        int data3 = 82;
        int data4 = 44;

        /**
         *заполнение и вывод cells
         */

        MyCell[] cells = new MyCell[]{
                ls.insert(data4),//459
                ls.insert(data3),//460
                ls.insert(data2),//461
                ls.insert(data1),//461
        };


        for (MyCell i : cells) {
            System.out.println(findNumberCell(i));
        }

        System.out.println("\n Research cells across data");


        System.out.println(ls.findCell(12)+ " - " + data1);
        System.out.println(ls.findCell(4)+ " - " + data2);
        System.out.println(ls.findCell(44)+ " - " + data4);

        System.out.println();

        //-------------------------------
//        ls.deletePosition(0);
//        System.out.println("\nПосле\n" + ls.findCell(12));
//        System.out.println(ls.findCell(4));
//        System.out.println(ls.findCell(82));
//        System.out.println(ls.findCell(44));

        //-------------------------------
//        ls.addDoubleConnected(23);
//        System.out.println("\n\n" + ls.findCell(23));

        //-------------------------------
//        ArrayList s = new ArrayList();
//        s.add(12);
//        s.add(5);
//        s.add(50);
//        s.add(1);
//        s.remove(1);
//        System.out.println(s.size());

        //-------------------------------
//        ls.reverse();
//        System.out.println(ls.findElementAt(5));

        //-------------------------------
//        ls.insertSorted(83);
//        System.out.println();

    }

    private static int mCount = 0;

    private static String findNumberCell(MyCell cells){
        if(cells != null) {
            while (mCount <= 100) {
                mCount++;
                /**
                 * костыли пошли
                 */
                while (mCount >= 100) {
                        mCount++;
                        return mCount + " : this cell - " + cells;
                    }
                return mCount + " : this cell - " + cells;
                }


        }
        return "not numbers!!";
    }

    private MyCell top;//!!!!!


    //Добавление в связанный список константная операция.
    // Оно заключается в простом добавлении нового элемента в начало списка и модификации указателя так,
    // чтобы первый указатель был направлен к новому элементу.
    public MyCell insert(int i) {
        MyCell myCell = new MyCell();
        myCell.setData(i);
        myCell.setNext(top);// newCell2 /указатель\ --->newCell1 /указатель\--->null
        return top = myCell;//сохраняем новую клетку первой как в стеке
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
        } else {
            return findPredecessorLogic(cell.getNext(), index);//здесь нельзя через while т. к. данные не будут обновляться!!!!
            //только итерация с обновлёнными данными!!!
        }
    }

    //findCell
    public MyCell findCell(int i) {
        return findLogic(top, i);
    }

    private MyCell findLogic(MyCell cell, int target) {
        while (cell != null) {//начальный равен null?
            if (cell.getData() == target) {// у начальнего есть значение которое нам нужно найти?
                return cell;
            } else {
                cell = cell.getNext();
            }
        }
        return null;
    }

    //delete include findCell(), findPredecessor()
    public void delete(int index) {
        MyCell element = findCell(index);
        if (element != null) {

            MyCell predecessor = findPredecessor(index);
            if (predecessor != null) {
                predecessor.setNext(element.getNext());//!!!!!
            } else {
                top = element.getNext();
            }
            element = null;
        }

    }

    //Добавление елемента на определенные позиции

    public void insertPosition(int position, int data) {
        if (position == 0) {//if start
            insert(data);//create new cell in start
            return;
        }
        MyCell predecessor = findElementAt(position - 1);
        if (predecessor != null) {//if finish cell stand still the predecessor
            MyCell newCell = new MyCell();
            newCell.setData(data);
            newCell.setNext(predecessor.getNext());//установка связи со следующей cell
            predecessor.setNext(newCell);//привязывает свою указатель к новому появившемуся cell
        }
    }

    public MyCell findElementAt(int i) {
        MyCell result = top;//взятие клетки в начале цепи
        while (result != null && i-- > 0) {//уменьшается счётчик и кол-во передвидений снижается
            result = result.getNext();//передвижение к след cell
        }
        return result;
    }

    public void deletePosition(int position) {
        MyCell next = findElementAt(position);
        if(next.getNext() != null && position == 0) {
            top = next.getNext();
            return;
        }

        MyCell element = findElementAt(position);
        MyCell pred = findElementAt(position - 1);
        if(pred != null) {
            pred.setNext(element.getNext());
        }
    }
//-------------------------------
    //another list, it's demo version
    //двухсвязный список
    //add cell after previous
    public void addDoubleConnected(int i) {

        insert(i);
        MyCell previous = findPredecessor(i);
        if(previous != null) {
        MyCell newCell = new MyCell();
        newCell.setData(i);

        newCell.setNext(previous.getNext());
        previous.setNext(newCell);

        newCell.setNext(previous);
        previous.getNext().setNext(newCell);
        }
    }


    //-------------------------------
    private void reverse() {
        MyCell prev = null;
        MyCell next = top;
        while (top != null) {
            next = top.getNext();
            top.setNext(prev);

            //logic
            prev = top;
            top = next;
        }
        top = prev;
    }

    //-------------------------------
    public void insertSorted(int data) {
        MyCell previous = top;
        if(previous == null || previous.getData() >= data){
            insert(data);//add simple
        } else{
            while (previous.getNext() != null && previous.getNext().getData() < data) {
                previous = previous.getNext();
            }
            MyCell cell = new MyCell();
            cell.setData(data);
            cell.setNext(previous.getNext());//привязка к след от previous
            previous.setNext(cell);//привязка prev. к new cell
        }
    }

}
