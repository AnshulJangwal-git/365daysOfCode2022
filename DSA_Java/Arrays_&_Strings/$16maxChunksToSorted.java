//Leetcode 769 - https://leetcode.com/problems/max-chunks-to-make-sorted/

public class $16maxChunksToSorted {
    public int maxChunksToSorted(int[] arr) {
        int max = 0 ;
        int count = 0 ;
        
        for(int i = 0; i < arr.length; i++){
            max = Math.max(arr[i], max) ;
            if(i == max){
                count ++ ;        
            }
        }
        
        return count ;
    }
}

