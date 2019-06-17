package tree;

public class Node<T extends Comparable<T>>{
    private T data;
    private Node<T> left;
    private Node<T> right;

    Node(T data){
        this.setData(data);
        this.setLeft(null);
        this.setRight(null);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
