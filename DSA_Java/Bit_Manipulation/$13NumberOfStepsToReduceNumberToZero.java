//Link - https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
class $13NumberOfStepsToReduceNumberToZero {
    public int numberOfSteps(int n) {
        int ans = 0 ;
        
        while(n != 0){
            if((n % 2) == 0){
                n = n / 2 ;
                
            }else if((n % 2) == 1){
                n = n - 1 ;
            }
            ans ++ ;
        }
        return ans ;
    }
}