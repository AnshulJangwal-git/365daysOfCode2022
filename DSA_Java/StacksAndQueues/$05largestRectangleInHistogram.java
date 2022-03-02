//Leetcode 84 - https://leetcode.com/problems/largest-rectangle-in-histogram/
class $05largestRectangleInHistogram {
    public int largestRectangleArea(int[] arr) {
        int n = arr.length ;
        int[] lb = new int[n] ; 
        Stack<Integer> st = new Stack<>() ;
        st.push(0) ;
        lb[0] = -1 ;
        
        for(int i = 1; i < arr.length; i++){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop() ;
            }
            if(st.size() == 0){
                lb[i] = -1 ;
            }else{
                lb[i] = st.peek() ;
                
            }
            st.push(i) ;
        }
        
        
        int[] rb = new int[n] ;
        st = new Stack<>() ;
        st.push(n - 1) ;
        rb[n - 1] = n ;
        
        for(int i = arr.length - 2; i >= 0; i--){
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop() ;
            }
            if(st.size() == 0){
                rb[i] = arr.length ;
                
            }else{
                rb[i] = st.peek() ;
            }
            st.push(i) ;
        }
        
        //area
        int maxArea = 0 ;
        for(int i = 0; i < arr.length; i++){
            int width = rb[i] - lb[i] - 1 ;
            int area = arr[i] * width ;
            
            if(area > maxArea){
                maxArea = area ;
            }
        }
        return maxArea ;
    }
}