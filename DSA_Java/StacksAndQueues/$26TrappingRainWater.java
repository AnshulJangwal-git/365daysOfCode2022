// Leetcode 42 - https://leetcode.com/problems/trapping-rain-water/
class $26TrappingRainWater {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>() ;
        int ans = 0 ;
        
        for(int i = 0; i < height.length; i++){
            while(st.size() > 0 && height[st.peek()] <= height[i]){
                int rightMax = i ;
                int currHeight = height[st.pop()] ;
                if(st.size() == 0)
                    break ;
                
                int leftMax = st.peek() ;
                int width = rightMax - leftMax - 1 ;
                
                ans += (Math.min(height[rightMax], height[leftMax]) - currHeight) * width ;
            }
            st.push(i) ;
        }
        return ans ;
    } 
    
}