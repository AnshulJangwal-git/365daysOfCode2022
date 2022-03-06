//Leetcode 260 - https://leetcode.com/problems/single-number-iii/
class $07singleNumber3 {
    public int[] singleNumber(int[] nums) {
        int xxory = 0 ;
        for(int val : nums){
            xxory = xxory ^ val ;
        }
        int rsbm = xxory & -xxory ;
        
        int x = 0 ;
        int y = 0 ;
        for(int val : nums){
            if((rsbm & val) == 0){
                x = x ^ val ;
                
            }else{
                y = y ^ val ;
            }
        }
        int[] ans = new int[2] ;
        ans[0] = x ;
        ans[1] = y ;
        
        return ans ;
    }
}
