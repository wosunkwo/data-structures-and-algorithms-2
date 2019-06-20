package codeChallenge.find_maximum_binary_tree;

import tree.Node;
import tree.Tree;

public class MaxBST extends Tree {
    public Node findmaxValue(Tree tree){
        if(tree != null){
             Node maxValue = new Node();
             maxValue(tree.getRoot(),maxValue);
             return maxValue;
        }
        return tree.getRoot();
    }
    private void maxValue(Node node, Node maxValue) {
        if (node == null) {
                return;
        }
        maxValue.setData(node.getData());
        maxValue(node.getRight(), maxValue);
    }

}
