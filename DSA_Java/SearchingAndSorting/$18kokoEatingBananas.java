//Leetcode 875 - https://leetcode.com/problems/koko-eating-bananas/
class $18kokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE ;
        for(int val : piles){
            max = Math.max(val, max) ;
        }
        if(h == piles.length){
            return max ;
        }
        int lo = 0 ;
        int hi = max ;
        
        int speed = Integer.MAX_VALUE ;
        
        while(lo <= hi){
            int mid = lo + (hi - lo)/2 ;
            if(isPossible(piles, h, mid) == true){
                speed = mid ;
                hi = mid - 1 ;
                
            }else{
                lo = mid + 1 ;
                
            }
        }
        return speed ;
    }
    
    public boolean isPossible(int[] piles, int h, int mid){
        int time = 0;
        for(int i = 0; i < piles.length; i++){
            time += (int)Math.ceil(piles[i]*1.0 / mid) ;
        }
        if(time <= h){
            return true ;
            
        }
        return false ;
    }
    
} 