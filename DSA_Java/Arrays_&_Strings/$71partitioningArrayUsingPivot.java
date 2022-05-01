// Leetcode 2161 - https://leetcode.com/problems/partition-array-according-to-given-pivot/
class $71partitioningArrayUsingPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int j = 0 ;
        int k = nums.length ;
        int[] ans = new int[nums.length] ;
        
        for(int i = 0; i < k; i++){
            if(nums[i] < pivot){
                ans[j++] = nums[i] ;
            }
        }
        
        for(int i = 0; i < k; i++){
            if(nums[i] == pivot) ans[j++] = nums[i] ;
        }
        
        for(int i = 0; i < k; i++){
            if(nums[i] > pivot) ans[j++] = nums[i] ;
        }
        return ans ;
    }
}