//Leetcode 34 - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class $12findFirstAndLastPositionInASortedArray { //Time Complexity - O(n)
    public int[] searchRange(int[] arr, int target) {
        int si = -1 ;
        int ei = -1 ;

        int i = 0 ;

        while(i < arr.length){
            if(arr[i] == target){
                si = i ;
                break ;
            }
            i ++ ;
        }
        i = arr.length - 1 ;
        while(i >= 0){
            if(arr[i] == target){
                ei = i ;
                break ;
            }
            i -- ;
        }
        int[] ans = new int[2] ;
        ans[0] = si ;
        ans[1] = ei ;
        return ans ;
    }
}


