# k-th value from the end of a linked list.
A Linked list is a linear collection of data elements,
whose order is not given by their physical placement in memory

# Sample Input/Output 

Input ll	                              Arg k	Output
head -> [1] -> [3] -> [8] -> [2] -> X	  0	      2

head -> [1] -> [3] -> [8] -> [2] -> X	  2	      3

head -> [1] -> [3] -> [8] -> [2] -> X	  6	     Exception

## Challenge
A method for the Linked List class which takes a number, k, as a parameter. 
Return the node’s value that is k from the end of the linked list. 
You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges


## Approach & Efficiency
O(N) Linear

## Solution
![alt text](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/assets/ll_kthFronEnd.jpg)

## Link to Code
[Code kthFromEnd](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/main/java/codeChallenge/ll_insertions.java) 
## 
[Test Code](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/test/java/codeChallenge/ll_insertionsTest.java)
