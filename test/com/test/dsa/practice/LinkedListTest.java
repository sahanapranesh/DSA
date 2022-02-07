package com.test.dsa.practice;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void add() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(-2);
        linkedList.add(-7);
        linkedList.add(8);
        linkedList.delete(6);
        linkedList.delete(2);
        linkedList.print();
    }

    @org.junit.jupiter.api.Test
    void delete() {
    }
}