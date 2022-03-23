// Leetcode 456 - https://leetcode.com/problems/132-pattern/
class $22_132Pattern {
    public boolean find132pattern(int[] nums) {
        int n = nums.length ;
        int[] min = new int[nums.length] ;
        min[0] = nums[0] ;
        
        for(int i = 1; i < nums.length; i++){
            min[i] = Math.min(nums[i], min[i - 1]) ;    
        }
        
        Stack<Integer> st = new Stack<>() ;
        boolean flag = false ;
        
        for(int j = n - 1; j >= 0; j--){
            while(st.size() > 0 && st.peek() <= min[j]){
                st.pop() ;
            }
            
            if(st.size() > 0 && st.peek() < nums[j]){
                flag = true ;
                break ;
            }
            st.push(nums[j]) ;
        }
        return flag ;
    }
}