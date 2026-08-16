class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left=0;
        int right=0;
        int maxsize=0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(right<s.length()){
            //putting right char to map
            char t=s.charAt(right);
            map.merge(t,1,Integer::sum);
            
            if(map.get(t)>1){
                while(s.charAt(left)!=t){
                    map.merge(s.charAt(left),-1,Integer::sum);
                    left++;
                }
                if(s.charAt(left)==t){
                    map.merge(s.charAt(left),-1,Integer::sum);
                    left++;
                }
            }
            maxsize=Math.max(right-left+1,maxsize);
            right++;

        }
        return maxsize;

    }
}
