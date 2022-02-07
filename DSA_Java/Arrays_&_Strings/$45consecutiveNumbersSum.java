//Leetcode 829 - https://leetcode.com/problems/consecutive-numbers-sum/
import java.util.* ;

class $45consecutiveNumbersSum {
    public int consecutiveNumbersSum(int n) {
        int count = 0 ;
        for(int k = 1; 2 * n > (k * (k - 1)); k++){
            int num = n - (k * (k - 1) / 2) ;
            if(num % k == 0){
                count ++ ;
            }
        }
        return count ;
    }
    
}
