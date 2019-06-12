# First-in, First out Animal Shelter..
Implement queue for an Animal Shelter

# Sample Input/Output 

enqueue(value)
Input   	            Arg 	Output
 [1] -> [3] -> X	     5	  [5]->[1]-[3]->X
 
dequeue()

Input   	                Arg 	  Output
 [1] -> [3] -> [4] -> X	     	    4         [1]-[3]->X

## Challenge
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
Implement the following methods:

enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.


## Approach & Efficiency
O(N) Linear

## Solution
![alt text](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/assets/queueAnimalShelter.jpg)

## Link to Code
[Code](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/main/java/codeChallenge/fifo_animal_shelter/AnimalShelter.java) 
## 
[Test Code](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/test/java/codeChallenge/fifo_animal_shelter/AnimalShelterTest.java)
