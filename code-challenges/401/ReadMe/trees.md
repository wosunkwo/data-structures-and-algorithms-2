# Trees
Implement a Tree

## Challenge
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
Create a BinaryTree class
Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.
At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which 
cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.

Create a BinarySearchTree class
Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
O(log n) , constant 

## API
A method called add - to add new item to tree
A method called contains return boolean value based if the item passed exists in the tree. 
A method called inorder which return List with elements of tree in order
A method called pre-order which return List with elements of tree pre order
A method called post-order which return List with elements of tree post order

## Reference:
[BST](https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/)

## Codes

[Code Source](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/main/java/tree/Tree.java)

[Test Code](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/test/java/tree/TreeTest.java)
