class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashMap<Integer,Boolean> hash = new HashMap<Integer,Boolean>();
        for(int i=0;i<nums.length; i++){
            if(hash.get(nums[i])!=null){
                return true;
            }else{
                hash.put(nums[i],true);
            }
        }
        return false;
    }
}