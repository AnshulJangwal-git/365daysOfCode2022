//Leetcode 442 - https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.* ;
class $43findAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>() ;
        
//         HashMap<Integer, Integer> map = new HashMap<>() ;
//         for(int i = 0; i < nums.length; i++){
//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1) ;
            
//         }
//         for(int key : map.keySet()){
//             if(map.get(key) > 1){
//                 ans.add(key) ;
                
//             }
//         }
        
        for(int i = 0; i < nums.length; i++){
            int idx = Math.abs(nums[i]) - 1 ;
            int val = nums[idx] ;
            
            if(val > 0){
                nums[idx] *= -1 ;
                
            }else{
                ans.add(idx + 1) ;
            }
        }
        
        return ans ;
    }
}
