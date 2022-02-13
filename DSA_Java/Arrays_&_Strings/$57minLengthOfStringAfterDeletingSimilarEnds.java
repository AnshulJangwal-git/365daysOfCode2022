//Leetcode 1750 - https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/
// import java.util.* ;
class $57minLengthOfStringAfterDeletingSimilarEnds {
    public int minimumLength(String s) {
        int left = 0 ;
        int right = s.length() - 1 ;
        
        while(left < right && s.charAt(left) == s.charAt(right)){
            char ch = s.charAt(left) ;
            while(left < right && s.charAt(left) == ch){
                left ++ ;
            }
            
            while(left <= right && ch == s.charAt(right)){
                right -- ;
                
            }
        }
        return right - left + 1 ;
    }
}

// class Solution {
//     public int minimumLength(String s) {
//         if(s.charAt(0) != s.charAt(s.length() - 1)){
//             return s.length() ;
//         }else if(s.length() == 1){
//             return 1 ;
//         }else if(s.length() == 0){
//             return 0 ;
//         }
                
        
//         int i = 1 ;
//         int j = s.length() - 2 ;
        
//         while(i < j){
//             char stChar = s.charAt(i) ;
//             char endChar = s.charAt(j) ;
            
//             if(stChar == endChar){
//                 i++ ;
//                 j -- ;
                
//             }else if(stChar == s.charAt(i - 1)){
//                 i ++ ;
                
//             }else if(endChar == s.charAt(j + 1)){
//                 j -- ;
                
//             }else{
//                 break ;
//             }
//         }
//         if(i == j){
//             if(s.charAt(i - 1) != s.charAt(i) && s.charAt(j + 1) != s.charAt(j)){
//                 return 1 ;
//             }else{
//                 return 0 ;
//             } 
//         }
//         int len = j - i + 1 ;
//         return len ;
//     }
// }