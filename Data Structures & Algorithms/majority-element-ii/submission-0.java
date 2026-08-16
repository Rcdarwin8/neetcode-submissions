class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int lowlimit=n/3;
        List<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.merge(nums[i],1,(oldvalue , newvalue) ->
                oldvalue + newvalue );
            if(map.get(nums[i])>lowlimit && !ans.contains(nums[i])){
                Integer temp=nums[i];
                ans.add(temp);
            }
        }
        return ans;
    }
}