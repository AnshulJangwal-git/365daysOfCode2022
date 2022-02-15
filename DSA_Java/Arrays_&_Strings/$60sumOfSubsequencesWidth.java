//Leetcode 891 - https://leetcode.com/problems/sum-of-subsequence-widths/
import java.util.* ;

class $60sumOfSubsequencesWidth {
    public int sumSubseqWidths(int[] nums) {
        Arrays.sort(nums) ;
        long ans = 0 ;
        int mod = 1000000007 ;
        int n = nums.length ;
        long[] pow = new long[n] ;
        
        pow[0] = 1 ;
        for(int i = 1; i < nums.length; i++){
            pow[i] = pow[i - 1] * 2 % mod;
        }
        
        for(int i = 0; i < n; i++){
            ans = (ans + nums[i] * (pow[i] - pow[n- i - 1])) % mod ;
        }
        
        return (int)ans % mod ;
    }
}