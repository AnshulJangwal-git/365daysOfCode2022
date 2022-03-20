// Leetcode 503 - https://leetcode.com/problems/next-greater-element-ii/
class $11nextGreaterElement2 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length ;
        Stack<Integer> st = new Stack<>() ;
        
        for(int i = n - 2; i >= 0; i--){
            while(st.size() > 0 && nums[i] >= st.peek()){
                st.pop() ;
            }    
            
            st.push(nums[i]) ;
        }
        
        int[] nge = new int[n] ;
        for(int i = n - 1; i >= 0; i--){
            while(st.size() > 0 && nums[i] >= st.peek()){
                st.pop() ;
            }
            
            if(st.size() != 0){
                nge[i] = st.peek() ;
                
            }else{
                nge[i] = -1 ;
            }
            st.push(nums[i]) ;
        }
        return nge ;
    }
    
}
