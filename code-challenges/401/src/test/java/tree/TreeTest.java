package tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

import static org.junit.Assert.*;

public class TreeTest {
    @Test
    public void emptyTree(){
        Tree o = new Tree();
        Object output = null;
        assertEquals(o.getRoot(),output);
    }
    @Test
    public void singleRootTree(){
        Tree o = new Tree();
        o.add("hello");
        Object output = "hello";
        assertEquals(o.getRoot().getData(),output);
    }
    @Test
    public void singleRootTree_addRight(){
        Tree o = new Tree();
        o.add(45);
        o.add(90);
        Object output = 90;
        assertEquals(o.getRoot().getRight().getData(),output);
    }
    @Test
    public void singleRootTree_addLeft(){
        Tree o = new Tree();
        o.add(45);
        o.add(90);
        o.add(9);
        Object output = 9;
        assertEquals(o.getRoot().getLeft().getData(),output);
    }
    @Test
    public void singleRootTree_multiData_inOrder(){
        Tree o = new Tree();
        o.add(401);
        o.add(201);
        o.add(301);
        o.add(101);
        o.add(110);
        o.add(4);
        o.add(501);
        o.add(420);
        o.add(670);
        List<Integer> output = new ArrayList<Integer>();
        output.add(4);
        output.add(101);
        output.add(110);
        output.add(201);
        output.add(301);
        output.add(401);
        output.add(420);
        output.add(501);
        output.add(670);

        assertEquals(o.inOrder(),output);
    }

    @Test
    public void singleRootTree_multiData_preOrder(){
        Tree o = new Tree();
        o.add(401);
        o.add(201);
        o.add(301);
        o.add(101);
        o.add(110);
        o.add(4);
        o.add(501);
        o.add(420);
        o.add(670);
        List<Integer> output = new ArrayList<Integer>();
        output.add(401);
        output.add(201);
        output.add(101);
        output.add(4);
        output.add(110);
        output.add(301);
        output.add(501);
        output.add(420);
        output.add(670);

        assertEquals(o.preOrder(),output);
    }
    @Test
    public void singleRootTree_multiData_postOrder(){
        Tree o = new Tree();
        o.add(401);
        o.add(201);
        o.add(301);
        o.add(101);
        o.add(110);
        o.add(4);
        o.add(501);
        o.add(420);
        o.add(670);
        List<Integer> output = new ArrayList<Integer>();
        output.add(4);
        output.add(110);
        output.add(101);
        output.add(301);
        output.add(201);
        output.add(420);
        output.add(670);
        output.add(501);
        output.add(401);

        assertEquals(o.postOrder(),output);
    }
    @Test
            (expected = EmptyStackException.class)
    public void emptyTree_Traverse(){
        Tree o = new Tree();
        o.postOrder();
    }
    @Test
            (expected = EmptyStackException.class)
    public void emptyTree_preOrder(){
        Tree o = new Tree();
        o.preOrder();
    }
    @Test
            (expected = EmptyStackException.class)
    public void emptyTree_contains(){
        Tree o = new Tree();
        o.contains("123");
    }
    @Test
    public void singleRootTree_multiData_Contains_leftBranch(){
        Tree o = new Tree();
        o.add(401);
        o.add(201);
        o.add(301);
        o.add(101);
        o.add(110);
        o.add(4);
        o.add(501);
        o.add(420);
        o.add(670);
        assertEquals(o.contains(110),true);
    }
    @Test
    public void singleRootTree_multiData_Contains_rightBranch(){
        Tree o = new Tree();
        o.add(401);
        o.add(201);
        o.add(301);
        o.add(101);
        o.add(110);
        o.add(4);
        o.add(501);
        o.add(420);
        o.add(670);
        assertEquals(o.contains(420),true);
    }
    @Test
    public void singleRootTree_multiData_Contains_leftBranch_right(){
        Tree o = new Tree();
        o.add(401);
        o.add(201);
        o.add(301);
        o.add(101);
        o.add(110);
        o.add(4);
        o.add(501);
        o.add(420);
        o.add(670);
        assertEquals(o.contains(101),true);
    }
    @Test
    public void singleRootTree_multiData_Contains_False(){
        Tree o = new Tree();
        o.add(401);
        o.add(201);
        o.add(301);
        o.add(101);
        o.add(110);
        o.add(4);
        o.add(501);
        o.add(420);
        o.add(670);
        assertEquals(o.contains(245),false);
    }

}