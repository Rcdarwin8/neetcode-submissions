class Solution {
    
    public boolean checkIfPalindrome(String s,int left,int right){
        while(left<right){
            if( Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
               return false;
            }
            left++;
            right--;
      }
      return true;
    }
    public boolean validPalindrome(String s) {
        
        int left=0;
        int right=s.length()-1;
        int count=0;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            
           if( Character.toLowerCase(s.charAt(left))!= Character.toLowerCase(s.charAt(right))){
               return checkIfPalindrome(s,left+1,right) || checkIfPalindrome(s,left,right-1);
            
           }
           left++;
           right--;
        }
        return true;
   }
}