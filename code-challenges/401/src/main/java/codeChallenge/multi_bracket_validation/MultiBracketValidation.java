package codeChallenge.multi_bracket_validation;

import stacksandqueues.Stack;

public class MultiBracketValidation {
//reference: https://www.thepolyglotdeveloper.com/2015/02/validate-bracket-parenthesis-combos-using-stacks/
    public boolean multiBracketValidation(String input){
        Stack<Character> stack = new Stack<Character>();
        boolean result = true;
        char current, previous;
        for(char item : input.toCharArray()){
            current = item;
            if(current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if(current == ')' || current == ']' || current == '}') {
                if(stack.getFirst() == null) {
                    result = false;
                } else {
                    previous = stack.peek();
                    if((current == ')' && previous == '(') || (current == ']' && previous == '[') || (current == '}' && previous == '{')) {
                        stack.pop();
                    } else {
                        result = false;
                    }
                }
            }

        }
        //still bracket left
        if(stack.getFirst()!=null){
            result = false;
        }
        return result;
    }
}
