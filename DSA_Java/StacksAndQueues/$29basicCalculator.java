// Leetcode 224 - https://leetcode.com/problems/basic-calculator/

class $29basicCalculator {
    public int calculate(String s) {
        int sum = 0 ;
        int sign = 1 ;
        
        Stack<Integer> st = new Stack<>() ;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            if(Character.isDigit(ch)){
                int val = 0 ;
                while(i < s.length() && Character.isDigit(s.charAt(i))){
                    val = val * 10 + (s.charAt(i) - '0') ;
                    i ++ ;
                }
                i -- ;
                val *= sign ;
                sign = 1 ;
                sum += val ;
                
            }else if(ch == '('){
                st.push(sum) ;
                st.push(sign) ;
                sum = 0 ;
                sign = 1 ;
                
            }else if(ch == ')'){
                sum *= st.pop() ;
                sum = sum + st.pop() ;
                
            }else if(ch == '-'){
                sign = sign * -1 ;
                
            }
        }
        return sum ;
    }
}
