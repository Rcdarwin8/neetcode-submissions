class Solution {
    public boolean isValid(String s) {
        
        Deque<Character> stack = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='('){
                stack.push(ch);
                // System.out.println(stack.peek());
            }else{
                if(stack.isEmpty())return false;
                if(ch==')'){
                    if(stack.peek()!='(')return false;
                // System.out.println(stack.peek());
                    stack.pop();
                }
                
                if(ch=='}'){
                    if(stack.peek()!='{')return false;
                // System.out.println(stack.peek());
                    stack.pop();
                }
                
                if(ch==']'){
                    if(stack.peek()!='[')return false;
                // System.out.println(stack.peek());
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){

           while(!stack.isEmpty()){
            //  System.out.println(stack.peek());
             stack.pop();
           }
           return false;
        }
        return true;
    }
}
