// Leetcode 856 - https://leetcode.com/problems/score-of-parentheses/
class $17scoreOfParentheses {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>() ;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                st.push(-1) ;
                
            }else{
                if(st.peek() == -1){
                    st.pop() ;
                    st.push(1) ;
                    
                }else{
                    int val = 0 ;
                    while(st.peek() != -1){
                        val += st.pop() ;
                    }
                    st.pop() ;
                    st.push(2 * val) ;
                }
            }
        }
        int val = 0 ;
        while(st.size() > 0){
            val += st.pop() ;
        }
        return val ;
    }
}


//Alternative Solution
class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        int score = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(score);
                score = 0;
            }
            else {
                score = st.pop() + Math.max(2 * score, 1);
            }
        }
        return score;
    }
}
