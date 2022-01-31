//Link - https://leetcode.com/problems/wiggle-sort-ii/
import java.util.* ;

class $33wiggleSort2 {
    public void wiggleSort(int[] nums) {
        int n = nums.length ;
        Arrays.sort(nums) ;
        
        int[] res = new int[n] ;
        int i = 1 ;
        int j = n - 1 ;
        
        while(i < n){
            res[i] = nums[j] ;
            i += 2 ;
            j -- ;
        }
        
        i = 0 ;
        while(i < n){
            res[i] = nums[j] ;
            i += 2 ;
            j -- ;
        }
        
        for(int k = 0; k < n; k++){
            nums[k] = res[k] ;
        }
    }
    
    
} 
