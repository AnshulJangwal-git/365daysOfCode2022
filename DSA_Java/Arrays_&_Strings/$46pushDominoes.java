//Leetcode 838 - https://leetcode.com/problems/push-dominoes/
class $46pushDominoes {
    public String pushDominoes(String str) {
        int n = str.length() ;
        char[] arr = new char[n + 2] ;
        
        arr[0] = 'L' ;
        arr[n + 1] = 'R' ;
        
        for(int i = 1; i < arr.length - 1; i++){
            arr[i] = str.charAt(i - 1) ;
        }
        
        int j = 0 ;
        int k = 1 ;
        
        while(k < arr.length){
            while(arr[k] == '.'){
                k ++ ;
            }
            
            if(k - j > 1){
                solveConfiguration(arr, j, k) ;
            }
            
            j = k ;
            k ++ ;
        }
        StringBuilder res = new StringBuilder() ;
        for(int i = 1; i < arr.length - 1; i++){
            res.append(arr[i]) ;
        }
        
        return res.toString() ;
      }
      
      public void solveConfiguration(char[] arr, int j, int k){
        if(arr[j] == 'L' && arr[k] == 'L'){
            for(int i = j + 1; i < k; i++){
                arr[i] = 'L' ;
            }
        }else if(arr[j] == 'R' && arr[k] == 'R'){
            for(int i = j + 1; i < k; i++){
                arr[i] = 'R' ;
            }
            
        }else if(arr[j] == 'L' && arr[k] == 'R'){
            //nothing to do
            
        }else{
            int diff = k - j ;
            int mid = (j + k) / 2 ;
            
            if(diff % 2 == 0){
                //odd dots
                for(int i = j + 1; i < mid; i++){
                    arr[i] = 'R' ;
                }
                for(int i = mid + 1; i < k; i++){
                    arr[i] = 'L' ;
                }
            }else{
                //even dots
                for(int i = j + 1; i <= mid; i++){
                    arr[i] = 'R' ;
                }
                for(int i = mid + 1; i < k; i++){
                    arr[i] = 'L' ;
                }
            }
        }
      }
    }