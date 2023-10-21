class MinStack {
    Stack<Pair> st;
    public MinStack() {
       st = new Stack<Pair>(); 
    }
    
    public void push(int val) {
       if(st.empty()){
           st.push(new Pair(val,val));
       }
       else{
           int min = Math.min(st.peek().second,val);
           st.push(new Pair(val,min));
       }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        Pair top = st.peek();
        return top.first;
    }
    
    public int getMin() {
        return st.peek().second;
    }
}
class Pair{
    int first;
    int second;

    public Pair(int first, int second){
        this.first = first;
        this.second = second;
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