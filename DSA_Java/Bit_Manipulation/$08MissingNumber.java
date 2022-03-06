//Leetcode 268 - https://leetcode.com/problems/missing-number/

class $08MissingNumber {
    public int missingNumber(int[] nums) {
        int xxor = 0 ;
        for(int i = 0; i < nums.length; i++){
            xxor = xxor ^ nums[i] ;
        }
        
        for(int i = 0; i <= nums.length; i++){
            xxor = xxor ^ i ;
        }
        
        return xxor ;
    }
}
