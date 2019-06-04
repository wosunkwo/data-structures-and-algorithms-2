# Linked list insertions.

## Sample Inpput/Ouput

Input	Args	Output
head -> [1] -> [3] -> [2] -> X	5	head -> [1] -> [3] -> [2] -> [5] -> X
head -> X	1	head -> [1] -> X
.insertBefore(value, newVal)
Input	Args	Output
head -> [1] -> [3] -> [2] -> X	3, 5	head -> [1] -> [5] -> [3] -> [2] -> X
head -> [1] -> [3] -> [2] -> X	1, 5	head -> [5] -> [1] -> [3] -> [2] -> X
head -> [1] -> [2] -> [2] -> X	2, 5	head -> [1] -> [5] -> [2] -> [2] -> X
head -> [1] -> [3] -> [2] -> X	4, 5	Exception
.insertAfter(value, newVal)
Input	Args	Output
head -> [1] -> [3] -> [2] -> X	3, 5	head -> [1] -> [3] -> [5] -> [2] -> X
head -> [1] -> [3] -> [2] -> X	2, 5	head -> [1] -> [3] -> [2] -> [5] -> X
head -> [1] -> [2] -> [2] -> X	2, 5	head -> [1] -> [2] -> [5] -> [2] -> X

## Challenge Description
.append(value) which adds a new node with the given value to the end of the list
.insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
.insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node

## Approach & Efficiency
Big O notation is O(1) for append
O(N) for insertBefore
O(N) for insertAfter

## Solution
![alt text](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/assets/LL_Insertions.jpg)

## Link to Code
[Code](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/main/java/codeChallenge/ll_insertions.java)
## 
[Test Code](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/test/java/codeChallenge/ll_insertionsTest.java)
