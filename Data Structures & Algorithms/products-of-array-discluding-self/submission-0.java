class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans= new int[nums.length];
        int prod=1;
        int zero=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
        }else{
            prod=prod*nums[i];
        }

    }
    for(int i=0;i<nums.length;i++){
      if(zero>1){
        ans[i]=0;
      }else if(zero==1){
         
         if(nums[i]==0)ans[i]=prod;
         else ans[i]=0;
      }
      else{
         ans[i]=prod/nums[i];
      }
    }
    return ans;
 }
}  
