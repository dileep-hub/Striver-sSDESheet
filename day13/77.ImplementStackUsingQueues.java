class MyStack {

    

    private Queue<Integer> stack = new LinkedList<>();
    
    
    public void push(int x) {
        stack.add(x);
        for(int i=0; i<stack.size()-1; i++) {
            stack.add(stack.remove());
            
        }
    }
    
    public int pop() {
        return stack.remove();        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        return stack.size()==0;
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

// Input
// ["MyStack", "push", "push", "top", "pop", "empty"]
// [[], [1], [2], [], [], []]
// Output
// [null, null, null, 2, 2, false]

// Explanation
// MyStack myStack = new MyStack();
// myStack.push(1);
// myStack.push(2);
// myStack.top(); // return 2
// myStack.pop(); // return 2
// myStack.empty(); // return False
