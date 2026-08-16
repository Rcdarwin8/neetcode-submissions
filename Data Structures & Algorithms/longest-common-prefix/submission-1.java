class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans= strs[0];
        if( strs.length<2){
            return strs[0];
        }
        int flag=0;
        int min=strs[0].length();
        for ( int i=1; i< strs.length; i++ ){
             min= Math.min(min,strs[i].length());
             for( int j=0;j<min;j++){
                if(ans.charAt(j)!=strs[i].charAt(j)){
                    min=j;
                    break;
                }
                flag=1;
             } 
        }
        if(flag==0)return "";
        if(min==0) return ans.substring(0,0);
        System.out.println(min);
        return ans.substring(0,min);
    }
}