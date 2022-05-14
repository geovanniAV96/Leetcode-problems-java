class MyQueue {
    //We create both stacks to keep track of the queue
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    //since we are using both stacks to keep track of the queue we need to keep track of the front element in the queue
    int front = 0;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        //we are always pushing to stack1 so if we push the first element in the queue we can set it as the front
        if(stack1.isEmpty()) front = x;
        //then we just push the new element to stack 1
        stack1.push(x);
    }
    
    public int pop() {
        //we are using stack 2 as the main part of the queue, so if is empty we have to pass all the elements to ir
        if(stack2.isEmpty())
        {
            //while stack 1 is not empty
            while(!stack1.isEmpty())
            {
                //we past all the elements to the stack 2
                stack2.push(stack1.pop());
            }
        }
        //finally we pop the top element from stack 2
        return stack2.pop();
    }
    
    public int peek() {
        //if stack 2 is not empty, that means the front element is at the top of the stack
        if(!stack2.isEmpty())
            //so we can return that
            return stack2.peek();
        //else we return our current front
        return front;
    }
    
    public boolean empty() {
        //if both stacks are empty we can return true, else we return false, since we still have elements in a stack
        return (stack1.isEmpty() && stack2.isEmpty());
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */