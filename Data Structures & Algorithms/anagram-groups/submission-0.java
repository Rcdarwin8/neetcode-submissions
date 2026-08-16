class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> map= new HashMap<>();
        for( String str : strs){
            
            int[] ch = new int[26];
            
            for(int i=0; i< str.length(); i++){
                ch[ str.charAt(i)-'a']++;
            }
            
            StringBuilder s = new StringBuilder();
            for(int i=0;i<26 ; i++){
                s.append("#");
                s.append(ch[i]);
            }

            String key = s.toString();

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
        }
    }
