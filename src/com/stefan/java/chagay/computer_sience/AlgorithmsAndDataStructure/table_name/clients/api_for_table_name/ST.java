package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.table_name.clients.api_for_table_name;

import com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.LinkedLists.create_list.ListThrid;

/**
 * это api для реализации если забыл что такое api смори  тетради под стикером в тетраде
 * page 334
 */
public class ST <Key, Value>{

    public ST() {

    }

    public KeyMean<Key, Value> first = null;

//          Cell newCell = new ListThrid.Cell();
//        newCell.setData(data);
//        newCell.setNext(top);
//    top = newCell;
    public void put(Key key, Value val) {
        if(first == null){
            KeyMean newKM = new KeyMean();
            newKM.setKeys(key);
            newKM.setValue(val);
            first = newKM;
            return;

        }
    }

    public Value get(Key key) {
        while (first.getKeys() != key) {
            first = first.getNext();
        }
        return first.getValue();
    }

    // раздел 1.3 / (336)
//    public Iterable<Key> keys() {
//
//    }
}



