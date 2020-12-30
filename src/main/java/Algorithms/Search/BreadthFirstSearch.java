package Algorithms.Search;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class BreadthFirstSearch {
    public HashMap<Integer, Node> nodeLookUp = new HashMap<Integer, Node>();

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

    public boolean BFS(int source, int destination) {
        Node srcNode = getNode(source);
        Node dstNode = getNode(destination);
        return BFS(srcNode, dstNode);
    }

    private boolean BFS(Node source, Node destination) {
        LinkedList<Node> nextToVisit = new LinkedList<Node>();
        HashSet<Integer> visited = new HashSet<Integer>();

        nextToVisit.add(source);
        while(!nextToVisit.isEmpty()) {
            Node node = nextToVisit.remove();

            if(node == destination)
                return true;

            if(visited.contains(node.id))
                continue;

            visited.add(node.id);

            for(Node child: node.adjacent) {
                nextToVisit.add(child);
            }
        }

        return false;
    }
}
