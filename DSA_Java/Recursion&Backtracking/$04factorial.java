import java.io.*;
import java.util.*;

public class $04factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int fn = factorial(n) ;
        System.out.println(fn) ;
    }

    public static int factorial(int n){
        if(n == 0) return 1 ;
        
        int fn1 = factorial(n - 1) ;
        int fn = n * fn1 ;
        
        return fn ;
    }
}