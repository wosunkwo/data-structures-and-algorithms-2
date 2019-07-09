package codeChallenge.hashtable;

public class Node<K,V> {
    private K key;
    private V value;
    private Node next;

    Node(K key, V value){
        this.setValue(value);
        this.setKey(key);
        this.setNext(null);
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}