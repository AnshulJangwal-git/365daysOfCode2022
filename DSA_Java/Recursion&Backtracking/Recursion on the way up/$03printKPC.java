
import java.io.*;
import java.util.*;

public class $03printKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next() ;
        
        printKPC(str, "") ;
    }
    
    static String keys[] = {
        ".;" ,
        "abc" ,
        "def" ,
        "ghi" ,
        "jkl" ,
        "mno" ,
        "pqrs" ,
        "tu" ,
        "vwx" ,
        "yz"
        
    } ;
    

    public static void printKPC(String str, String asf) {
        if(str.length() == 0){
            System.out.println(asf) ;
            return ;
        }
        
        char ch = str.charAt(0) ;
        String ros = str.substring(1) ;
        
        String codes = keys[ch - '0'] ;
        for(int i = 0; i < codes.length(); i++){
            char codeChar = codes.charAt(i) ;
            printKPC(ros, asf + codeChar) ;
        }
    }

}







