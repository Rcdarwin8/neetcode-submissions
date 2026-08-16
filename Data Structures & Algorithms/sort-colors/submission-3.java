class Solution {
    public void sortColors(int[] nums) {
        
        int zero=0;
        int two=nums.length-1;

        for(int i=0;i<=two;i++){
             while(nums[i]==2 && i<=two){
                int temp=nums[two];
                nums[two]=2;
                nums[i]=temp;
                two--;
            }
            if(nums[i]==0){
                int temp=nums[zero];
                nums[zero]=0;
                nums[i]=temp;
                zero++;
            }
           

        }
        


    }
}