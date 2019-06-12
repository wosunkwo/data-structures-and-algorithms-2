package stacksandqueues;

public class Queue<T> {
    private Node first;
    private Node last;


    public Queue(){
        this.setFirst(null);
        this.setLast(null);
    }
    //enqueue
    public void enqueue(T data){
        try{
            Node<T> newNode = new Node(data);
            if(this.getFirst() == null){
                this.setFirst(newNode);
                this.setLast(newNode);
            }
            else{
                //this is exactly this: last.next = newNode;
                this.getLast().next = newNode;
                this.setLast(newNode);
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
    //dequeue
    public T dequeue(){
        if(this.first == null){
            throw new IllegalStateException("Queue is currently empty");
        }
        else{
            T data = this.getFirst().getData();
            if(this.getFirst().getNext() == null){
                this.setFirst(null);
            }
            else{
                this.setFirst(this.getFirst().getNext());
            }
            return data;
        }
    }
    //peek
    public T peek(){
        if(this.first == null){
            throw new IllegalStateException("Queue is currently empty");
        }
        else{
            return this.getFirst().getData();
        }
    }
    /*
    Getters and Setter
     */
    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
    //helper function to assign two nodes
    private void setTwoNodes(Node node1, Node node2){
        node1 = node2;
    }
}
