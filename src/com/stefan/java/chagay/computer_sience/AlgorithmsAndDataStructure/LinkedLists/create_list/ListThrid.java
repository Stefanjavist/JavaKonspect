package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.LinkedLists.create_list;

/**
 * Created by Stefan on 8/22/2017.
 */
public class ListThrid {

    private Cell top;

    public ListThrid() {
        this.top = null;
    }

    public class Cell{
        private int data;
        private Cell next;

        public void setData(int data) {
            this.data = data;
        }

        public void setNext(Cell next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public Cell getNext() {
            return next;
        }
    }

    public void insert (int data) {
        Cell newCell = new Cell();
        newCell.setData(data);
        newCell.setNext(top);
        top = newCell;
    }

    public Cell find(int data) {
        return iterateFind(top, data);
    }

    private Cell iterateFind(Cell cell, int data) {
        if(cell == null) {
            return null;
        }

        if(cell.getData() == data) {
            return cell;
        }
        return iterateFind(cell.getNext(), data);
    }

    public String delete(int data) {
        Cell cell = find(data);
        if(cell == null) {
            return "Not find element";
        }

        Cell predecessor = predecessor(data);
        if(predecessor != null) {
            predecessor.setNext(cell.getNext());
        }
        return "Error";
    }

    public Cell predecessor(int data) {
        return findPredecessor(top, data);
    }

    private Cell findPredecessor(Cell top, int data) {
        if(top == null || top.getNext() == null) {
            return null;
        }

        if(top.getNext().getData() == data) {
            return top;
        }
        return findPredecessor(top.getNext(), data);
    }

    //-------------------position-methods-------------

    private Cell findPosition(int index) {
        if(index == 0) {
            return top;
        }

        Cell firstCell = top;
        while(firstCell != null && index-- > 0) {
            firstCell = firstCell.getNext();
        }
        return firstCell;
    }

    public void addPosition(int data, int index) {
        if(index == 0) {
            insert(data);
            return;
        }

        Cell predecessor = findPosition(index - 1);
        Cell newCell = new Cell();
            newCell.setData(data);
            newCell.setNext(predecessor.getNext());
            predecessor.setNext(newCell);
    }

    public void deletePosition(int index) {
        Cell cell = findPosition(index);
        if(cell.getNext() != null && index == 0) {
            top = cell.getNext();
            return;
        }

        Cell pred = predecessor(index - 1);
        if(pred!= null) {
            cell.setNext(pred.getNext());
        }
    }

    public void reverse() {
       Cell prev = null;
       Cell next = top;
       while(next != null) {
           next = top.getNext();
           top.setNext(prev);

           prev = top;
           top = next;
       }
       top = prev;
    }

    public static void main(String[] args) {
        ListThrid listThrid = new ListThrid();
        int dataCell1 = 12;
        int dataCell2 = 2;
        int dataCell3 = 1;
        int dataCell4 = 232;
        int dataCellPosition = 21;

        listThrid.insert(dataCell1);
        listThrid.insert(dataCell2);
        listThrid.insert(dataCell3);
        listThrid.insert(dataCell4);

        System.out.println(listThrid.find(dataCell1));
        System.out.println(listThrid.find(dataCell2));
        System.out.println(listThrid.find(dataCell3)+"\n");

        listThrid.reverse();

        System.out.println(listThrid.find(dataCell1));
        System.out.println(listThrid.find(dataCell2));
        System.out.println(listThrid.find(dataCell3));

//        System.out.println("\n\n delete|find");
//
//        listThrid.delete(dataCell1);
//        System.out.println(listThrid.find(dataCell1)+"\n");
//        listThrid.addPosition(dataCellPosition, 0);
//        System.out.println("\n" + listThrid.findPosition(0));
//        listThrid.deletePosition(0);
//        System.out.println("\n" + listThrid.findPosition(0)+"\n");

    }

//    public Cell find1(int data) {
//        return findLogic(top, data);
//    }
//
//    private Cell findLogic(Cell top, int data) {
//        if(top == null) {
//            return top;
//        }
//
//        if(top.getData() == data) {
//            return top;
//        }
//        return findLogic(top.getNext(), data);
//    }
//
//   public Cell findPos(int ind)
//   {
//       if(ind == 0) {
//           return null;
//       }
//
//       Cell first = top;
//       while (first!=null && ind-- >0) {
//           first = first.getNext();
//       }
//       return first;
//   }
//
//   private Cell findPred(int i) {
//        return findPredLog(top, i);
//   }
//
//   private Cell findPredLog(Cell top, int data) {
//        if(top == null && top.getNext() == null) {
//            return top;
//        }
//
//        if(top.getNext().getData() == data) {
//            return top;
//        }
//        return findPredLog(top.getNext(), data);
//   }
//
//   private void detelePos(int index) {
//        Cell currentPos = findPos(index);
//        if(index == 0 || currentPos.getNext() == null) {
//            top=currentPos.getNext();
//            return;
//        }
//
//        Cell pred = findPred(index - 1);
//        if(pred != null) {
//            currentPos.setNext(pred.getNext());
//        }
//   }
//
//   private void revers() {
//       Cell prev = null;
//       Cell next = top;
//       while (next != null) {
//           next = top.getNext();
//           top.setNext(prev);
//           prev = top;
//           top = next;
//       }
//       top = prev;
//   }
}
