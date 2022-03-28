// Leetcode 1929 - https://leetcode.com/problems/concatenation-of-array/
class $65concatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length ;
        int[] ans = new int[2 * nums.length] ;
        
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i] ;
            ans[n + i] = nums[i] ;
        }
              
        return ans ;
    }
}