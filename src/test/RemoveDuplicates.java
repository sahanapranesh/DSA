package test;// { Driver Code Starts

class LinkedListNode {
    int data;
    LinkedListNode next;

    LinkedListNode(int d) {
        data = d;
        next = null;
    }
}

class Remove_Duplicate_From_LL {
    LinkedListNode head;
    LinkedListNode tail;

    public void addToTheLast(LinkedListNode linkedListNode) {
        if (head == null) {
            head = linkedListNode;
            tail = linkedListNode;
        } else {
            tail.next = linkedListNode;
            tail = linkedListNode;
        }
    }

    void printList() {
        LinkedListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        Remove_Duplicate_From_LL llist = new Remove_Duplicate_From_LL();
        int a1 = 1;
        LinkedListNode head = new LinkedListNode(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < 5; i++) {
            llist.addToTheLast(new LinkedListNode(6));
        }

        RemoveDuplicates g = new RemoveDuplicates();
        llist.head = g.removeDuplicates(llist.head);
        llist.printList();

    }
}// } Driver Code Ends

class RemoveDuplicates {
    //Function to remove duplicates from sorted linked list.
    LinkedListNode removeDuplicates(LinkedListNode head) {
        LinkedListNode currentLinkedListNode = head;
        while (currentLinkedListNode.next != null) {
            if (currentLinkedListNode.data == currentLinkedListNode.next.data) {
                currentLinkedListNode.next = currentLinkedListNode.next.next;
            } else {
                currentLinkedListNode = currentLinkedListNode.next;
            }
        }
        return head;
    }
}
