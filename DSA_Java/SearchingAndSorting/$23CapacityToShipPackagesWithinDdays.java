//Leetcode 1011 - https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
class $23CapacityToShipPackagesWithinDdays {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0 ;
        int max = 0 ;
        
        for(int val : weights){
            sum += val ;
            max = Math.max(max, val) ;
        }
        
        int lo = max ;
        int hi = sum ;
        int ans = 0 ;
        
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2 ;
            if(isPossible(weights, days, mid) == true){
                ans = mid ;
                hi = mid - 1 ;
                
            }else{
                lo = mid + 1 ;
                
            }
        }
        return ans ;
    }
    
    public boolean isPossible(int[] weights, int days, int mid){
        int d = 1 ;
        int sum = 0 ;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i] ;
            if(sum > mid){
                sum = weights[i] ;
                d ++ ;
            }
        }
        return d <= days ;
    }
}