# Merge two linked lists.

A Linked list is a linear collection of data elements,
whose order is not given by their physical placement in memory

# Sample Input/Output 

Arg list1	                        Arg list2	                          Output

head -> [1] -> [3] -> [2] -> X	  head -> [5] -> [9] -> [4] -> X	    head -> [1] -> [5] -> [3] -> [9] -> [2] -> [4] -> X

head -> [1] -> [3] -> X	          head -> [5] -> [9] -> [4] -> X	    head -> [1] -> [5] -> [3] -> [9] -> [4] -> X

head -> [1] -> [3] -> [2] -> X	  head -> [5] -> [9] -> X	            head -> [1] -> [5] -> [3] -> [9] -> [2] -> X

## Challenge
A method akes two linked lists as arguments. 
Zip the two linked lists together into one so that the nodes alternate between the two lists and return a reference to the head of the zipped list.


## Approach & Efficiency
O(1) constant

## Solution
![alt text](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/assets/ll_merge.jpg)

## Link to Code
[Code merge](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/main/java/codeChallenge/ll_insertions.java) 
## 
[Test Code](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/test/java/codeChallenge/ll_insertionsTest.java)
