class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left=0;
        int right=0;
        int sum=0;
        int totalsum=0;
        for( int n: nums){
            totalsum+=n;
        }
        if(totalsum<target) return 0;

        int minLen=Integer.MAX_VALUE;
        while(right<nums.length){
            
            if(sum<target){
                sum+=nums[right];
                // System.out.println(" adding " +nums[right]+" at ind - "+right);
                right++;
            }else{
                minLen=Math.min(minLen,right-left);
                // System.out.println(" removing "+ nums[left]+" at ind - "+left);
                // System.out.println(" minLen "+ minLen);
                sum-=nums[left];
                left++;
            }
        }
                // System.out.println(" minLen "+ minLen+" the left -- "+left+" right "+ right);
        
        while(left<nums.length){
            if(sum>=target){
                minLen=Math.min(minLen,right-left);
                sum-=nums[left];
              

            }
            left++;
        }
        return minLen;
    }
}