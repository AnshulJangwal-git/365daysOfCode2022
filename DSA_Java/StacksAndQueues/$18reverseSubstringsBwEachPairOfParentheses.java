// Leetcode 1190 - https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/
class $18reverseSubstringsBwEachPairOfParentheses {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>() ;
        
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            
            if(ch == ')'){
                Queue<Character> que = new LinkedList<>() ;
                while(st.peek() != '('){
                    que.add(st.pop()) ;
                }
                st.pop() ;
                while(que.size() > 0){
                    st.push(que.remove()) ;
                }
                
            }else{
                st.push(ch) ;
                
            }
        }
        char[] ans = new char[st.size()] ;
        for(int i = ans.length - 1; i >= 0; i--){
            ans[i] = st.pop() ;
        }
        
        return new String(ans) ;
    }
}
