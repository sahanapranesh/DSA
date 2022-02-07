package test.lrucache;

public class DoublyLinkedList {
    public Node head;

    private class Node {
        private int data;
        private Node next;
        private Node previous;

        public Node(int data) {
            this.data = data;
        }
    }

    public void addData(int data) {
        if (head == null) {
            this.head = new Node(data);
            return;
        }
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            previousNode = currentNode.previous;
        }
        currentNode = new Node(data);
        currentNode.previous = previousNode;
    }

    public void delete(int data) {
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node currentNode = head;
        Node previousNode = null;
        while (currentNode.data != data) {
            currentNode = currentNode.next;
            previousNode = currentNode.previous;
        }
        Node next = currentNode.next.next;
        previousNode.next = next;
        next.previous = previousNode;
    }

    public void print() {
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            Node next = currentNode;
            System.out.println("Current node" + next.data);
            System.out.println("Previous node" + next.previous.data);
            System.out.println("Next node" + next.next.data);
        }
    }
}
