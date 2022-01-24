import java.util.* ;

class $10nextGreaterElement3 {
    
    public int nextGreaterElement(int n) {
        String str = String.valueOf(n) ;
        char[] arr = str.toCharArray() ;
        
        int i = arr.length - 2 ;
        while(i >= 0 && arr[i] >= arr[i + 1]){
            i -- ;
        }
        
        if(i == -1){
            return -1 ;
        }
        
        int k = arr.length - 1 ;
        while(arr[i] >= arr[k]){
            k -- ;
        }
        
        //swap i and k
        char temp = arr[i] ;
        arr[i] = arr[k] ;
        arr[k] = temp ;
        
        StringBuilder sb = new StringBuilder() ;
        int j = 0 ;
        while(j <= i){
            sb.append(arr[j]) ;
            j ++ ;
        }
        
        j = arr.length - 1 ;
        while(j >= i + 1){
            sb.append(arr[j]) ;
            j -- ;
        }
        
        long ans = Long.parseLong(sb.toString());
        
        if (ans <= Integer.MAX_VALUE  && ans >= Integer.MIN_VALUE) {
            return (int) ans;
        }
        
        return -1 ;
    }
    
    
}
