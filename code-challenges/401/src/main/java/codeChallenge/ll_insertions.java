package codeChallenge;

import java.sql.Wrapper;
import java.util.*;
import java.lang.annotation.ElementType;


public class ll_insertions<E>{
    /**
     *Class to hold data
     */
    private static class Node<E> {
        private E item;
        private Node<E> next;

        Node(E item){
            this.item = item;
            this.next=null;
        }
    }
    /**
     *properties
     */
    private Node<E> head;
    private Node<E> current;
    /**
     *Constructor
     */
    ll_insertions(){
        head =null;
        current = null;
    }
    /**
     *Methods
     */
    /**
     *Add items in LL
     */
    public void append(E item){
        add(item);
    }
    /**
     *Insert Before
     */
    public String insertBefore(E value, E newVal){
        if(head==null){
            String result = "Error: Empty List";
            return result;
        }
        else{
            return appendBefore(value,newVal,this.head);
        }

    }
    /**
     *Insert After
     */
    public String insertAfter(E value, E newVal){
        if(head==null){
            String result = "Error: Empty List";
            return result;
        }
        else{
            return appendAfter(value,newVal,this.head);
        }
    }
    /**
     *Search items in LL
     */
    public boolean includes(E item){
        return search(item,this.head);
    }
    /**
     *Return head of LL
     */
    public Node getListHead(){
        return this.head;
    }
    /**
     *Return head of LL
     */
    public Object getNodeValue(Node node){
        if(node != null){
            return node.item;
        }
        else
            return 0;
    }
    /**
     *Return Current of LL
     */
    public Node getListCurrent(){
        return this.current;
    }
    /**
     *Converts  LL into Vector
     */
    public Vector get_LL_into_Vector(){
        Vector results = new Vector();

        if(head != null){
            Node pointer = head;
            while(pointer != null){
                results.add(pointer.item);
                pointer=pointer.next;
            }
        }
        return results;
    }
    /**
     *Prints items in LL
     */
    public void print(){
        if(head==null) {
            System.out.println("Linked List in currently empty");
        }
        else{
            System.out.println("Linked List: ");
            view(this.head);
            System.out.println(" NULL ");
        }

    }
    /**
     *Add items in LL
     */
    private void add(E item){
        try{
            Node newNode = new Node(item);
            if(head == null){
                head = newNode;
                current = newNode;
            }
            else{
                if(current.next == null){
                    current.next = newNode;
                    current = newNode;
                }
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }

    }
    /**
     *Search items in LL
     */
    private boolean search(E item, Node node){

        if(node == null) {
            return false;
        }

        if(node.item.equals(item)){
            return true;
        }

        return search(item,node.next);
    }
    /**
     *Prints items in LL
     */
    private int view(Node node){

        if(node == null) {
            return 0;
        }
        else{
            System.out.println(node.item + " -> ");
        }

        return view(node.next);
    }
    /**
     *Return Node with the given searched element
     */
    private ArrayList<Node> findNode(E item, Node node, Node preNode){
        ArrayList<Node> list = new ArrayList<Node>();
        while(node != null){
            if(node.item.equals(item)){
                list.add(node);
                list.add(preNode);
                return list;
            }
            else{
                preNode = node;
                node = node.next;
            }
        }
        return null;
    }
    /**
     *AppendBefore items in LL
     */
    private String appendBefore(E value, E newVal, Node node){
        String result = " ";
        Node preNode = node;
        ArrayList<Node>list = new ArrayList<>();
        list = findNode(value,node,preNode);
        if(list != null){
            Node newNode = new Node(newVal);
            //list[0] represtend current node
            //list[1] represents previous Node
            if(list.get(0).equals(list.get(1))){
                this.head = newNode;
                this.head.next = list.get(0);//i.e head.next = currentNode ( currentNode WAS head)
            }
            else{
                newNode.next = list.get(0);// newNode next currentNode so it before that
                list.get(1).next = newNode;// previous node next is newNode

            }

            result = "Insert Before Successfull";
        }
        else{
            result = "Item not found";
        }
        return result;
    }
    /**
     *AppendAfter items in LL
     * Initially Node node head
     */
    private String appendAfter(E value, E newVal, Node node){
        String result = " ";
        Node preNode = node;
        ArrayList<Node>list = new ArrayList<>();
        list = findNode(value,node,preNode);
        if(list != null){
            //list[0] represtend current node
            //list[1] represents previous Node
            Node newNode = new Node(newVal);
            if(list.get(0).equals(list.get(1))){
                newNode.next = head.next;
                head.next = newNode;
            }
            else{
                newNode.next = list.get(0).next;// this is similar to node.next;
                list.get(0).next = newNode;//node.next = newNode
            }

            result = "Insert After Successfull";
        }
        else{
            result = "Item not found";
        }
        return result;
    }
}

