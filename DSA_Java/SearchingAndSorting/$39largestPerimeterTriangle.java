//Leetcode 976 - https://leetcode.com/problems/largest-perimeter-triangle/
import java.util.* ;
class $39largestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums) ;
        int i = nums.length - 1 ;
        int perimeter = 0 ;
        
        while(i >= 2){
            if(nums[i - 1] + nums[i - 2] > nums[i]){
                perimeter = nums[i - 1] + nums[i - 2] + nums[i] ;
                break ;
            }else{
                i -- ;
            }
        }
        return perimeter ;
    }
}