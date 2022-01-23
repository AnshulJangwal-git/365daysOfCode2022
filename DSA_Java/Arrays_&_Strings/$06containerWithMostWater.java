//Leetcode 11 - https://leetcode.com/problems/container-with-most-water/
import java.util.* ;

class containerWithMostWater {
    int maxArea = -1;
    
    public int maxArea(int[] height) {
        int i = 0 ;
        int j = height.length - 1 ;
        // maxArea = -1 ;
        
        while(i <= j){
            int width = j - i ;
            int length = Math.min(height[i], height[j]) ;
            int area = width * length ;
            
            if(area > maxArea){
                maxArea = area ;
            }
            
            if(height[i] < height[j]){
                i ++ ;
                
            }else if(height[i] > height[j]){
                j -- ;
                
            }else{
                i ++ ;
                //or j -- ; any one of two
            }
        }
        return maxArea ;
    }
}
