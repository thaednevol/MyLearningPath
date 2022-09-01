package co.knry.springboot.essentials;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataTypesTest {

    @Test
    void printHashMap() {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printHashMap();
    }

    @Test
    void printQuery() {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printQuery();
    }

    @Test
    void printTuple() {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printTuple();
    }

    @Test
    void printArrayList() {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printArrayList();
    }

    @Test
    void printHashSet() {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printSet();
    }

    @Test
    void printHashStack() {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printStack();
    }

    @Test
    void printQueue() {
        DataTypes dataTypes = new DataTypes();
        dataTypes.printQueue();
    }
}