class NumMatrix {
    private int[][] dp;
    public NumMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        dp= new int[r+1][c+1];
        
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                dp[i][j]=matrix[i-1][j-1]+dp[i-1][j]+dp[i][j-1]-dp[i-1][j-1];
                // System.out.print(dp[i][j]+" ");
            }
        // System.out.println("\n");
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum=dp[row2+1][col2+1]-dp[row1][col2+1]-dp[row2+1][col1]+dp[row1][col1];
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */