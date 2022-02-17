//Leetcode - https://leetcode.com/problems/search-a-2d-matrix/
class $04SearchInA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = binarySearchForRow(matrix, target) ;
        if(r == -1){
            return false ;
        }
        
        boolean isFound = binarySearch(matrix, target, r) ;
        return isFound ;
    }
    
    public static int binarySearchForRow(int[][] matrix, int target){
        int lo = 0 ;
        int hi = matrix.length - 1 ;
        int lc = matrix[0].length - 1 ;
        
        while(lo <= hi){
            int mid = (lo + hi) / 2 ;
            if(matrix[mid][0] <= target && matrix[mid][lc] >= target){
                return mid ;
                
            }else if(matrix[mid][0] < target){
                lo = mid + 1 ;
                
            }else if(matrix[mid][0] > target){
                hi = mid - 1 ;
                
            }
        }
        return -1 ;
    }
    public static boolean binarySearch(int[][] matrix, int target, int r){
        int lo = 0 ;
        int hi = matrix[0].length - 1 ;
        
        while(lo <= hi){
            int mid = (lo + hi) / 2 ;
            if(matrix[r][mid] == target){
                return true ;
                
            }else if(matrix[r][mid] < target){
                lo = mid + 1 ;
                
            }else if(matrix[r][mid] > target){
                hi = mid - 1 ;
                
            }
        }
        return false ;
    }
}





