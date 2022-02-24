//Leetcode 410 - https://leetcode.com/problems/split-array-largest-sum/
class $22splitArrayLargestSum {
    public int splitArray(int[] nums, int m) {
        int sum = 0 ;
        int max = 0 ;
        int ans = 0 ;
        
        for(int val : nums){
            max = Math.max(max, val) ;
            sum += val ;
        }
        if(m == nums.length){
            return max ;
        }
        
        int lo = max ;
        int hi = sum ;
        
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2 ;
            if(isPossible(nums, mid, m) == true){
                ans = mid ;
                hi = mid - 1 ;
                
            }else{
                lo = mid + 1 ;
            }
        }
        return ans ;
    }
    
    public boolean isPossible(int[] nums, int mid, int m){
        int sum = 0 ;
        int sa = 1 ;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i] ;
            if(sum > mid){
                sa ++ ;
                sum = nums[i] ;
            }
        }
        return sa <= m ;
    }
}