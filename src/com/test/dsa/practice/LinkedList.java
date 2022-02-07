package com.test.dsa.practice;

public class LinkedList {
    private Node head;


    private class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public void add(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void delete(int data) {
        Node current = head;
        if (current.data == data) {
            head = head.next;
            return;
        }
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;

        }
    }

    public void print() {
        Node current = head;
        while (current.next != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println(current.data);
    }
}
