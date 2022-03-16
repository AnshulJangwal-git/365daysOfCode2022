//Link - https://leetcode.com/problems/power-of-two/

class $23isPowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false ;
        }
        
        int val = (n & (n - 1)) ;
        
        if(val == 0){
            return true ;
            
        }else{
            return false ;
        }
    }
    
}