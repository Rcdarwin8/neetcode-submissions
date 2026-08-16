class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        Deque<Integer> stacktemp= new ArrayDeque<>();
        Deque<Integer> stackindex= new ArrayDeque<>();

        int[] ans= new int[temperatures.length];
        for(int i=0; i<temperatures.length; i++){
            if(stacktemp.isEmpty()){
                stacktemp.push(temperatures[i]);
                stackindex.push(i);
            }
            else{
                while(!stacktemp.isEmpty() && stacktemp.peek()<temperatures[i] ){
                    int temp=stackindex.pop();
                    ans[temp]=i-temp;
                    stacktemp.pop();
                }
                stacktemp.push(temperatures[i]);
                stackindex.push(i);
            }
        }
        while(!stackindex.isEmpty()){
            ans[stackindex.pop()]=0;
        }
        return ans;
    }
}
