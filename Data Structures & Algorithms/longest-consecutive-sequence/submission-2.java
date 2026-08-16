class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);

        int max=1;
        int currmax=1;
        if(nums.length<2)return nums.length;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                continue;
            }else if( nums[i]-nums[i-1]==1){
                ++currmax;
                max=Math.max(max,currmax);
            }
            else{
                currmax=1;
            }
        }
        return max;
    }
}
