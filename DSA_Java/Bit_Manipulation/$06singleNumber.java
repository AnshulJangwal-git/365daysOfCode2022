//Leetcode 136 - https://leetcode.com/problems/single-number/
class $06singleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0] ;
        }
        
        int val = 0 ;
        for(int i = 0; i < nums.length; i++){
            val = val ^ nums[i] ;
        }
        return val ;
    }
}