
import java.util.* ;
class $11productofArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {
        //Create a right product array
        int product = 1 ;
        int[] right = new int[nums.length] ;
        
        for(int i = nums.length - 1; i >= 0; i--){
            product = product * nums[i] ;
            right[i] = product ;
        }
        
        //fill the ans array by maintaining left product
        product = 1 ;
        int[] ans = new int[nums.length] ;
        
        for(int i = 0; i < nums.length - 1; i++){
            int lp = product ;
            int rp = right[i + 1] ;
            ans[i] = lp * rp ;
            
            product *= nums[i] ;
        }
        
        ans[nums.length - 1] = product ;
        
        return ans ;
    }
    
    
}






