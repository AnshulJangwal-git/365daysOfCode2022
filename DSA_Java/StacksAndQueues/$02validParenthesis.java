//Leetcode 20 - https://leetcode.com/problems/valid-parentheses/
class $02validParenthesis {
    public boolean isValid(String str) {
        Stack<Character> st = new Stack<>() ;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i) ;
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch) ;
                
            }else if(ch == ')'){
                boolean flag = handleBracket(st, '(') ;
                if(flag == false){
                    return false ;
                }
                
            }else if(ch == '}'){
                boolean flag = handleBracket(st, '{') ;
                if(!flag){
                    return false ;
                }
                
            }else if(ch == ']'){
                boolean flag = handleBracket(st, '[') ;
                if(!flag){
                    return false ;
                }
            }
        }
        if(st.size() != 0){
            return false ;
            
        }else{
            return true ;
        }
    }
    public boolean handleBracket(Stack<Character> st, char bracket){
        if(st.size() == 0){
            return false ;
            
        }else if(st.peek() != bracket){
            return false ;
            
        }else{
            st.pop() ;
        }
        return true ;
    }
    
}


// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {
//         Scanner sc = new Scanner(System.in) ;
//         String str = sc.nextLine() ;
        
//         Stack<Character> st = new Stack<>() ;
//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i) ;
            
//             if(ch == '(' || ch == '{' || ch == '['){
//                 st.push(ch) ;
                
//             }else if(ch == ')'){
//                 if(st.size() == 0){
//                     System.out.println(false) ;
//                     return ;
                    
//                 }else if(st.peek() != '('){
//                     System.out.println(false) ;
//                     return ;
                    
//                 }else{
//                     st.pop() ;
//                 }
                
//             }else if(ch == '}'){
//                 if(st.size() == 0){
//                     System.out.println(false) ;
//                     return ;
                    
//                 }else if(st.peek() != '{'){
//                     System.out.println(false) ;
//                     return ;
                    
//                 }else{
//                     st.pop() ;
                    
//                 }
//             }else if(ch == ']'){
//                 if(st.size() == 0){
//                     System.out.println(false) ;
//                     return ;
                    
//                 }else if(st.peek() != '['){
//                     System.out.println(false) ;
//                     return ;
                    
//                 }else{
//                     st.pop() ;
//                 }
//             }
//         }
//         if(st.size() != 0){
//             System.out.println(false) ;
            
//         }else{
//             System.out.println(true) ;
//         }
        
//     }

// }