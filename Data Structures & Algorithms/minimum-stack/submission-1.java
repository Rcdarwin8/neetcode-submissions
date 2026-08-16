class MinPair {
    MinPair(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int a;
    public int b;
}
class MinStack {
    
    public Deque<MinPair> stack;
    public MinStack() {
        stack= new ArrayDeque<>();
    }

    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(new MinPair(val,val));
        }else{

        int cmin=Math.min(val,stack.peek().b);
        MinPair mp=new MinPair(val,cmin);
        stack.push(mp);
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().a;
    }
    
    public int getMin() {
        return stack.peek().b;
    }
}
