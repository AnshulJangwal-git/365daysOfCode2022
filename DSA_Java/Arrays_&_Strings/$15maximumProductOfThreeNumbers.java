//Leetcode 628 - https://leetcode.com/problems/maximum-product-of-three-numbers/
class Solution {
    public int $15maximumProductOfThreeNumberst(int[] nums) {
        // int n = nums.length ;
        
//         Arrays.sort(nums) ; // O(nlog(n))
//         int min1 = nums[0] ;
//         int min2 = nums[1] ;
        
//         int max1 = nums[n - 1] ;
//         int max2 = nums[n - 2] ;
//         int max3 = nums[n - 3] ;
        
        int min1 = Integer.MAX_VALUE ;
        int min2 = min1 ;
        
        int max1 = Integer.MIN_VALUE ;
        int max2 = max1 ;
        int max3 = max1 ;
        
        //Here finding min and max are work of O(n) 
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= max1){
                max3 = max2 ;
                max2 = max1 ;
                max1 = nums[i] ;
                
            }else if(nums[i] >= max2){
                max3 = max2 ;
                max2 = nums[i] ;
                
            }else if(nums[i] >= max3){
                max3 = nums[i] ;
                
            }
            
            if(nums[i] <= min1){
                min2 = min1 ;
                min1 = nums[i] ;
                
            }else if(nums[i] <= min2){
                min2 = nums[i] ;
                
            }
        }
        
        
        return Math.max(min1 * min2 * max1, max1 * max2 * max3) ;
    }
}
