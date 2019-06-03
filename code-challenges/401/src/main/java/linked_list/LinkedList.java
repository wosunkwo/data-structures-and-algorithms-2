package linked_list;

import java.util.*;
import java.lang.annotation.ElementType;

public class LinkedList<E>{
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
    LinkedList(){
        head =null;
        current = null;
    }
    /**
     *Methods
     */
    /**
     *Add items in LL
     */
    public void insert(E item){
        add(item);
    }
    /**
     *Search items in LL
     */
    public boolean includes(E item){
        return search(item,this.head);
    }
    public Node getListHead(){
        return this.head;
    }
    public Object getNodeValue(Node node){
        if(node != null){
            return node.item;
        }
        else
            return 0;
    }
    public Node getListCurrent(){
        return this.current;
    }
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
    private boolean search(E item,Node node){

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
}
