class StockSpanner {
    public Deque<Integer> stack;
    public ArrayList<Integer> stock;
    public StockSpanner() {
        // stack= new ArrayDeque<>();
        stock = new ArrayList<>();
    }
    
    public int next(int price) {
        stock.add(price);
        // stack.push(price);
        // int count=0;
        for(int i=stock.size()-1; i>=0; i--){
            if(stock.get(i)>price){
                return stock.size()-i-1;
            }
        }
        return stock.size();
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */