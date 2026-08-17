class Solution {
    public String simplifyPath(String path) {
        // if(path.length()==0)return "";
        String[] each= path.split("/");

        Deque<String> stack = new ArrayDeque<>();
        Deque<String> stack2 = new ArrayDeque<>();
        
        for(int i=0;i<each.length;i++){
            if( each[i].equals("..")){
                if(!stack.isEmpty())
                stack.pop();
            }else if(each[i].equals(".") || each[i].equals("")){

            }else{
                stack.push(each[i]);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder ans= new StringBuilder();
        while(!stack.isEmpty()){
             stack2.push(stack.pop());
        }
        while(!stack2.isEmpty()){
        
            ans.append("/");
            ans.append(stack2.pop());
        }
        
        return ans.toString();
    }
}