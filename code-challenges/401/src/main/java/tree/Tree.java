package tree;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Tree<T extends Comparable<T>> {
    /*
    Comparable works in following ways:
    if s1 > s2, it returns positive number
    if s1 < s2, it returns negative number
    if s1 == s2, it returns 0
     */
    private Node<T> root;
    private int size;
    /*
    Constructor
     */
    Tree(){
        this.setSize(0);
        this.setRoot(null);
    }
    public void add(T data){
        try{
            Node newNode = new Node(data);
            add(newNode);
            this.size++;
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    private void add(Node newNode){
        if(this.getRoot() == null){
            this.setRoot(newNode);
        }
        else{
            Node trailNode = null;
            Node temp = this.getRoot();
            while(temp != null){
                trailNode = temp;
                // new data is greater than current value go right
                if(newNode.getData().compareTo(temp.getData()) > 0){
                    temp = temp.getRight();
                }
                //go to the left branch
                else{
                    temp = temp.getLeft();
                }
            }
            //if tail Node value is greater then goes to new NODE goes to lef
            if(trailNode.getData().compareTo(newNode.getData()) > 0){
                trailNode.setLeft(newNode);
            }
            //if less then goes to right i.e newNode is greater than trail node
            else if(trailNode.getData().compareTo(newNode.getData()) < 0    ){
                trailNode.setRight(newNode);
            }
            //equals also goes to right
            else if(trailNode.getData().compareTo(newNode.getData()) == 0){
                trailNode.setRight(newNode);
            }
        }
    }

    public boolean contains(T data){
        if(this.getRoot() == null){
            throw new EmptyStackException();
        }
        else{
            return contains(this.getRoot(),data);
        }
    }

    public boolean contains(Node root, T data){
        Node temp = root;
        while(temp != null){
            //if the item equal the to be searched item
            if(temp.getData().equals(data)) {
                return true;
            }
            // new data is greater than current value go right
            else if(temp.getData().compareTo(data) < 0){
                    temp = temp.getRight();
                }
            //go to the left branch
            else{
                    temp = temp.getLeft();
                }
        }
        return false;
    }

    public List preOrder(){
        if(this.getRoot() == null){
            throw new EmptyStackException();
        }
        else{
            List result = new ArrayList<T>();
            preOrder(this.getRoot(),result);
            return result;
        }

    }

    private void preOrder(Node<T> node,List list){
        if (node == null){
            return;
        }
        /* first print data of node */
        list.add(node.getData());

        /* then recur on left sub tree */
        preOrder(node.getLeft(),list);

        /* now recur on right subtree */
        preOrder(node.getRight(),list);
    }

    public List<T> inOrder() {
        if(this.getRoot() == null){
            throw new EmptyStackException();
        }
        else{
            List results = new ArrayList<T>();
            inOrder(this.root,results);
            return results;
        }
    }

    private void inOrder(Node<T> node, List list){
        if(node == null){
            return;
        }
        inOrder(node.getLeft(),list);
        list.add(node.getData());
        inOrder(node.getRight(),list);

    }

    public List<T> postOrder(){
        if(this.getRoot() == null){
            throw new EmptyStackException();
        }
        else{
            List result = new ArrayList<T>();
            postOrder(this.getRoot(),result);
            return result;
        }
    }

    private void postOrder(Node node, List list){
        if (node == null){
            return;
        }
        // first recur on left subtree
        postOrder(node.getLeft(),list);
        // then recur on right subtree
        postOrder(node.getRight(),list);
        // now deal with the node
        list.add(node.getData());
    }

    //get and set
    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
