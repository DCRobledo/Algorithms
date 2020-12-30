package Algorithms.Search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class DepthFirstSearch {
    private HashMap<Integer, Node> nodeLookUp = new HashMap<Integer, Node>();

    public class Node {
        public int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();

        public Node(int id) {
            this.id = id;
            nodeLookUp.put(this.id, this);
        }
    }

    public Node getNode(int id) {
        return nodeLookUp.get(id);
    }

    public void addEdge(int source, int destination) {
        Node srcNode = getNode(source);
        Node dstNode = getNode(destination);
        srcNode.adjacent.add(dstNode);
    }

    public boolean DFS(int source, int destination) {
        Node srcNode = getNode(source);
        Node dstNode = getNode(destination);
        HashSet<Integer> visited = new HashSet<Integer>();
        return DFS(srcNode, dstNode, visited);
    }

    private boolean DFS(Node source, Node destination, HashSet<Integer> visited) {
        if (source == destination) 
            return true;
            
        if (source.adjacent == null || visited.contains(source.id)) 
            return false;

        for (Node child: source.adjacent) 
            if (DFS(child, destination, visited))
                return true;
        
        return false;
    }
}
