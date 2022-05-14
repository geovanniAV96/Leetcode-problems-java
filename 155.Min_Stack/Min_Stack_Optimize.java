class MinStack {
    //use java list
    //We use 2 stacks, one to keep track of the current minimum value and other to function as a normal stack
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> min_values = new Stack<>();

    public void push(int val) {
        //we have to check if our stack of minimum values is empty or if the new value is less than the one
        //at the top of the min stack
        if(min_values.isEmpty() || val <= min_values.peek())
        {
            //if it is the first value or is the new min value we push it to the stack of min
            min_values.push(val);
        }
        //after that we push the value to our normal stack
        stack.push(val);
    }
    
    public void pop() {
        //to pop our value we have to check if the top value is equals to the top min value
        //if it is this means we are going to pop the current min value
        if(stack.peek().equals(min_values.peek()))
        {
            //so we pop the value to still keep track of the min value, wich is the second value in the stack
            min_values.pop();
        }
        //now we pop the top value in our normal stack
        stack.pop();
    }
    
    public int top() {
        //we use the standard peek fuction to return the top value
        return stack.peek();
    }
    
    public int getMin() {
        //we can use the standard peek fuction to return the min value, since this is the current min value in our stack
        return min_values.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */