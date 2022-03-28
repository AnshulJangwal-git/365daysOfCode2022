// Leetcode - https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
class $69valueOfVariableAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0 ;
        
        for(int i = 0; i < operations.length; i++){
            char ch = operations[i].charAt(1) ;
            if(ch == '+'){
                x += 1 ;
                
            }else if(ch == '-'){
                x -- ;
                
            }
        }
        return x ;
    }
}