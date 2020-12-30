package Algorithms.Search;

import org.junit.Test;

import Algorithms.Search.BreadthFirstSearch.Node;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
    
public class BreadthFirstSearchTest {
    BreadthFirstSearch graph;
    Node node1;
    Node node2;
    Node node3;
    Node node4;
    Node node5;
    Node node6;
    Node node7;
    Node node8;

    @Before
    public void setup(){
        graph = new BreadthFirstSearch();
        node1 = graph.new Node(1);
        node2 = graph.new Node(2);
        node3 = graph.new Node(3);
        node4 = graph.new Node(4);
        node5 = graph.new Node(5);
        node6 = graph.new Node(6);
        node7 = graph.new Node(7);
        node8 = graph.new Node(8);

        graph.addEdge(1, 2);
        graph.addEdge(1, 6);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 6);
        graph.addEdge(5, 6);
        graph.addEdge(6, 8);
        graph.addEdge(4, 6);
        graph.addEdge(8, 7);
    }
        
    @Test
    public void breadthFirstSearchTest() {
        assertTrue(graph.BFS(1, 7));
    }
}
    