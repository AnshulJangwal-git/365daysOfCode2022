// Leetcode 1673 - https://leetcode.com/problems/find-the-most-competitive-subsequence/
class $32FindMostCompetitiveSubsequence {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st = new Stack<>() ;
        int n = nums.length ;
        
        for(int i = 0; i < n; i++){
            // int val = nums[i] ;
            while(st.size() > 0 && nums[i] < st.peek() && n - i - 1 >= k - st.size()){
                st.pop() ;
            }
            
            if(st.size() < k){
                st.push(nums[i]) ;
            }
        }
        int[] ans = new int[k] ;
        int i = k - 1 ;
        while(i >= 0) ans[i --] = st.pop() ;
        
        return ans ;
    }
}