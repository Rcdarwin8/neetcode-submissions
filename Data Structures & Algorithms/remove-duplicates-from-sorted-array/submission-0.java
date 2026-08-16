class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex=1;
        int prev=nums[0];
        for(int i=1;i<nums.length;i++){
            if(prev!=nums[i]){
                prev=nums[i];
                nums[uniqueIndex]=nums[i];
                ++uniqueIndex;
            }
        }
        return uniqueIndex;
    }
}