//Link - https://leetcode.com/problems/transpose-matrix/
class $28transposeOfMatrix {
    public int[][] transpose(int[][] matrix) {
        int[][] res = new int[matrix[0].length][matrix.length] ;
        
        for(int i = 0; i < res.length; i++){
            for(int j = 0; j < res[0].length; j++){
                res[i][j] = matrix[j][i] ;
            }
        }
        
        return res ;
    }
    
}