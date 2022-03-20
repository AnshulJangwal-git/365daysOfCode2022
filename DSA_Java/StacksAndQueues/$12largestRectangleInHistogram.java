// Link - https://leetcode.com/problems/largest-rectangle-in-histogram/
class $12largestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>() ;
        int maxArea = 0 ;
        st.push(-1) ;
        
        for(int i = 0; i <= heights.length; i++){
            int val = i == heights.length ? 0 : heights[i] ;
            
            while(st.peek() != -1 && val <= heights[st.peek()]){
                int rmin = i ;
                int h = heights[st.pop()] ;
                int lmin = st.peek() ;
                int area = h * (rmin - lmin - 1) ;
                maxArea = Math.max(maxArea, area) ;
            }
            st.push(i) ;
        }
        return maxArea ;
    }
    
    
}

