class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int[] freqS1= new int[26];
        int[] freqS2= new int[26];
        int l1=s1.length();
        int l2=s2.length();

        if(l1>l2) return false;
        
        for(int i=0;i<s1.length();i++){
             freqS1[s1.charAt(i)-'a']++;
             freqS2[s2.charAt(i)-'a']++;
        }
        boolean bool=true;
         for(int k=0;k<26;k++){
             if(freqS1[k]!=freqS2[k]){
                bool=false;
                break;
            }
         }
         if(bool){
            return true;
         }
    
        for(int i=l1;i<s2.length();i++){
                ++freqS2[s2.charAt(i)-'a'];
                freqS2[s2.charAt(i-(l1))-'a']--;
                bool=true;
                 for(int k=0;k<26;k++){
                     if(freqS1[k]!=freqS2[k]){
                        bool=false;
                        break;
                     }
                 }
                 if(bool){
                    return true;
                 }
                 System.out.println(s2.charAt(i-(l1))+ " print -- "+i+" ");
            
        }
        return false;
    }
}
