package codeChallenge.queue_with_stacks;

import stacksandqueues.Stack;

public class QueueWithStacks<T>{
    public Stack<T> s1;
    public Stack<T> s2;
    QueueWithStacks(){
        s1 = new Stack<T>();
        s2 = new Stack<T>();
    }
    public void enqueue(T data) {
        while (s1.getFirst() != null) {
            s2.push(s1.pop());
        }
        // Push item into s1
        s1.push(data);
        // Push everything back to s1
        while (s2.getFirst() != null) {
            s1.push(s2.pop());
        }
    }
    public T dequeue() {
        if(s1.getFirst() == null){
            throw new IllegalStateException("Queue is currently empty");
        }
        else{
            T item = s1.pop();
            return item;
        }
    }
}
