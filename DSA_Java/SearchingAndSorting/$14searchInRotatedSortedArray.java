//Leetcode 33 - https://leetcode.com/problems/search-in-rotated-sorted-array/
class $14searchInRotatedSortedArray {
    public int search(int[] arr, int target) {
        int lo = 0 ;
        int hi = arr.length - 1 ;
        
        while(lo <= hi){
            int mid = (lo + hi) / 2 ;
            if(arr[mid] == target){
                return mid ;
                
            }else if(arr[lo] <= arr[mid]){
                //lo to mid part is sorted..
                if(target >= arr[lo] && target < arr[mid]){
                    hi = mid - 1 ;
                    
                }else{
                    lo = mid + 1 ;
                    
                }
            }else if(arr[mid] <= arr[hi]){
                if(target > arr[mid] && target <= arr[hi]){
                    lo = mid + 1 ;
                    
                }else{
                    hi = mid - 1 ;
                    
                }
            }
        }
        return -1 ;
    }
}
