package com.test.dsa.practice;


import org.junit.Test;

class QueueTest {

    @Test
    void testOperations() {
        Queue queue = new Queue();
        queue.add(5);
        queue.add(8);
        queue.add(7);
        queue.add(9);
        queue.add(1);
        queue.add(6);
        queue.delete();
        queue.delete();
        queue.delete();
    }

    @Test
    void delete() {
    }
}