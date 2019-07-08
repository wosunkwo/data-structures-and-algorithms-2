# Trees
Implement a Hash Table

## Challenge

> Implement a hash table with add, get, contains and hash methods. 

> Utilize the Single-responsibility principle: all the methods are  clean, reusable, abstract component parts to the whole challenge. 

> Adding a key/value to the hashtable results in the value being in the data structure

> Retrieving based on a key returns the value stored

> Successfully returns null for a key that does not exist in the hashtable

> Successfully handle a collision within the hashtable

> Successfully retrieve a value from a bucket within the hashtable that has a collision

> Successfully hash a key to an in-range value

## Approach & Efficiency
O(log n) , constant 

## API
> add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
> get: takes in the key and returns the value from the table.
> contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
> hash: takes in an arbitrary key and returns an index in the collection.

## Reference:


## Codes

[Code Source](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/main/java/hashtable/Hashtable.java)

[Test Code](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/test/java/hashTable/HashtableTest.java)
