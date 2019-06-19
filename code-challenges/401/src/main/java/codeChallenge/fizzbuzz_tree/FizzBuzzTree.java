package codeChallenge.fizzbuzz_tree;

import tree.Node;
import tree.Tree;

public class FizzBuzzTree {
    public FizzBuzzTree(){}
    public Tree fizzBuzzTree(Tree tree){
        if(tree != null){
            fizzBuzzTree(tree.getRoot());
        }
        return tree;
    }
    private void fizzBuzzTree(Node node){
        if(node == null){
            return;
        }
        fizzBuzzTree(node.getLeft());
        if( ( (int)node.getData() % 3 == 0) && ( (int)node.getData() % 5 == 0)){
            node.setData("FizzBuzz");
        }
        else if( (int)node.getData() % 3 == 0){
            node.setData("Fizz");
        }
        else if( (int)node.getData() % 5 == 0){
            node.setData("Buzz");
        }
        fizzBuzzTree(node.getRight());
    }
}
