package com.test.dsa.practice;

public class BinarySearchTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int data) {
        return insertValue(root, data);
    }

    private static Node insertValue(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        }
        if (data > root.data) {
            Node rightNode = root.right;
            if (rightNode == null) {
                root.right = new Node(data);
            } else {
                insertValue(rightNode, data);
            }
        } else {
            Node leftNode = root.left;
            if (leftNode == null) {
                root.left = new Node(data);
            } else {
                insertValue(leftNode, data);
            }
        }
        return root;
    }

}
