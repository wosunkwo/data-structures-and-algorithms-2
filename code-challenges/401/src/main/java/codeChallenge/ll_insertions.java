package codeChallenge;

import java.security.InvalidParameterException;
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
        public E getItem(){ return this.item;}
    }
    /**
     *properties
     */
    private Node<E> head;
    private Node<E> current;
    private int size;
    /**
     *Constructor
     */
    ll_insertions(){
        head =null;
        current = null;
        size = 0;
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
    public E getNodeValue(Node<E> node){
        if(node != null){
            return node.item;
        }
        else
            return null;
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
                this.size++;
            }
            else{
                if(current.next == null){
                    current.next = newNode;
                    current = newNode;
                    this.size++;
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
    private boolean search(E item, Node<E> node){

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
                this.size++;
            }
            else{
                newNode.next = list.get(0);// newNode next currentNode so it before that
                list.get(1).next = newNode;// previous node next is newNode
                this.size++;
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
            //if there is just one node in the list
            if(list.get(0).equals(list.get(1))){
                newNode.next = head.next;
                head.next = newNode;
                this.size++;
                this.current = newNode;
            }
            else{
                if(this.current.equals(list.get(0))){
                    this.current =newNode;
                }
                newNode.next = list.get(0).next;// this is similar to node.next;
                list.get(0).next = newNode;//node.next = newNode
                this.size++;
            }

            result = "Insert After Successfull";
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
    public int getSize(){
        return this.size;
    }
    /**
     *Code Challenge 07
     * k-th value from the end of a linked list
     */
    public E kthFromEnd(int item){
        int result = -1;
        if(this.getListHead() == null){
            throw new NullPointerException("The Linked List is empty");
        }
        else if(this.getSize() < item){
            throw new IllegalArgumentException("Argument passed can't exceed the size of linked list");
        }
        else if(this.getSize() == item){
            throw new IllegalArgumentException("Argument passed can't be of the same size of linked list");
        }
        else if(item < 0 ){
            throw new IllegalArgumentException("Argument passed can't be less than zero");
        }

        else{
            int difference = this.getSize() - item -1;
            Node<E> node = this.getListHead();
            for(int i = 0 ; i < difference; i++){
                node = node.next;
            }
            return node.getItem();

        }
    }
    /**
     *Code Challenge 08
     * merge two LL
     */
    public ll_insertions<E> merge(ll_insertions<E> first, ll_insertions<E> second){

        if(second.head == null){

        }
        else if(first.head == null){
            throw new InvalidParameterException("First Linked List can't be null");
        }
        else{
            Node firstLead = first.head.next;
            Node firstFollow = first.head;
            Node secondFollow = second.head;
            while(firstLead != null && secondFollow != null){
                //pointing down
                firstFollow.next = secondFollow;
                //place holder
                Node temp = secondFollow.next;
                //pointing up
                secondFollow.next= firstLead;
                //updating pointers
               firstFollow = firstLead;
               firstLead=firstLead.next;
               secondFollow =temp;
                this.size++;
            }
            if(secondFollow!=null){
                firstFollow.next = secondFollow;
                this.size++;
            }
        }
        return first;
    }
}

