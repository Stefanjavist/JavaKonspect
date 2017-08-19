package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.LinkedLists.create_list;

public class List {

/*
1) class that represents a list and insert operation
 */

    public static void main(String[] args) {
        List list = new List();

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
        node1.setData(12);
        node2.setData(3);
        node3.setData(5);
        list.delete(node1.getData());
        System.out.println(list.find(12));

        //but why do we do it if our method insert(int data) can to create nodes and sets values
        //that we convey.I want to check an easy rule java, or rather rewriting variables in
        // the same object (class)

//        Node node = new Node();
//        node.setData(firstData);
//        node.setData(secondData);
//        node.setData(tridCell);
//        System.out.println(node.getData());//here will be last overwritten variable(wonderful feeling)

    }
    private Node first;//это в книжке top

    public List() {
        this.first = null;
    }

    private void insert(int data) {//he's gorgeous))) he's creating obj by input values
        Node node = new Node();
        node.setData(data);
        node.setNext(first);
        first = node;
    }

    /*
  2)  Find element
     */
    private Node find(int nomer) {//he find mention by input values obj
        return findLogic(first, nomer);
    }

    private Node findLogic(Node node, int nomer) {
        if(node == null) return null;
        if(node.getData() == nomer) return node;
        return findLogic(node.getNext(), nomer);
    }

    /*
    3) Delete predecessor(3. стади)

    1.Обнаружение элемента, находящегося перед тем, который хотим удалить.
     */
    private Node findPredecessor(int i) {
        return findPredecessor(first, i);
    }

    /*
    2. Смена указателя с удаляемого к передстоящему элементу,
     */
    private Node findPredecessor(Node node, int i) {
        if(node == null || node.getNext() == null) {
            return null;
        }
        if(node.getNext().getData() == i) {
            return node;
        }
        return findPredecessor(node.getNext(), i);
    }

    /*
    3. Удаление  и привязка к следующему элементу
     */
    private void delete(int i) {
        Node element = find(i);
        if (element != null) {
            Node predecessor = findPredecessor(i);

            if (predecessor != null) {
                predecessor.setNext(element.getNext());

            } else {
                first = element.getNext();
            }

            element = null;
        }
    }
}
