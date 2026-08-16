class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map= new HashMap<>();
        for( int i =0;i<nums.length; i++){
            map.put( nums[i],i);
        }
        int[] ans= new int[2];
        
        for( int i =0;i<nums.length; i++){
            int dec= target- nums[i];
            if(map.get(dec)!=null && i != map.get(dec)){
                // if(map.get(dec)== target/2){
                //     ans[0]= i;
                //     ans[1]=map.get(dec);
                //     return ans;
                // }
                ans[0] = i;
                ans[1] = map.get(dec);
                return ans;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
