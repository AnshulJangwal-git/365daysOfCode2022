//Leetcode.1679 - https://leetcode.com/problems/max-number-of-k-sum-pairs/
import java.util.* ;
class $41_maxNumberOfKsumPairs {
    public int maxOperations(int[] nums, int target) {
        int n = nums.length ;
        if(n < 2){
            return 0 ;
        }
        List<List<Integer>> ans = new ArrayList<>() ;
        
        Arrays.sort(nums) ;
        
        int left = 0 ;
        int right = n - 1 ;
        int count = 0 ;
        
        while(left < right){
            // if(left != 0 && nums[left] == nums[left - 1]){
            //     left ++ ;
            //     continue ;
            // }
            
            int sum = nums[left] + nums[right] ;
            if(sum > target){
                right -- ;
                
            }else if(sum < target){
                left ++ ;
                
            }else{
                // count ++ ;
                List<Integer> subAns = new ArrayList<>() ;
                subAns.add(nums[left]) ;
                subAns.add(nums[right]) ;
                ans.add(subAns) ;
                
                left ++ ;
                right -- ;
            }
        }
        return ans.size() ;
    }
}