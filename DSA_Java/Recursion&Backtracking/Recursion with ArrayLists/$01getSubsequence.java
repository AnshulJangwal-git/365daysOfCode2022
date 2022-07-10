import java.io.*;
import java.util.*;

public class $01getSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next() ;
        
        ArrayList<String> res = gss(str) ;
        System.out.println(res) ;
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>() ;
            bres.add("") ;
            return bres ;
        }
        
        char ch = str.charAt(0) ;
        String ros = str.substring(1) ;
        
        ArrayList<String> rres = gss(ros) ;
        ArrayList<String> mres = new ArrayList<>() ;
        
        for(String res : rres){
            mres.add("" + res) ;
        }
        
        for(String res : rres){
            mres.add(ch + res) ;
        }
        
        
        return mres ;
    }

}