
import java.io.*;
import java.util.*;

public class $02getKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next() ;
        ArrayList<String> res = getKPC(str) ;
        System.out.println(res) ;
        
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
    

    public static ArrayList<String> getKPC(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>() ;
            bres.add("") ;
            return bres ;
            
        }
        
        
        char ch = str.charAt(0) ;
        String ros = str.substring(1) ;
        
        ArrayList<String> rres = getKPC(ros) ;
        ArrayList<String> mres = new ArrayList<>() ;
        
        String code = keys[ch - '0'] ;
        for(int i = 0; i < code.length(); i++){
            char codeChar = code.charAt(i) ;
            for(String res : rres){
                mres.add(codeChar + res) ;
            }
        }
        return mres ;
    }

}