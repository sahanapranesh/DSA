package test.lrucache;


import org.junit.Test;

class DoublyLinkedListTest {

    @Test
    void testDoublyLinkedList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addData(34);
        doublyLinkedList.addData(5);
        doublyLinkedList.addData(3);
        doublyLinkedList.addData(1);
        doublyLinkedList.addData(0);
        doublyLinkedList.print();
    }
}