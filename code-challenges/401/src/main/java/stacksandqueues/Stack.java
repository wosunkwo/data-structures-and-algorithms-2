package stacksandqueues;

import codeChallenge.ll_insertions;

import java.util.ArrayList;

public class Stack<T> {
    private Node root;
    private Node first;

    //constructor
    Stack(){
        this.root = null;
        this.first = null;
    }
    //push
    public void push(T data){
        try{
            Node<T> newNode = new Node<T>(data);
            if(root == null){
                this.setFirst(newNode);
                this.setRoot(newNode);
            }
            else{
                newNode.setNext(this.getFirst()) ;
                this.setFirst(newNode);
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    //pop
    public T pop(){
        if(this.root == null){
            throw new IllegalStateException("Stack is currently empty");
        }
        else{
            T data = this.getFirst().getData();
            if(this.getFirst().getNext() != null){
                this.setFirst(this.getFirst().getNext());
            }
            else{
                this.setFirst(null);
            }

            return data;
        }
    }
    //peek
    public T peek(){
        if(this.root == null){
            throw new IllegalStateException("Stack is currently empty");
        }
        else{
            return this.getFirst().getData();
        }
    }
    /*
    Getters and Setter
     */
    //get
    public Node<T> getRoot() {
        return root;
    }
    //set
    public void setRoot(Node root) {
        this.root = root;
    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    /**
     *Return Node with the given searched element
     */
    private Node getPreNode(){
       Node node = this.getRoot();
       Node preNode = this.getRoot();
        while(node != null){
            if(node.equals(this.getFirst())){
                return preNode;
            }
            else{
                preNode = node;
                node = node.getNext();
            }
        }
        return null;
    }

}
