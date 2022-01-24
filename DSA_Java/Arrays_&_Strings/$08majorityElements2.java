//Leetcode 229 - https://leetcode.com/problems/majority-element-ii/
import java.util.* ;
class $08majorityElements2 {
    
    public List<Integer> majorityElement(int[] arr) {
        int val1 = arr[0] ;
        int count1 = 1 ;
        
        int val2 = arr[0] ;
        int count2 = 0 ;
        
        int i = 1 ;
        
        while(i < arr.length){
            if(arr[i] == val1){
                count1 ++ ;
                
            }else if(arr[i] == val2){
                count2 ++ ;
                
            }else{
                if(count1 == 0){
                    val1 = arr[i] ;
                    count1 = 1 ;
                    
                }else if(count2 == 0){
                    val2 = arr[i] ;
                    count2 = 1 ;
                    
                }else{
                    count1 -- ;
                    count2 -- ;
                }
            }
            i++ ;
        }
        
        //val1 and va2 are potential candidates...
        List<Integer> ans = new ArrayList<>() ;
        if(isFreqValid(arr, val1) == true){
            ans.add(val1) ;
            
        }
        
        if(val1 != val2 && isFreqValid(arr, val2) == true){
            ans.add(val2) ;
            
        }
        return ans ;
    }
    
    public boolean isFreqValid(int[] arr, int val){
        int fq = 0 ;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                fq ++ ;
            }
        }
        if(fq > arr.length / 3){
            return true ;
            
        }else{
            return false ;
        }
    }
    
}










