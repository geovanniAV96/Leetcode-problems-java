class Solution {
    public boolean isValid(String s) {
        //if the length of the string is odd it means we are missing a closing or opening parentheses
        //so we have to return false
        if(s.length() % 2 != 0) return false;
        //We creat our stack
        Stack<Character> stack = new Stack();
        //We loop through our string
        for(char c : s.toCharArray())
        {
            //if we have an opening parentheses we push it in the stack
            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            //if we have a closing parentheses and the stack is not empty and the top element is an opening
            //parentheses that means we have a valid parentheses
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(')
            {
                //if we have a valid parentheses we need to pop the opening parentheses from the stack
                stack.pop();
            }
            //if we have a closing parentheses and the stack is not empty and the top element is an opening
            //parentheses that means we have a valid parentheses
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{')
            {
                //if we have a valid parentheses we need to pop the opening parentheses from the stack
                stack.pop();
            }
            //if we have a closing parentheses and the stack is not empty and the top element is an opening
            //parentheses that means we have a valid parentheses
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[')
            {
                //if we have a valid parentheses we need to pop the opening parentheses from the stack
                stack.pop();
            }
            else
            {
                //in case we have only closing paretheses we push them in the stack so we dont have an empty
                //stack at the end, and we can return false
                stack.push(c);
            }
        }
        //if we have an empty stack at the end that means we have a valid string
        return stack.isEmpty();
    }
}