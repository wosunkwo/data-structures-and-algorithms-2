package codeChallenge.fizzbuzz_tree;

import org.junit.Test;
import tree.Tree;

import static org.junit.Assert.*;

public class FizzBuzzTreeTest {
    Tree tree = new Tree();

    @Test
    public void test_EmptyTree(){
        FizzBuzzTree o = new FizzBuzzTree();
        o.fizzBuzzTree(tree);
        assertEquals(tree.getRoot(),null);
    }

        @Test
    public void test_checkRoot(){
            tree.add(3);
            tree.add(5);
            tree.add(15);
            tree.add(7);
            tree.add(37);
            tree.add(444);
            tree.add(501);

            FizzBuzzTree o = new FizzBuzzTree();
            o.fizzBuzzTree(tree);
            String output = "Fizz";
            assertEquals(tree.getRoot().getData(),output);
    }

    @Test
    public void test_checkRightBranch(){
        tree.add(3);
        tree.add(5);
        tree.add(15);
        tree.add(7);
        tree.add(37);
        tree.add(444);
        tree.add(501);

        FizzBuzzTree o = new FizzBuzzTree();
        o.fizzBuzzTree(tree);
        String output = "Buzz";
        assertEquals(tree.getRoot().getRight().getData(),output);
    }

    @Test
    public void test_check_noChange(){
        tree.add(5);
        tree.add(3);
        tree.add(15);
        tree.add(7);
        tree.add(37);
        tree.add(444);
        tree.add(501);

        FizzBuzzTree o = new FizzBuzzTree();
        o.fizzBuzzTree(tree);
        int output = 7;
        assertEquals(tree.getRoot().getRight().getLeft().getData(),output);
    }
    @Test
    public void test_check_FizzBuzz_on15(){
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(71);
        tree.add(15);
        tree.add(444);
        tree.add(501);

        FizzBuzzTree o = new FizzBuzzTree();
        o.fizzBuzzTree(tree);
        String output = "FizzBuzz";
        assertEquals(tree.getRoot().getRight().getRight().getLeft().getData(),output);
    }

}