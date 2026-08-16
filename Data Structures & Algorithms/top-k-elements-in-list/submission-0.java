class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.merge(i,1,Integer::sum);
        }
     
         TreeMap<Integer,Integer> sortedmap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer key1, Integer key2){
                int compval= map.get(key2).compareTo(map.get(key1));
                if(compval==0){
                    return key2.compareTo(key1);
                }
                return compval;
            }
        });
        sortedmap.putAll(map);
        int[] ans= new int[k];
        int i=0;
        for (Integer value : sortedmap.keySet()) {
            ans[i]=value;
            i++;
            if(i==k)break;
        } 
        return ans;
    }
}
