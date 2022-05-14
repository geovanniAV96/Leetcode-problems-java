class MinStack {
    //use java list
    //LinkedList<Integer> queue = new LinkedLis<>t();  
    ArrayList<Integer> queue = new ArrayList<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        //queue.addFirst(val);
        queue.add(0, val);
    }
    
    public void pop() {
        //queue.removeFirst();
        queue.remove(0);
    }
    
    public int top() {
        //queue.getFirst();
        return queue.get(0);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < queue.size(); i++) 
        {
            if(queue.get(i) < min)
            {
                min = queue.get(i);
            }
        }
        return min;
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