/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class $33guessNumberHigherOrLower {
    public int guessNumber(int n) {
        int lo = 1 ;
        int hi = n ;
        
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2 ;
            if(guess(mid) == 0){
                return mid ;
                
            }else if(guess(mid) == -1){
                hi = mid - 1 ;
                
            }else{
                lo = mid + 1 ;
                
            }
        }
        return 0 ;
    }
    //InBuilt Function given in the question itself..
    public int guess(int n){
        return -1 ;
    }
}