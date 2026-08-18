class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;

        int n=row*col;
        int left=0;
        int right=n-1;

        // System.out.println(" row "+ row + " col "+col+ " and the n "+ n+ " -- ");

        while(left<=right){
            int mid=(left+ (right-left)/2);

            
            if(target==matrix[mid/col][mid%col]){
                return true;
            }else if( matrix[mid/col][mid%col]< target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return false;
    }
}
