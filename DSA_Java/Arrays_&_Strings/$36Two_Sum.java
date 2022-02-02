//Link - https://leetcode.com/problems/two-sum/
import java.util.* ;

class $36Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>() ;
        
        for(int i = 0; i < nums.length; i++){
            int req = target - nums[i] ;
            
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]), i} ;   
            }
            map.put(req, i) ;
        }
        
        return new int[]{} ;
    }
}