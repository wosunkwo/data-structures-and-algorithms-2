package codeChallenge.tree_intersection;

import tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection<T> {
    public List<T> tree_intersection(Tree treeA , Tree treeB){
        if(!(treeA.getRoot() == null) && !(treeB.getRoot() == null)){
            List<T> listA = new ArrayList<T>();
            listA = treeA.inOrder();
            List<T> listB = new ArrayList<T>();
            listB = treeB.inOrder();
            return tree_intersection(listA, listB);
        }
        return null;
    }

    private List<T> tree_intersection( List<T> treeA, List<T> treeB ){
        List<T> match = new ArrayList<>();
        for(T each: treeA){
            if(treeB.contains(each)){
                match.add(each);
            }
        }
        return match;
    }
}
