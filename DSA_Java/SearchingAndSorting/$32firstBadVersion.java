
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class $32firstBadVersion {
        public int firstBadVersion(int n) {
            int v = -1 ;
            int lo = 1 ;
            int hi = n ;
            
            while(lo <= hi){
                int mid = lo + (hi - lo) / 2 ;
                if(isBadVersion(mid) == true){
                    v = mid ;
                    hi = mid - 1 ;
                    
                }else{
                    lo = mid + 1 ;
                    
                }
            }
            return v ;
        }
        public boolean isBadVersion(int version){
            //inbuilt fumction given in leetcode..
            return true ;
        }
    }
