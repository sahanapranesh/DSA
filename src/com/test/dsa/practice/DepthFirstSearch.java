package com.test.dsa.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class DepthFirstSearch {
    private HashMap<Integer, Node> nodeMap = new HashMap<Integer, Node>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();

        public Node(int id) {
            this.id = id;
        }
    }

    private Node getNode(int id){
        return new Node(id);
    }

    public void addEdge(int sourceId, int destinationId){
        Node source = getNode(sourceId);
        Node destination = getNode(destinationId);
        source.adjacent.add(destination);
    }

    public boolean hasPathDFS(int source, int destination){
        Node  sourceNode = getNode(source);
        Node  destinationNode = getNode(destination);
        HashSet<Integer> visited = new HashSet<>();
        return hasPathDFS(sourceNode, destinationNode, visited);
    }

    private boolean hasPathDFS(Node sourceNode, Node destinationNode, HashSet<Integer> visited) {
        if(visited.contains(sourceNode.id)){
            return false;
        }
        visited.add(sourceNode.id);
        if( sourceNode == destinationNode){
            return true;
        }
        for(Node child: sourceNode.adjacent){
            if(hasPathDFS(child, destinationNode, visited)){
                return true;
            }
        }
        return false;
    }

    public boolean hasPathBFS(int source, int destination){
        Node sourceNode = getNode(source);
        Node destinationNode = getNode(destination);
        LinkedList<Node> nextToVisit = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        nextToVisit.add(sourceNode);
        while(!nextToVisit.isEmpty()){
            Node currentNode = nextToVisit.remove();
            if(currentNode == destinationNode){
                return true;
            }
            visited.add(currentNode.id);
            for(Node child : sourceNode.adjacent){
                nextToVisit.add(child);
            }
        }
        return false;
    }

}
