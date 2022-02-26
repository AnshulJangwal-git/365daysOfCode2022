//Leetcode 540 - https://leetcode.com/problems/single-element-in-a-sorted-array/
class $34singleElementInSortedArray {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length ;
        if(n == 1 || arr[0] != arr[1]){
            return arr[0] ;

        }else if(arr[n - 1] != arr[n - 2]){
            return arr[n - 1] ;

        }

        int lo = 0 ;
        int hi = arr.length - 1 ;

        while(lo <= hi){
            int mid = (lo + hi) / 2 ;
            if(arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]){
                return arr[mid] ;

            }else if(arr[mid] == arr[mid - 1]){
                int lc = mid - lo + 1 ;
                if(lc % 2 == 0){
                    lo = mid + 1 ;

                }else{
                    hi = mid - 2 ;

                }
            }else if(arr[mid] == arr[mid + 1]){
                int rc = hi - mid + 1 ;
                if(rc % 2 == 0){
                    hi = mid - 1 ;

                }else{
                    lo = mid + 2 ;
                }
            }
        }

        return -1 ;
        }
    
}