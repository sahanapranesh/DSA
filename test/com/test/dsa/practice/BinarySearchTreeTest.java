package com.test.dsa.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {
    @Test
    void insert() {
        BinarySearchTree.Node root = new BinarySearchTree.Node(6);
        BinarySearchTree.insert(root, 4);
        BinarySearchTree.insert(root, 2);
        BinarySearchTree.insert(root, 3);
        BinarySearchTree.insert(root, 1);
    }
}