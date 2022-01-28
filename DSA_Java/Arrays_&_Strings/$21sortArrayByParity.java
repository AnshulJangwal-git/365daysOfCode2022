//Link - https://leetcode.com/problems/sort-array-by-parity/

class $21sortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length <= 1){
            return nums ;
        }
        
        int i= 0 ;
        int j = 0 ;
        
        while(i < nums.length){
            if(nums[i] % 2 == 1){
                i ++ ;
                
            }else{
                //swap
                int temp = nums[i] ;
                nums[i] = nums[j] ;
                nums[j] = temp ;
                
                i ++ ;
                j ++ ;
            }
        }
        
        return nums ;
    }
}
