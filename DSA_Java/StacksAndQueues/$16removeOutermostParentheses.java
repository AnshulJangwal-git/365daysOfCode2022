// Leetcode 1021 - https://leetcode.com/problems/remove-outermost-parentheses/
class $16removeOutermostParentheses {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder() ;
        Stack<Character> st = new Stack<>() ;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            if(ch == '('){
                if(st.size() > 0){
                    sb.append(ch) ;
                    st.push(ch) ;
                    
                }else if(st.size() == 0){
                    st.push(ch) ;
                    
                }
            }else if(ch == ')'){
                if(st.size() > 0){
                    st.pop() ;
                    
                    if(st.size() != 0){
                        sb.append(ch) ;
                        
                    }
                }
            }
        }
        return sb.toString() ;
    }
}
