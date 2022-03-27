// Link - https://nados.io/question/basic-calculator-iii
import java.io.*;
import java.util.*;

public class $31basicCalculator3 {
    
  public static int calculate(String s) {
    Stack<Integer> st = new Stack<>() ;
    Stack<Pair> stP = new Stack<>() ;
    
    char sign = '+' ;
    for(int i = 0; i < s.length(); i++){
        char ch = s.charAt(i) ;
        if(Character.isDigit(ch)){
            int val = 0 ;
            while(i < s.length() && Character.isDigit(s.charAt(i))){
                val = val * 10 + (s.charAt(i) - '0') ;
                i ++ ;
            }
            i -- ;
            cal(st, val, sign) ;
            
        }else if(ch == '('){
            stP.push(new Pair(st, sign)) ;
            st = new Stack<>() ;
            sign = '+' ;
            
        }else if(ch == ')'){
            int val = 0 ;
            while(!st.isEmpty()){
                val += st.pop() ;
            }
            Pair p = stP.pop() ;
            
            st = p.st ;
            sign = p.sign ;
            cal(st, val, sign) ;
            
        }else if(ch != ' '){
            sign = ch ;
        }
    }
    
    int sum = 0 ;
    while(st.size() > 0){
        sum += st.pop() ;
    }
    return sum ;
  }
  
  
  static void cal(Stack<Integer> st, int val, char sign){
      if(sign == '+'){
          st.push(val) ;
          
      }else if(sign == '-'){
          st.push(val * -1) ;
          
      }else if(sign == '*'){
          int a = st.pop() ;
          int ans = a * val ;
          st.push(ans) ;
          
      }else if(sign == '/'){
          int a = st.pop() ;
          int ans = a / val ;
          st.push(ans) ;
      }
  }
  
  static class Pair{
      Stack<Integer> st ;
      char sign ;
      
      Pair(Stack<Integer> st, char sign){
          this.st = st ;
          this.sign = sign ;
      }
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    int result = calculate(read.readLine());
    System.out.println(result);

  }
}

