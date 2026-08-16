class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n<2) return 0;
        int lefthigh=height[0];
        int righthigh=height[n-1];
        int left=0;
        int right=n-1;
        int ans=0;
        while(left<right){
            if(lefthigh<righthigh){
                 left++;
                 while(lefthigh>height[left]){
                      ans+=lefthigh-height[left];
                      left++;
                 }
                 lefthigh=height[left];
            }else{
                right--;
                while(righthigh>height[right]){
                     ans+=righthigh-height[right];
                     right--;
                }
                righthigh=height[right];
            }
        }
        return ans;
    }
}
