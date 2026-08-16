class Solution {
    public int longestConsecutive(int[] nums) {
       
       HashSet<Integer> set = new HashSet<>();
       for(int num: nums){
          set.add(num);
       }
       if(nums.length<2)return nums.length;
       int max=1;
       int currmax=1;
       for(int i=0;i<nums.length;i++){
           if(set.contains(nums[i]-1))
           continue;
           else if( set.contains(nums[i]+1)){
               int k=nums[i]+1;
               while(set.contains(k)){
                k++;
                ++currmax;
                max= Math.max(currmax,max);
               }
               currmax=1;
           }else {
              currmax=1;
           }
       }
       return max;
    }
}
