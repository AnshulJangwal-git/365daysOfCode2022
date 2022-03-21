// Leetcode 1249 - https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
class $19minimumRemoveTomakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> st = new Stack<>() ;
        StringBuilder  sb = new StringBuilder() ;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            
            if(ch == '('){
                st.push(ch) ;
                sb.append(ch) ;
                
            }else if(ch == ')'){
                if(st.size() != 0){
                    st.pop() ;
                    sb.append(ch) ;
                    
                }else{
                    continue ;
                }
                
            }else{
                sb.append(ch) ;
            }
        }
        int count = 0 ;
        while(st.size() > 0){
            st.pop() ;
            count ++ ;
        }
        
        for(int i = sb.length() - 1; i >= 0; i--){
            char ch = sb.charAt(i) ;
            if(ch == '(' && count != 0){
                sb.deleteCharAt(i) ;
                count -- ;
            }
        }        
        return sb.toString() ;
    }
}

// Alternative Solution
class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>() ;
        char[] chars = s.toCharArray() ;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            if(chars[i] == '('){
                st.push(i) ;
                
            }else if(chars[i] == ')'){
                if(st.size() == 0){
                    chars[i] = '.' ;
                    
                }else{
                    st.pop() ;
                }
            }
        }
        while(st.size() != 0){
            chars[st.pop()] = '.' ;
        }
        
        StringBuilder sb = new StringBuilder() ;
        for(char ch : chars){
            if(ch != '.'){
                sb.append(ch) ;
            }
        }
        return new String(sb) ;
    }
}
