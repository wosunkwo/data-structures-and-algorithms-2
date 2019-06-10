# Stacks and Queues
Enqueue means to insert an item into the back of the queue, dequeue means removing the front item. 
The picture demonstrates the FIFO access. The difference between stacks and queues is in removing

## Challenge
Node class that has properties for the value stored in the Node, and a pointer to the next node.
A Stack class that has a top property. It creates an empty Stack when instantiated.
This object should be aware of a default empty value assigned to top when the stack is created.
A Queue class that has a front property. It creates an empty Queue when instantiated.
This object should be aware of a default empty value assigned to front when the queue is created.

## Approach & Efficiency
O(1) , constant 

## API
A method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
A method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
A method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
A method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
A method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
A method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.

## Codes

[Code Source](https://github.com/skadariya/data-structures-and-algorithms/tree/master/code-challenges/401/src/main/java/stacksandqueues)

[Test Code](https://github.com/skadariya/data-structures-and-algorithms/tree/master/code-challenges/401/src/test/java/stacksandqueues)
