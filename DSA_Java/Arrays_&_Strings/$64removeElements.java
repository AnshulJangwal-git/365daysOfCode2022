//Leetcode 27 - https://leetcode.com/problems/remove-element/
import java.util.* ;
class $64removeElements {
    public int removeElement(int[] nums, int val) {
        Stack<Integer> st = new Stack<>() ;
        for(int x : nums){
            if(x != val){
                st.push(x) ;
            }
        }
        // Arrays.fill(nums, 0) ;
        int ans = st.size() ;
        int i = 0 ;
        while(st.size() != 0){
            nums[i] = st.pop() ;
            i += 1 ;
        }
        
        return ans ;
    }
}
