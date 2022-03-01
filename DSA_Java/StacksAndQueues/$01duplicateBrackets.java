//Link - https://nados.io/question/duplicate-brackets

// import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.nextLine() ;
        
        Stack<Character> st = new Stack<>() ;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i) ;
            if(ch != ')'){
                st.push(ch) ;
                
            }else{
                if(st.peek() == '('){
                    System.out.println(true) ;
                    return ;
                    
                }else{
                    while(st.peek() != '('){
                        st.pop() ;
                    }
                    st.pop() ;
                }
            }
        }
        System.out.println(false) ;
    }

}
