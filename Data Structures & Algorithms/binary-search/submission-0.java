class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int ind=binarySearch(left,right,nums,target);
        // if(ind==-1){
        //     return -1;
        // }else{
            return ind;
        // }
    }
    int binarySearch(int left,int right, int[] nums,int target){
        if(left>right){
            // if(target!=nums[left]){
                return -1;
            // }
        }
        int mid=(left+right)/2;
        if(target==nums[mid]){
            return mid;
        }
        else if(nums[mid]>target){
            return binarySearch(left,mid-1,nums,target);
        }else{
            return binarySearch(mid+1,right,nums,target);
        }
    }
}
