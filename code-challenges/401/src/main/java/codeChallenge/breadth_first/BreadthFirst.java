package codeChallenge.breadth_first;

import stacksandqueues.Queue;
import tree.Node;
import tree.Tree;

import java.util.ArrayList;
import java.util.List;


public class BreadthFirst {
    public List<Node> breadthFirstTraverse(Tree tree){
        List<Node> objectList = null;
        if(tree != null){
            objectList = new ArrayList<Node>();
            breadthFirstTraverse(tree.getRoot(),objectList);
        }
       return objectList;
    }

    private void breadthFirstTraverse(Node node, List list){
        Queue<Object> queue = new Queue<Object>();
        //5  6  7
        while(node != null){
            if(node.getLeft() != null){
                queue.enqueue(node.getLeft());
            }
            list.add(node);
            System.out.println(node.getData());

            if(node.getRight() != null){
                queue.enqueue(node.getRight());
            }
            if(queue.getFirst() != null){
                node = (Node) queue.dequeue();
            }
            else{
                node =null;
            }

        }



    }
}
