import java.io.*;
import java.util.*;

public class $04getMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;
        
        ArrayList<String> res = getMazePaths(0, 0, n - 1, m - 1) ;
        System.out.println(res) ;
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr > dr || sc > dc){
            ArrayList<String> bres = new ArrayList<>() ;
            return bres ;
            
        }else if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>() ;
            bres.add("") ;
            return bres ;
        }
        
        
        ArrayList<String> hpaths = getMazePaths(sr, sc + 1, dr, dc) ;
        ArrayList<String> vpaths = getMazePaths(sr + 1, sc, dr, dc) ;
        
        ArrayList<String> paths = new ArrayList<>() ;
        
        for(String hpath : hpaths){
            paths.add("h" + hpath) ;
        }
        
        for(String vpath : vpaths){
            paths.add("v" + vpath) ;
        }
        
        return paths ;
    }

}