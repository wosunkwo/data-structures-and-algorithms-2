package codeChallenge.breadth_first;


import org.junit.Test;
import tree.Node;
import tree.Tree;

import java.util.List;

import static org.junit.Assert.*;

public class BreadthFirstTest {
    Tree tree = new Tree();

    @Test
    public void test_EmptyTree(){
        BreadthFirst o = new BreadthFirst();
        o.breadthFirstTraverse(tree);
        assertEquals(tree.getRoot(),null);
    }
    @Test
    public void test_singleDepth() {
        tree.add(5);
        tree.add(3);
        tree.add(15);
        BreadthFirst o = new BreadthFirst();
        List<Node> results = o.breadthFirstTraverse(tree);
        Object output = 3;
        assertEquals(results.get(1).getData(), output);
    }

    @Test
    public void test_TripleDepth() {
        tree.add(5);
        tree.add(3);
        tree.add(15);
        tree.add(1);
        tree.add(4);
        tree.add(10);
        tree.add(25);
        tree.add(17);
        tree.add(100);
        tree.add(2);
        BreadthFirst o = new BreadthFirst();
        List<Node> results = o.breadthFirstTraverse(tree);
        Object output = 2;
        assertEquals(results.get(7).getData(), output);
    }
    @Test
    public void test_QuadDepth() {
        tree.add(5);
        tree.add(3);
        tree.add(15);
        tree.add(1);
        tree.add(4);
        tree.add(10);
        tree.add(25);
        tree.add(17);
        tree.add(100);
        tree.add(2);
        tree.add(99);
        tree.add(100);
        BreadthFirst o = new BreadthFirst();
        List<Node> results = o.breadthFirstTraverse(tree);
        Object output = 99;
        assertEquals(results.get(10).getData(), output);
    }
    @Test
    public void test_QuadDepth_notEquals() {
        tree.add(5);
        tree.add(3);
        tree.add(15);
        tree.add(1);
        tree.add(4);
        tree.add(10);
        tree.add(25);
        tree.add(17);
        tree.add(100);
        tree.add(2);
        tree.add(99);
        tree.add(100);
        BreadthFirst o = new BreadthFirst();
        List<Node> results = o.breadthFirstTraverse(tree);
        Object output = 2;
        assertNotEquals(results.get(10).getData(), output);
    }
}