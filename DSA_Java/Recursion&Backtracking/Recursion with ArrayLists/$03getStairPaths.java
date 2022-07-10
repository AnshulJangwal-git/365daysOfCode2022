
import java.io.*;
import java.util.*;

public class $03getStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        
        ArrayList<String> res = getStairPaths(n) ;
        System.out.println(res) ;
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n < 0){
            ArrayList<String> bres = new ArrayList<>() ;
            return bres ;
        }else if(n == 0){
            ArrayList<String> bres = new ArrayList<>() ;
            bres.add("") ;
            return bres ;
        }
        
        ArrayList<String> mres = new ArrayList<>() ;
        
        ArrayList<String> n1 = getStairPaths(n - 1) ;
        ArrayList<String> n2 = getStairPaths(n - 2) ;
        ArrayList<String> n3 = getStairPaths(n - 3) ;
        
        for(String res : n1){
            mres.add(1 + res) ;
        }
        
        for(String res : n2){
            mres.add(2 + res) ;
        }
        
        for(String res : n3){
            mres.add(3 + res) ;
        }
        
        return mres ;
        
    }

}