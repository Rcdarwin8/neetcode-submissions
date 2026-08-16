class Solution {
    public int maxArea(int[] heights) {
        int max=0;
        int l=0;
        int r=heights.length-1;
        while(l<r){
            if(heights==null || heights.length <= 1) 
            return 0;
            int w=r-l;
            int minh= Math.min(heights[l],heights[r]);
            int water= w*minh;
            max=Math.max(water,max);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return max;
    }
}
