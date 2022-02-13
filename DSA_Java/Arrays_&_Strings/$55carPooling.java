//Leetcode 104 - https://leetcode.com/problems/car-pooling/
import java.util.* ;
class $55carPooling {
    public boolean carPooling(int[][] trips, int capacity) {
        int lastDrop = -1 ;
        for(int[] trip : trips){
            lastDrop = Math.max(lastDrop, trip[2]) ;
        }
        int[] arr = new int[lastDrop + 1] ;
        for(int[] trip : trips){
            arr[trip[1]] += trip[0] ;
            arr[trip[2]] -= trip[0] ;
        }
        
        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i - 1] ;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > capacity)
                return false ;
            
        }
        return true ;
    }
    
}
