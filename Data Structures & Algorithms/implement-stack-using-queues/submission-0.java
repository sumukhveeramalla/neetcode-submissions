class MyStack {

    public Queue<Integer> q;
    public Queue<Integer> r;

    public MyStack() {
        this.q = new LinkedList<>();
        this.r = new LinkedList<>();
    }
    
    public void push(int x) {
        r.add(x);
        while(!q.isEmpty()){
            r.add(q.remove());
        }
        Queue<Integer> temp = q;
        q = r;
        r = temp;
    }
    
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.element();
    }
    
    public boolean empty() {
        return this.q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */