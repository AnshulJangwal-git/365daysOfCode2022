import java.io.*;
import java.util.*;

public class $05getMazePathsWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;
        
        ArrayList<String> ans = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(ans) ;
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>() ;
            bres.add("") ;
            
            return bres ;
        }
        
        
        ArrayList<String> ans = new ArrayList<>() ;
        
        for(int csf = 1; csf <= dc - sc; csf ++){
            ArrayList<String> hpaths = getMazePaths(sr, sc + csf, dr, dc) ;
            for(String path : hpaths){
                ans.add("h" + csf + path) ;
            }
        }
        
        for(int csf = 1; csf <= dr - sr; csf ++){
            ArrayList<String> vpaths = getMazePaths(sr + csf, sc, dr, dc) ;
            for(String path : vpaths){
                ans.add("v" + csf + path) ;
            }
        }
        
        for(int csf = 1; csf <= dc - sc && csf <= dr - sr; csf ++){
            ArrayList<String> dpaths = getMazePaths(sr + csf, sc + csf, dr, dc) ;
            for(String path : dpaths){
                ans.add("d" + csf + path) ;
            }
        }
        
        
        return ans ;
    }

}

















