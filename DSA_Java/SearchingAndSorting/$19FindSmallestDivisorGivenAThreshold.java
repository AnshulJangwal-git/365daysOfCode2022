//Leetcode 1283 - https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/
class $19FindSmallestDivisorGivenAThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE ;
        for(int val : nums){
            max = Math.max(max, val) ;
        }
        
        if(threshold == nums.length){
            return max ;
        }
        
        int lo = 1 ;
        int hi = max ;
        int divisor = Integer.MAX_VALUE ;
        
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2 ;
            if(isValid(nums, threshold, mid) == true){
                divisor = mid ;
                hi = mid - 1 ;
                
            }else{
                lo = mid + 1 ;
                
            }
        }
        return divisor ;
    }
    
    public boolean isValid(int[] nums, int threshold, int mid){
        int sum = 0 ;
        for(int i = 0; i < nums.length; i++){
            sum += (int)Math.ceil(nums[i]*1.0/ mid) ;
        }
        return sum <= threshold ;
    }
}