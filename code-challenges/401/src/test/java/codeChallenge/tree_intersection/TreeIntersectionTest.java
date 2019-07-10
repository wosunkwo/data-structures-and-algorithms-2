package codeChallenge.tree_intersection;

import org.junit.Test;
import tree.Tree;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TreeIntersectionTest {
    @Test
    public void test_EmptyTree_TreeIntersection(){
        TreeIntersection o = new TreeIntersection();
        Tree<String> tree1 = new Tree<>();
        Tree<String> tree2 = new Tree<>();
        List<String> output = null;
        assertEquals(o.tree_intersection(tree1,tree2),output);
    }
    @Test
    public void test_OneEmptyTree_TreeIntersection(){
        TreeIntersection o = new TreeIntersection();
        Tree<Integer> tree1 = new Tree<>();
        tree1.add(401);
        tree1.add(201);
        tree1.add(301);
        tree1.add(101);
        tree1.add(110);
        tree1.add(4);
        tree1.add(501);
        tree1.add(420);
        tree1.add(670);
        Tree<String> tree2 = new Tree<>();
        List<String> output = null;
        assertEquals(o.tree_intersection(tree1,tree2),output);
    }
    @Test
    public void test_OneMatch_TreeIntersection(){
        TreeIntersection o = new TreeIntersection();
        Tree<Integer> tree1 = new Tree<>();
        tree1.add(401);
        tree1.add(201);
        tree1.add(301);
        tree1.add(101);
        tree1.add(110);
        tree1.add(4);
        tree1.add(501);
        tree1.add(420);
        tree1.add(670);
        Tree<Integer> tree2 = new Tree<>();
        tree2.add(501);

        List<Integer> output = new ArrayList<>();
        output.add(501);
        assertEquals(o.tree_intersection(tree1,tree2),output);
    }
    @Test
    public void test_MultiMatch_TreeIntersection(){
        TreeIntersection o = new TreeIntersection();
        Tree<Integer> tree1 = new Tree<>();
        tree1.add(401);
        tree1.add(201);
        tree1.add(301);
        tree1.add(101);
        tree1.add(110);
        tree1.add(4);
        tree1.add(501);
        tree1.add(420);
        tree1.add(670);
        Tree<Integer> tree2 = new Tree<>();
        tree2.add(501);
        tree2.add(1111);
        tree2.add(90);
        tree2.add(5);
        tree2.add(201);

        List<Integer> output = new ArrayList<>();
        output.add(201);
        output.add(501);
        assertEquals(o.tree_intersection(tree1,tree2),output);
    }
    @Test
    public void test_NoMatch_TreeIntersection(){
        TreeIntersection o = new TreeIntersection();
        Tree<Integer> tree1 = new Tree<>();
        tree1.add(401);
        tree1.add(201);
        tree1.add(301);
        tree1.add(101);
        tree1.add(110);
        tree1.add(4);
        tree1.add(501);
        tree1.add(420);
        tree1.add(670);
        Tree<Integer> tree2 = new Tree<>();
        tree2.add(5012);
        tree2.add(11141);
        tree2.add(90213);
        tree2.add(524);
        tree2.add(201134);

        List<Integer> output = new ArrayList<>();
        assertEquals(o.tree_intersection(tree1,tree2),output);
    }
    @Test
    public void test_NoMatch_String_TreeIntersection(){
        TreeIntersection o = new TreeIntersection();
        Tree<String> tree1 = new Tree<>();
        tree1.add("401");
        tree1.add("201");
        tree1.add("301");
        tree1.add("101");

        Tree<String> tree2 = new Tree<>();
        tree2.add("5012");
        tree2.add("11141");
        tree2.add("90213");
        tree2.add("524");
        tree2.add("201134");

        List<Integer> output = new ArrayList<>();
        assertEquals(o.tree_intersection(tree1,tree2),output);
    }
    @Test
    public void test_MultiMatch_String_TreeIntersection(){
        TreeIntersection o = new TreeIntersection();
        Tree<String> tree1 = new Tree<>();
        tree1.add("401");
        tree1.add("201");
        tree1.add("301");
        tree1.add("101");
        tree1.add("XX");

        Tree<String> tree2 = new Tree<>();
        tree2.add("5012");
        tree2.add("11141");
        tree2.add("101");
        tree2.add("XX");
        tree2.add("90213");
        tree2.add("524");
        tree2.add("201134");

        List<String> output = new ArrayList<>();
        output.add("101");
        output.add("XX");
        assertEquals(o.tree_intersection(tree1,tree2),output);
    }
}