// Leetcode 921 - https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
class $15minAddTomakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>() ;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            if(ch == '('){
                st.push(ch) ;
                
            }else if(ch == ')'){
                if(st.size() == 0){
                    st.push(ch) ;
                    
                }else if(st.peek() == ')'){
                    st.push(ch) ;
                    
                }else if(st.peek() == '('){
                    st.pop() ;
                }else{
                    //nothing to do
                }
            }
        }
        return st.size() ;
    }
}

//Optimized Approach - O(n) time and O(1) Space
class Solution {
    public int minAddToMakeValid2(String s) {
        int openingCount = 0 ;
        int invalidCount = 0 ; 
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            if(ch == '('){
                openingCount ++ ;
                
            }else if(ch == ')'){
                if(openingCount == 0){
                    invalidCount ++ ;
                }else{
                    openingCount -- ;
                }
            }else{
                //nothing to do
            }
        }
        return openingCount + invalidCount ;
    }
}
