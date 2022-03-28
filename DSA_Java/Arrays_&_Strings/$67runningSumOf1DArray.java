// Leetcode 1480 - https://leetcode.com/problems/running-sum-of-1d-array/
class $67runningSumOf1DArray {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length] ;
        ans[0] = nums[0] ;
        
        int i = 1 ;
        while(i < nums.length){
            ans[i] = nums[i] + ans[i - 1] ; 
            i ++ ;
        }
        
        return ans ;
    }
}