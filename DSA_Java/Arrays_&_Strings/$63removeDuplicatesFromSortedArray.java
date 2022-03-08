//Leetcode 26 - https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class $removeDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int res = 1 ;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[res - 1]){
                nums[res] = nums[i] ;
                res ++ ;
            }
        }
        return res ;
    }
}