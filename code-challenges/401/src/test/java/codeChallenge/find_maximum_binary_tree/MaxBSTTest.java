package codeChallenge.find_maximum_binary_tree;

import org.junit.Test;
import tree.Tree;

import static org.junit.Assert.*;

public class MaxBSTTest {
    Tree tree = new Tree();
    @Test
    public void test_EmptyMaxBST(){
        MaxBST o = new MaxBST();
        Object output = null;
        assertEquals(o.findmaxValue(tree).getData(),output);
    }
    @Test
    public void test_MaxBST_singleHeight(){
        MaxBST o = new MaxBST();
        tree.add(5);
        tree.add(3);
        tree.add(15);
        Object output = 15;
        assertEquals(o.findmaxValue(tree).getData(),output);
    }
    @Test
    public void test_MaxBST_doubleHeight(){
        MaxBST o = new MaxBST();
        tree.add(32);
        tree.add(22);
        tree.add(151);
        tree.add(-5);
        tree.add(543);
        tree.add(44);
        tree.add(343);
        Object output = 543;
        assertEquals(o.findmaxValue(tree).getData(),output);
    }
    @Test
    public void test_MaxBST_doubleHeight_String(){
        MaxBST o = new MaxBST();
        tree.add("32");
        tree.add("22");
        tree.add("151");
        tree.add("-5");
        tree.add("543");
        tree.add("44");
        tree.add("343");
        Object output = "543";
        assertEquals(o.findmaxValue(tree).getData(),output);
    }
    @Test
    public void test_MaxBST_bigTree_String(){
        MaxBST o = new MaxBST();
        tree.add("32");
        tree.add("22");
        tree.add("151");
        tree.add("-5");
        tree.add("543");
        tree.add("44");
        tree.add("343A");
        tree.add("343D");
        tree.add("343E");
        tree.add("343GA");
        tree.add("343AA");
        Object output = "543";
        assertEquals(o.findmaxValue(tree).getData(),output);
    }

}