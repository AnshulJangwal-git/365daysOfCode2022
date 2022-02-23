//Link - https://practice.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1/#

class $21AllocateMinNumberOfPages 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        int ans = 0 ;
        int sum = 0 ;
        int max = Integer.MIN_VALUE ;
        
        for(int val : A){
            sum += val ;
            max = Math.max(val, max) ;
        }
        
        int lo = max ;
        int hi = sum ;
        
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(isPossible(A, mid, M) == true){
                ans = mid ;
                hi = mid - 1 ;
                
            }else{
                lo = mid + 1 ;
                
            }
        }
        return ans ;
    }
    public static boolean isPossible(int[] arr, int mid, int m){
        int st = 1 ;
        int sum = 0 ;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i] ;
            
            if(sum > mid){
                st ++ ;
                sum = arr[i] ;
            }
        }
        return st <= m ;
    }
}