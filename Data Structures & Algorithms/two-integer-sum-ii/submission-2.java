class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        // int sum=0;
        
        while(l<r){
            if(numbers[l]+numbers[r]==target){
               break;
            }
            else if(numbers[l]+numbers[r]>target){
                r--;
            }else{
                l++;
            }
        }
        int[] ans={l+1,r+1};
        return ans;
    }
}
