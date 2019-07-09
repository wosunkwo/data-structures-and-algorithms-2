package codeChallenge.hashtable;

public class Hashtable<K,V> {
    //fields
    private Node<K,V>[] map;
    private int count;
    /*
    Constructors
     */
    // default size 1024
    public Hashtable(){
        this.map = new Node[1024];
        this.setCount(0);
    }
    //param constructor
    public Hashtable(int size){
        this.map = new Node[size];
        this.setCount(0);
    }
    /*
    Methods
     */
    public void add(String key, String value){

        int hashKey = hash(key);
        if(this.map[hashKey] == null){
            this.map[hashKey] = new Node(key,value);
            this.count++;
        }
        else{
            Node temp = this.map[hashKey];

            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(key,value));
            this.count++;
        }

    }
    //get
    public V get(String key){
        int idx = hash(key);
        Node<K,V> temp = this.map[idx];
        while(temp  != null){
            if(temp.getKey().equals(key)){
                return temp.getValue();
            }
            else{
                temp = temp.getNext();
            }
        }
        return null;
    }
    // isEmpty
    public boolean isEmpty( ){
        return (this.count == 0)? true : false;
    }
    //contains
    public boolean contains(String key){
        int idx = hash(key);
        boolean result = false;
        Node<K,V> temp = this.map[idx];
        while(temp != null){
            if(temp.getKey().equals(key)){
                result = true;
            }
            else{
                temp = temp.getNext();
            }
        }
        return result;
    }
    //Hash function
    private int hash(String key){
        int hashValue = 0;
        char[]letters = key.toCharArray();
        for(char each:letters){
            hashValue += (int)each;
        }
        hashValue = (hashValue * 599) % this.map.length;
        return hashValue;
    }

    /*
    Setters and getters
     */

    public Node[] getMap() {
        return map;
    }

    public void setMap(Node[] map) {
        this.map = map;
    }

    public int getCount() {
        return count;
    }

    private void setCount(int size) {
        this.count = size;
    }
}
