class Solution {
    public boolean isValidSudoku(char[][] board) {

         for(int i=0;i<9;i++){
            int[] check = new int[10];
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.')continue;
                int n= ch- '0';
                check[n]++;
                if(check[n]>1)return false;
            }
         }
         
         for(int i=0;i<9;i++){
            int[] check = new int[10];
            for(int j=0;j<9;j++){
                 char ch=board[j][i];
                 if(ch=='.')continue;
                 int n= ch- '0';
                check[n]++;
                if(check[n]>1)return false;
            }
         }
         for(int k=0;k<7;k+=3){
            for(int i=0;i<7;i+=3){
                int[] check = new int[10];
                for(int m=k;m<k+3;m++){
                    for(int n=i;n<i+3;n++){
                        char ch=board[m][n];
                        if(ch=='.')continue;
                        int g= ch- '0';
                        check[g]++;
                        if(check[g]>1)return false;
                    }
                }
            }
         }
         return true;
    }
}
