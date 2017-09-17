package com.stefan.java.chagay.computer_sience.AlgorithmsAndDataStructure.table_name.clients.api_for_table_name;


public class KeyMean<Key, Value> {

    private Key keys;
    private Value value;
    private KeyMean<Key, Value> next;

    public KeyMean<Key, Value> getNext() {
        return next;
    }

    public void setNext(KeyMean<Key, Value> next) {
        this.next = next;
    }

    public Key getKeys() {
        return keys;
    }

    public void setKeys(Key keys) {
        this.keys = keys;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
