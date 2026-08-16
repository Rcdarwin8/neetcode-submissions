class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
        return false;
    }

         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
         for( int i=0;i<s.length(); i++){  
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
         }
         for( int i=0;i<t.length(); i++){
            map.merge(t.charAt(i),-1,(oldvalue,decrement)->{
                int newval= oldvalue + decrement;
                return newval == 0 ? null : newval;
            });
         }

         if(map.isEmpty()){
            return true;
         }
         return false;
    }
}
