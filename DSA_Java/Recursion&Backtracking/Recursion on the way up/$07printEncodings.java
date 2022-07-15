import java.io.*;
import java.util.*;

public class $07printEncodings {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next() ;
        
        printEncodings(str, "") ;
    }

    public static void printEncodings(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf) ;
            return ;
            
        }else if(str.length() == 1){
            char ch = str.charAt(0) ;
            if(ch == '0'){
                return ;
                
            }else{
                int chv = ch - '0' ;
                char code = (char)('a' + chv - 1) ;
                System.out.println(asf + code) ; 
            }
        }else{
            char ch = str.charAt(0) ;
            String ros = str.substring(1) ;
            if(ch == '0'){
                return ;
                
            }else{
               int chv = ch - '0' ;
               char code = (char)('a' + chv - 1) ;
               printEncodings(ros, asf + code) ;
               
            }
            
            String ch12 = str.substring(0, 2) ;
            String ros12 = str.substring(2) ;
            
            int chv12 = Integer.parseInt(ch12) ;
            if(chv12 <= 26){
                char code = (char)('a' + chv12 - 1) ;
                printEncodings(ros12, asf + code) ;
            }
        }
    }

}