class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int lowlimit=n/3;
        List<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.merge(nums[i],1,(oldvalue , newvalue) ->
                oldvalue + newvalue );
            
        }
        for ( Integer num : map.keySet()){
              if(map.get(num)>lowlimit){
                ans.add(num);
              }
        }
        return ans;
    }
}