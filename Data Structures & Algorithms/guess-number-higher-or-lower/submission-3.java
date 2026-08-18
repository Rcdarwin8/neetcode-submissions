/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left=1;
        int right=n;

        int mid=0;
        while(left<=right){
            mid = left + (right - left) / 2;
            // System.out.println(mid);
            if(guess(mid)==0){
                // System.out.println(" at 0 ");
                return mid;
            }else if(guess(mid)==1){
                // System.out.println(" at mid > "+ mid +" - ");
                left=mid+1;
            }else{
                // System.out.println(" at mid < "+ mid +" - ");
                right=mid-1;
            }
        }
        return mid;
    }
}