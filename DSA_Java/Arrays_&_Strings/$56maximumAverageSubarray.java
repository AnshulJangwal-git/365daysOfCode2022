//Leetcode 643 - https://leetcode.com/problems/maximum-average-subarray-i/
// import java.util.* ;
class $56maximumAverageSubarray {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0 ;
        for(int i = 0; i < k; i++){
            sum += nums[i] ;
        }
        
        int max = sum ;
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i] ;
            sum = sum - nums[i - k] ;
            
            max = Math.max(max, sum) ;
        }
        
        return (max * 1d) / k ;
    }
}
