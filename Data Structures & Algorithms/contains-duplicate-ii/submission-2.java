class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int temp=k;
        for(int i=0;i<nums.length; i++){
            
            map.merge(nums[i],1,Integer::sum);
            if(map.get(nums[i])>1)return true;
            k--;
            if(k<0){
                map.merge(nums[i-temp],-1,Integer::sum);
                k++;
            }       
        }
        return false;

    }
}