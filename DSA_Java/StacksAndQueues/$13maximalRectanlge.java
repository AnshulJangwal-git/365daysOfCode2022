// Leetcode 85 - https://leetcode.com/problems/maximal-rectangle/

class Solution {
    public int $13maximalRectangle(char[][] mat) {
        int[][] arr = new int[mat.length][mat[0].length] ;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                char c = mat[i][j] ;
                //char to int
                arr[i][j] = Integer.parseInt(String.valueOf(c)) ;
            }
        }
        
        int[] heights = new int[arr[0].length] ;
        
        for(int j = 0; j < arr[0].length; j++){
            heights[j] = arr[0][j] ;
        }
        int area = largestAreaHistogram(heights) ;
        
        for(int i = 1; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == 1){
                    heights[j] += 1 ;
                    
                }else{
                    heights[j] = 0 ;
                    
                }
            }
            area = Math.max(area, largestAreaHistogram(heights)) ;
        }
        return area ;
    }
    
    public int largestAreaHistogram(int[] heights){
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
                maxArea = Math.max(area, maxArea) ;
            }
            st.push(i) ;
        }
        return maxArea ;
    }
    
}