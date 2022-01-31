//Link - https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
class $30ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length ;
        int ei = -1 ;
        
        int max = nums[0] ;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < max){
                ei = i ;
                
            }else{
                max = nums[i] ;
                
            }
        }
        
        int si = 0 ;
        int min = nums[n - 1] ;
        for(int i = n - 2; i >= 0; i--){
            if(nums[i]  > min){
                si = i ;
                
            }else{
                min = nums[i] ;
                
            }
        }
        
        return ei - si + 1 ;
    }
}