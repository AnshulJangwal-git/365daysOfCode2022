//Leetcode 239 - https://leetcode.com/problems/sliding-window-maximum/
class $06SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length ;
        Stack<Integer> st = new Stack<>() ;
        int[] nge = new int[nums.length] ;
        st.push(nums.length - 1) ;
        nge[n - 1] = Integer.MAX_VALUE ;
        
        for(int i = nums.length - 2; i >= 0; i--){
            while(st.size() > 0 && nums[i] >= nums[st.peek()]){
                st.pop() ;
            }
            
            if(st.size() == 0){
                nge[i] = Integer.MAX_VALUE ;
            }else{
                nge[i] = st.peek() ;
            }
            st.push(i) ;
        }
        
        int j = 0 ;
        List<Integer> list = new ArrayList<>() ;
        for(int i = 0; i <= nums.length - k; i++){
            if(j < i){
                j = i ;
            }
            
            while(nge[j] < i + k){
                j = nge[j] ;
            }
            list.add(nums[j]) ;
        }
        int ans[] = new int[list.size()] ;
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i) ;
        }
        return ans ;
    }
}
