class Solution {
    public int mySqrt(int x) {
        int left=1;
        int right=x/2;
        int result=1;
        if(x==0)return 0;
        if(x==1)return 1;
        while(left<=right){
            int mid=left+ (right-left)/2;
            long prod=(long) mid*mid;
            if((prod)==x){
                return mid;
            }else if(prod < x){
                result=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        // if(left*left>x)return left-1;
        return result;
    }
}