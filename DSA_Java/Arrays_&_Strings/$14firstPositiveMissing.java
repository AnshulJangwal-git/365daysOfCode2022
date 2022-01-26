//Leetcode 41 - https://leetcode.com/problems/first-missing-positive/

class $14firstPositiveMissing {
    
    public int firstMissingPositive(int[] arr) {
        //step1 : Mark the elements out of range and manage the presence of '1'..
        boolean isOnePresent = false ;
        int n = arr.length ;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1){
                isOnePresent = true ;
            }
            
            if(arr[i] < 1 || arr[i] > n){
                arr[i] = 1 ; //marked as '1'
            }
        }
        
        if(!isOnePresent){
            return 1 ; //one was not present so one is the first (+)ve missing only..
        }
        
        //step 2 - Map the idx to negative one
        
        for(int i = 0; i < n; i++){
            int idx = Math.abs(arr[i]) ;
            arr[idx - 1] = -Math.abs(arr[idx - 1]) ;
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                return i + 1 ;
            }
        }
        return n + 1 ;
    }
}