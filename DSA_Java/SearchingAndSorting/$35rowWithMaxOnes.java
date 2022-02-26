class $35rowWithMaxOnes {
    int rowWithMax1s(int mat[][], int n, int m) {
        // code here
    int max = 0 ;
    int r = -1 ;

    for(int i = 0; i < mat.length; i++){
      int countOnes = binarySearch(mat, i) ;
      if(countOnes > max){
        max = countOnes ;
        r = i ;
      }

    }

    return r ;
    }
    public static int binarySearch(int[][] mat, int i){
        int lo = 0 ;
        int hi = mat[0].length - 1 ;
        int fi = -1 ;
    
        while(lo <= hi){
          int mid = (lo + hi) / 2 ;
          if(mat[i][mid] == 1){
            fi = mid ;
            hi = mid - 1 ;
    
          }else{
            lo = mid + 1 ;
    
          }
        }
        if(fi == -1){
            return 0 ;
        }
        
        int count = mat[0].length - fi ;
        return count ;
    }
}