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
