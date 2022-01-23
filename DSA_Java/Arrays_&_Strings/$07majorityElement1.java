import java.util.* ;

class $07majorityElement1 {
    
    public int majorityElement(int[] nums) {
        int val = validCandidate(nums) ;
        int freq = 0 ;
        
        for(int ele : nums){
            if(ele == val){
                freq ++ ;
            }
        }
        if(freq > nums.length / 2){
            return val ;
        }
        
        return -1 ;
    }
    
    public int validCandidate(int[] arr){
        int count = 1 ;
        int val = arr[0] ;
        
        for(int i = 1; i < arr.length; i++){
            if(val == arr[i]){
                //same element with previous, increment in count of valid candidate
                count ++ ;
                
            }else{
                //mapping of distinct elements..
                count -- ;
            }
            
            if(count == 0){
                val = arr[i] ;
                count = 1 ;
            }
            
        }
        return val ;
    }
    
    
}
