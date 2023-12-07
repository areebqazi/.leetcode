class MinStack {

    Stack<Integer>s;
    Stack<Integer>min;
    public MinStack() {
        s= new Stack<>();
        min=new Stack<>();
        min.push(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        s.push(val);
        min.push(Math.min(min.peek(),val));
    }
    
    public void pop() {
        s.pop();
        min.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min.peek();
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