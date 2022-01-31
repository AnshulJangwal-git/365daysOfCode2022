//Leetcode 48 - https://leetcode.com/problems/rotate-image/
class $31rotateImage {
    public void rotate(int[][] matrix) {
        transpose(matrix) ;
        reverseEachRow(matrix) ;
    }
    
    public void transpose(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i] ;
                arr[j][i] = temp ;
            }
        }
    }
    
    public static void reverseEachRow(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            int left = 0 ;
            int right = arr[0].length - 1 ;
            
            while(left <= right){
                int temp = arr[i][left] ;
                arr[i][left] = arr[i][right] ;
                arr[i][right] = temp ;
                
                left ++ ;
                right -- ;
            }
        }
    }
    
    
}
