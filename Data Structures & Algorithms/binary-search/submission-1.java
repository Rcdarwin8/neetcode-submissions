class Solution {
    public int search(int[] nums, int target) {
        
        return binarySearch(0,nums.length-1,nums,target); 
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
