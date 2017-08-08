package com.stefan.java.chagay.Algorithms.LinkedLists.create_list;

public class List {

/*
1) class that represents a list
 */
    private Node first;

    public List() {
        this.first = null;
    }

    public void insert(int data) {
        Node node = new Node();
        node.setData(data);
        node.setNext(first);
        first = node;
    }

    /*
  2)  Find element
     */
    public Node find(int nomer) {
        return findLogic(first, nomer);
    }

    public Node findLogic(Node node, int nomer) {
        if(node == null) return null;
        if(node.getData() == nomer) return node;
        return findLogic(node.getNext(), nomer);
    }

    /*
    3) Delete predecessor(3. стади)

    1.Обнаружение элемента, находящегося перед тем, который хотим удалить.
     */
    public Node findPredecessor(int i) {
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
    Удаление
     */
    public void delete(int i) {
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
