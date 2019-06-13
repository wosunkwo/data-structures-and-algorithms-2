# Multi-bracket Validation

# Sample Input/Output 

Input	                    Output
{}	                      TRUE
{}(){}	                  TRUE
()[[Extra Characters]]	  TRUE
(){}[[]]	                TRUE
{}{Code}[Fellows](())	    TRUE
[({}]	                    FALSE
(](	                      FALSE
{(})	                    FALSE

## ChallengeAfunction that takee a string as its only argument, 
A function thatreturns a boolean representing whether or not the brackets in the string are balanced. 
There are 3 types of brackets:

Round Brackets : ()
Square Brackets : []
Curly Brackets : {}


## Reference
[Link](https://www.thepolyglotdeveloper.com/2015/02/validate-bracket-parenthesis-combos-using-stacks/)

## Approach & Efficiency
O(N) Linear

## Solution
![alt text](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/assets/multiBracketVal.jpg)

## Link to Code
[Code](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/main/java/codeChallenge/multi_bracket_validation/MultiBracketValidation.java) 
## 
[Test Code](https://github.com/skadariya/data-structures-and-algorithms/blob/master/code-challenges/401/src/test/java/codeChallenge/multi_bracket_validation/MultiBracketValidationTest.java)
