class Solution {
    public String decodeString(String s) {

        StringBuilder ans= new StringBuilder();

        Deque<Character> stack= new ArrayDeque<>();

        for(int i=0; i< s.length(); i++){
            if(!stack.isEmpty() &&  s.charAt(i)==']'){
                StringBuilder temp=new StringBuilder();
                while(stack.peek()!='['){
                    temp.append(stack.pop());
                }
                stack.pop();
                temp.reverse();
                int num=0;
                int numb=1;
                while(!stack.isEmpty() && stack.peek()-'0'<=9 && stack.peek()-'0'>=0){
                    num+=(stack.peek()-'0')*numb;
                    numb=numb*10;
                    stack.pop();
                }
                while(num>0){
                     for(int j=0;j<temp.length();j++){
                        stack.push(temp.charAt(j));
                     }
                     num--;
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        ans.reverse();
        return ans.toString();

    }
}